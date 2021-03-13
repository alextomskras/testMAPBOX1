package com.dreamer.testmapbox1.data

import com.mapbox.geojson.Point

class trek4 {

    public var trek4Coord: List<Point>? = null

    public fun initTrekCoordinates(): ArrayList<Point> {
        trek4Coord = ArrayList()


        val trek4Coord = ArrayList(listOf<Point>(
                Point.fromLngLat(92.304290793836117, 55.951570048928261),
                Point.fromLngLat(92.304386263713241, 55.951755959540606),
                Point.fromLngLat(92.30469505302608, 55.952005153521895),
                Point.fromLngLat(92.306941654533148, 55.953738195821643),
                Point.fromLngLat(92.307351529598236, 55.954114375635982),
                Point.fromLngLat(92.307554539293051, 55.954303219914436),
                Point.fromLngLat(92.308166921138763, 55.954808732494712),
                Point.fromLngLat(92.308372864499688, 55.954997492954135),
                Point.fromLngLat(92.309081051498652, 55.955571318045259),
                Point.fromLngLat(92.309591844677925, 55.956139024347067),
                Point.fromLngLat(92.309790160506964, 55.956331472843885),
                Point.fromLngLat(92.310282932594419, 55.956722488626838),
                Point.fromLngLat(92.310686269775033, 55.957230515778065),
                Point.fromLngLat(92.311482969671488, 55.957945492118597),
                Point.fromLngLat(92.311782371252775, 55.958206756040454),
                Point.fromLngLat(92.312179086729884, 55.958474641665816),
                Point.fromLngLat(92.31302373111248, 55.958870016038418),
                Point.fromLngLat(92.313601579517126, 55.959175871685147),
                Point.fromLngLat(92.314021177589893, 55.959561439231038),
                Point.fromLngLat(92.314121341332793, 55.959628913551569),
                Point.fromLngLat(92.31462056748569, 55.959843909367919),
                Point.fromLngLat(92.315126080065966, 55.960306003689766),
                Point.fromLngLat(92.315226914361119, 55.960373980924487),
                Point.fromLngLat(92.315835440531373, 55.960905896499753),
                Point.fromLngLat(92.315938957035542, 55.961097590625286),
                Point.fromLngLat(92.316439943388104, 55.961629673838615),
                Point.fromLngLat(92.316586207598448, 55.962044410407543),
                Point.fromLngLat(92.317196493968368, 55.962584372609854),
                Point.fromLngLat(92.317967712879181, 55.962977735325694),
                Point.fromLngLat(92.318424778059125, 55.96297949552536),
                Point.fromLngLat(92.318761143833399, 55.963046886026859),
                Point.fromLngLat(92.320357728749514, 55.963431196287274),
                Point.fromLngLat(92.321393899619579, 55.963806957006454),
                Point.fromLngLat(92.322410624474287, 55.964132091030478),
                Point.fromLngLat(92.32338510453701, 55.964423278346658),
                Point.fromLngLat(92.323610158637166, 55.96448983065784),
                Point.fromLngLat(92.324539124965668, 55.964987548068166),
                Point.fromLngLat(92.325200876221061, 55.965197347104549),
                Point.fromLngLat(92.326168231666088, 55.965627757832408),
                Point.fromLngLat(92.326274598017335, 55.96576077863574),
                Point.fromLngLat(92.326259175315499, 55.966276349499822),
                Point.fromLngLat(92.326029930263758, 55.96658949740231),
                Point.fromLngLat(92.325689541175961, 55.966962156817317),
                Point.fromLngLat(92.325068190693855, 55.967373372986913),
                Point.fromLngLat(92.324564019218087, 55.967783583328128),
                Point.fromLngLat(92.324550189077854, 55.967920627444983),
                Point.fromLngLat(92.324047274887562, 55.968330083414912),
                Point.fromLngLat(92.32342760078609, 55.968866357579827),
                Point.fromLngLat(92.323057791218162, 55.969136003404856),
                Point.fromLngLat(92.322312388569117, 55.969743020832539),
                Point.fromLngLat(92.321453243494034, 55.970220873132348),
                Point.fromLngLat(92.320847399532795, 55.970492362976074),
                Point.fromLngLat(92.320354711264372, 55.970893437042832),
                Point.fromLngLat(92.319847187027335, 55.971369696781039),
                Point.fromLngLat(92.319378554821014, 55.971752163022757),
                Point.fromLngLat(92.319148639217019, 55.971876382827759),
                Point.fromLngLat(92.318777404725552, 55.972274020314217),
                Point.fromLngLat(92.318949736654758, 55.97264114767313),
                Point.fromLngLat(92.319020060822368, 55.972997462376952),
                Point.fromLngLat(92.318032756447792, 55.973738757893443),
                Point.fromLngLat(92.318027224391699, 55.973807070404291),
                Point.fromLngLat(92.318114563822746, 55.974151063710451),
                Point.fromLngLat(92.318104673177004, 55.974415009841323),
                Point.fromLngLat(92.318654526025057, 55.974958743900061),
                Point.fromLngLat(92.319099018350244, 55.975301396101713),
                Point.fromLngLat(92.319893538951874, 55.975583950057626),
                Point.fromLngLat(92.320238621905446, 55.975719653069973),
                Point.fromLngLat(92.320704907178879, 55.97585242241621),
                Point.fromLngLat(92.321716351434588, 55.976043697446585),
                Point.fromLngLat(92.322682365775108, 55.976274870336056),
                Point.fromLngLat(92.323023928329349, 55.976413758471608),
                Point.fromLngLat(92.323438664898276, 55.976789854466915),
                Point.fromLngLat(92.323912074789405, 55.977423191070557),
                Point.fromLngLat(92.324151210486889, 55.977420089766383),
                Point.fromLngLat(92.325465911999345, 55.977403158321977),
                Point.fromLngLat(92.32586438767612, 55.977225629612803),
                Point.fromLngLat(92.327381512150168, 55.977371726185083),
                Point.fromLngLat(92.328440062701702, 55.977631565183401),
                Point.fromLngLat(92.329627778381109, 55.977813117206097),
                Point.fromLngLat(92.330810213461518, 55.977936331182718),
                Point.fromLngLat(92.331640189513564, 55.977929458022118),
                Point.fromLngLat(92.332241171970963, 55.977784786373377),
                Point.fromLngLat(92.333188662305474, 55.977776991203427),
                Point.fromLngLat(92.334023248404264, 55.977633241564035),
                Point.fromLngLat(92.334968894720078, 55.977562833577394),
                Point.fromLngLat(92.335671884939075, 55.977695435285568),
                Point.fromLngLat(92.337075350806117, 55.978029705584049),
                Point.fromLngLat(92.338598174974322, 55.978043368086219),
                Point.fromLngLat(92.339535774663091, 55.978051833808422),
                Point.fromLngLat(92.340365499258041, 55.977976815775037),
                Point.fromLngLat(92.341108554974198, 55.977514805272222),
                Point.fromLngLat(92.341869380325079, 55.976944752037525),
                Point.fromLngLat(92.342226281762123, 55.97680477425456),
                Point.fromLngLat(92.344713108614087, 55.976345362141728),
                Point.fromLngLat(92.345072776079178, 55.976193314418197),
                Point.fromLngLat(92.346039544790983, 55.975653938949108),
                Point.fromLngLat(92.346517816185951, 55.975426202639937),
                Point.fromLngLat(92.347346115857363, 55.975126717239618),
                Point.fromLngLat(92.347695305943489, 55.975123029202223),
                Point.fromLngLat(92.347930334508419, 55.975049939006567),
                Point.fromLngLat(92.35060902312398, 55.974559262394905),
                Point.fromLngLat(92.352114664390683, 55.974432025104761),
                Point.fromLngLat(92.352344999089837, 55.97443931736052),
                Point.fromLngLat(92.35303751192987, 55.974641488865018),
                Point.fromLngLat(92.353268517181277, 55.974833015352488),
                Point.fromLngLat(92.353963209316134, 55.975083466619253),
                Point.fromLngLat(92.355469269677997, 55.975383706390858),
                Point.fromLngLat(92.356395302340388, 55.975622506812215),
                Point.fromLngLat(92.35685764811933, 55.975700207054615),
                Point.fromLngLat(92.358825132250786, 55.976096168160439),
                Point.fromLngLat(92.359403315931559, 55.976277971640229),
                Point.fromLngLat(92.360791610553861, 55.976786334067583),
                Point.fromLngLat(92.36171705648303, 55.977166956290603),
                Point.fromLngLat(92.362179402261972, 55.977289415895939),
                Point.fromLngLat(92.363687055185437, 55.977626452222466),
                Point.fromLngLat(92.364035323262215, 55.977759137749672),
                Point.fromLngLat(92.365198060870171, 55.978356264531612),
                Point.fromLngLat(92.365774903446436, 55.978727247565985),
                Point.fromLngLat(92.366123925894499, 55.979244746267796),
                Point.fromLngLat(92.366360211744905, 55.979583961889148),
                Point.fromLngLat(92.367064459249377, 55.980321485549212),
                Point.fromLngLat(92.367536025121808, 55.980861783027649),
                Point.fromLngLat(92.367887897416949, 55.981194460764527),
                Point.fromLngLat(92.368239853531122, 55.981526635587215),
                Point.fromLngLat(92.368594324216247, 55.981931481510401),
                Point.fromLngLat(92.369536031037569, 55.982672944664955),
                Point.fromLngLat(92.369656143710017, 55.982942087575793),
                Point.fromLngLat(92.369777765125036, 55.98328004591167),
                Point.fromLngLat(92.370128212496638, 55.983538879081607),
                Point.fromLngLat(92.370707234367728, 55.98371833562851),
                Point.fromLngLat(92.372200302779675, 55.983717497438192),
                Point.fromLngLat(92.372430972754955, 55.983775416389108),
                Point.fromLngLat(92.373148379847407, 55.984340021386743),
                Point.fromLngLat(92.373492540791631, 55.984453177079558),
                Point.fromLngLat(92.374178096652031, 55.984290735796094),
                Point.fromLngLat(92.374289324507117, 55.984213538467884),
                Point.fromLngLat(92.376733152195811, 55.983385574072599),
                Point.fromLngLat(92.377298511564732, 55.983294965699315),
                Point.fromLngLat(92.377510741353035, 55.98287545144558),
                Point.fromLngLat(92.377607803791761, 55.982457948848605),
                Point.fromLngLat(92.37795028835535, 55.982071543112397),
                Point.fromLngLat(92.378181628882885, 55.981883285567164),
                Point.fromLngLat(92.37852880731225, 55.981632834300399),
                Point.fromLngLat(92.379106404259801, 55.981192449107766),
                Point.fromLngLat(92.379324836656451, 55.98091752268374),
                Point.fromLngLat(92.379422904923558, 55.980444699525833),
                Point.fromLngLat(92.379534132778645, 55.980311678722501),
                Point.fromLngLat(92.379866978153586, 55.979848494753242),
                Point.fromLngLat(92.380089098587632, 55.979582788422704),
                Point.fromLngLat(92.380085494369268, 55.979261677712202),
                Point.fromLngLat(92.380081890150905, 55.9789405670017),
                Point.fromLngLat(92.381207747384906, 55.97915505990386),
                Point.fromLngLat(92.381550315767527, 55.979655459523201),
                Point.fromLngLat(92.381551070138812, 55.979719664901495),
                Point.fromLngLat(92.381784757599235, 55.98016650415957),
                Point.fromLngLat(92.382021714001894, 55.980429779738188),
        ))


        return trek4Coord as ArrayList<Point>
    }
}