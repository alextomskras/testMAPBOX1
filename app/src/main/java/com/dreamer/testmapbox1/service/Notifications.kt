package com.dreamer.testmapbox1.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.dreamer.testmapbox1.ui.LoginActivity
import com.dreamer.testmapbox1.R


class Notifications {

    val CHANNELSTRING = "TTTTTT"

    val NOTIFIYTAG = "new request"
    fun Notify(context: Context, message: String, number: Int) {
        val intent = Intent(context, LoginActivity::class.java)
        val channelId = CHANNELSTRING

        val builder = NotificationCompat.Builder(context)
            .setDefaults(Notification.DEFAULT_ALL)
            .setContentTitle("New request")
            .setContentText(message)
            .setNumber(number)
            .setSmallIcon(R.drawable.ic_fire_emoji)
            .setContentIntent(
                PendingIntent.getActivity(
                    context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                )
            )
            .setAutoCancel(true)

        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR) {
            nm.notify(NOTIFIYTAG, 0, builder.build())
        } else {
            nm.notify(NOTIFIYTAG.hashCode(), builder.build())
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Channel human readable title",
                NotificationManager.IMPORTANCE_HIGH
            )
            nm.createNotificationChannel(channel)
        }
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            // Create the NotificationChannel
//            val name = R.string.fcm_message.toString()
//            val descriptionText = R.string.fcm_message.toString()
//            val importance = NotificationManager.IMPORTANCE_DEFAULT
//            val mChannel = NotificationChannel(0.toString(), name, importance)
//            mChannel.description = descriptionText
//            // Register the channel with the system; you can't change the importance
//            // or other notification behaviors after this
//            val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//            notificationManager.createNotificationChannel(mChannel)
//        }

        nm.notify(NOTIFIYTAG, 0 /* ID of notification */, builder.build())

    }

}
