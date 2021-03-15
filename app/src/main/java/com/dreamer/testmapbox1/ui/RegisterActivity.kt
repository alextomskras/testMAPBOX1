package com.dreamer.testmapbox1.ui

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import com.dreamer.testmapbox1.databinding.ActivityRegisterBinding
import com.dreamer.testmapbox1.model.User
import com.dreamer.testmapbox1.service.MyFirebaseMessagingService
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.storage.FirebaseStorage

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class RegisterActivity() : AppCompatActivity() {

    companion object {
        val TAG = "RegisterActivity"

    }

    private lateinit var binding: ActivityRegisterBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_register)

        binding.registerProgressBar.scaleY = 4f
        binding.registerProgressBar.visibility = View.INVISIBLE

        binding.registerButtonRegister.setOnClickListener {
            binding.registerProgressBar.visibility = View.VISIBLE
            performRegister()
        }

        binding.alreadyHaveAccauntTextView.setOnClickListener {
            Log.d(TAG, "Try to show LoginActivity activity")

            // launch the LoginActivity activity somehow
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)
            finish()
        }

        binding.selectPhotoButtonRegister.setOnClickListener {
            Log.d(TAG, "Try to show photo selector")

            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, 0)

        }

    }

    var selectedPhotoUri: Uri? = null

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 0 && resultCode == Activity.RESULT_OK && data != null) {
            // proceed and check what the selected image was....
            Log.d(TAG, "Photo was selected")

            selectedPhotoUri = data.data

            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedPhotoUri)

            binding.selectPhotoviewRegister.setImageBitmap(bitmap)

            binding.selectPhotoButtonRegister.alpha = 0f

//      val bitmapDrawable = BitmapDrawable(bitmap)
//      selectphoto_button_register.setBackgroundDrawable(bitmapDrawable)
        }
    }

    private fun performRegister() {
        val email = binding.emailEdittextRegister.text.toString().trim()
        val password = binding.passwordEdittextRegister.text.toString().trim()

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please enter text in email/pw", Toast.LENGTH_SHORT).show()
            return
        }

        Log.d(TAG, "Attempting to create user with email: $email")

        // Firebase Authentication to create a user with email and password
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (!it.isSuccessful) return@addOnCompleteListener

                // else if successful
                Log.d(TAG, "Successfully created user with uid: ${it.result!!.user?.uid}")

                uploadImageToFirebaseStorage()
            }
            .addOnFailureListener {
                binding.registerProgressBar.visibility = View.GONE
                Log.d(TAG, "Failed to create user: ${it.message}")
                Toast.makeText(this, "Failed to create user: ${it.message}", Toast.LENGTH_SHORT)
                    .show()
            }
    }

    private fun uploadImageToFirebaseStorage() {
        if (selectedPhotoUri == null) return

        val filename = UUID.randomUUID().toString()
        val ref = FirebaseStorage.getInstance().getReference("/images/$filename")
        GlobalScope.launch(Dispatchers.IO) {
            ref.putFile(selectedPhotoUri!!)
                .addOnSuccessListener {
                    Log.d(TAG, "Successfully uploaded image: ${it.metadata?.path}")

                    ref.downloadUrl.addOnSuccessListener {
                        Log.d(TAG, "File Location: $it")

                        saveUserToFirebaseDatabase(it.toString())
                    }
                }
                .addOnFailureListener {
                    binding.registerProgressBar.visibility = View.GONE
                    Log.d(TAG, "Failed to upload image to storage: ${it.message}")
                }
        }
    }

    private fun saveUserToFirebaseDatabase(profileImageUrl: String) {
        val email = binding.emailEdittextRegister.text.toString().trim()
        val stripEmail = SplitString(email)
        val Request = ""

        val uid = FirebaseAuth.getInstance().uid ?: ""

        val ref = FirebaseDatabase.getInstance().getReference("/users/$stripEmail")
//        refreshTokens()
        val newTokens = refreshTokens().toString()


        val user = User(
            uid,
            Request,
            binding.usernameEdittextRegister.text.toString(),
            profileImageUrl,
            newTokens
        )

        ref.setValue(user)
            .addOnSuccessListener {
                Log.d(TAG, "Finally we saved the user to Firebase Database")

                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("email", email.toString().trim())
                Log.d(TAG, "putExtraEmail: $email")
                intent.putExtra("uid", uid)
                Log.d(TAG, "putExtraUid: ${uid}")
                intent.flags =
                    Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK.or(Intent.FLAG_ACTIVITY_CLEAR_TOP))
//                refreshTokens()
                binding.registerProgressBar.visibility = View.GONE
                startActivity(intent)
                finish()

            }
            .addOnFailureListener {
                binding.registerProgressBar.visibility = View.GONE
                Log.d(TAG, "Failed to set value to database: ${it.message}")
            }
    }

    fun SplitString(str: String): String {
        var split = str.split("@")
        return split[0]
    }

    private fun refreshTokens(): String? {
        val newToken = FirebaseInstanceId.getInstance().token
        //view our firebase tokens
        Log.d("newToken", (newToken))

//        Toast.makeText(this, "Please fill out $newToken", Toast.LENGTH_SHORT).show()


        if (newToken != null) {
            GlobalScope.launch(Dispatchers.IO) {
                MyFirebaseMessagingService().saveTokenToFirebaseDatabase(newToken)
            }
        }
        return newToken
    }


}