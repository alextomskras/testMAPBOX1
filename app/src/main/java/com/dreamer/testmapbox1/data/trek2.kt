package com.dreamer.testmapbox1.data

import android.util.Log
import com.mapbox.geojson.Point

class trek2 {

//    public var trek2Coord: List<Point>? = null

    public fun initTrekCoordinates(): ArrayList<Point> {
//        trek2Coord = ArrayList()
        val trek2Coord = ArrayList(listOf<Point>(
                Point.fromLngLat(92.882611099630594, 55.974117117002606),
                Point.fromLngLat(92.882391829043627, 55.973667930811644),
                Point.fromLngLat(92.882501464337111, 55.973218744620681),
                Point.fromLngLat(92.88326907902956, 55.972589934244752),
                Point.fromLngLat(92.88326907902956, 55.972095904871821),
                Point.fromLngLat(92.883488433435559, 55.971646718680859),
                Point.fromLngLat(92.883598068729043, 55.971197532489896),
                Point.fromLngLat(92.883323896676302, 55.970793273299932),
                Point.fromLngLat(92.882282109931111, 55.970523795112967),
                Point.fromLngLat(92.881130687892437, 55.970658576115966),
                Point.fromLngLat(92.880033999681473, 55.970658576115966),
                Point.fromLngLat(92.87893739528954, 55.97043402493),
                Point.fromLngLat(92.878608405590057, 55.970074692741036),
                Point.fromLngLat(92.8784438688308, 55.969625506550074),
                Point.fromLngLat(92.878279415890574, 55.969176320359111),
                Point.fromLngLat(92.878005243837833, 55.968772061169147),
                Point.fromLngLat(92.877785889431834, 55.968322958797216),
                Point.fromLngLat(92.877511717379093, 55.967918699607253),
                Point.fromLngLat(92.878553587943316, 55.967604294419289),
                Point.fromLngLat(92.879156665876508, 55.967020411044359),
                Point.fromLngLat(92.879211567342281, 55.966571224853396),
                Point.fromLngLat(92.879266384989023, 55.966122038662434),
                Point.fromLngLat(92.879266384989023, 55.965628009289503),
                Point.fromLngLat(92.878992212936282, 55.96522375009954),
                Point.fromLngLat(92.878553587943316, 55.964909344911575),
                Point.fromLngLat(92.878279415890574, 55.964505085721612),
                Point.fromLngLat(92.878224598243833, 55.964055983349681),
                Point.fromLngLat(92.878224598243833, 55.963606797158718),
                Point.fromLngLat(92.878224598243833, 55.963157610967755),
                Point.fromLngLat(92.87789560854435, 55.962753351777792),
                Point.fromLngLat(92.877511717379093, 55.96239410340786),
                Point.fromLngLat(92.877073092386127, 55.962034771218896),
                Point.fromLngLat(92.876744102686644, 55.961675439029932),
                Point.fromLngLat(92.876305477693677, 55.961405877023935),
                Point.fromLngLat(92.875866768881679, 55.961091471835971),
                Point.fromLngLat(92.875592596828938, 55.960687296465039),
                Point.fromLngLat(92.875428143888712, 55.960238110274076),
                Point.fromLngLat(92.87537332624197, 55.959788924083114),
                Point.fromLngLat(92.87537332624197, 55.959294894710183),
                Point.fromLngLat(92.87537332624197, 55.95884570851922),
                Point.fromLngLat(92.875428143888712, 55.958396522328258),
                Point.fromLngLat(92.875482961535454, 55.957947419956326),
                Point.fromLngLat(92.875537779182196, 55.957498233765364),
                Point.fromLngLat(92.875537779182196, 55.957004204392433),
                Point.fromLngLat(92.875537779182196, 55.95655501820147),
                Point.fromLngLat(92.875537779182196, 55.956105832010508),
                Point.fromLngLat(92.875537779182196, 55.955611802637577),
                Point.fromLngLat(92.87537332624197, 55.955162616446614),
                Point.fromLngLat(92.875208789482713, 55.954713430255651),
                Point.fromLngLat(92.875044336542487, 55.95426432788372),
                Point.fromLngLat(92.87487979978323, 55.953815141692758),
                Point.fromLngLat(92.874715346843004, 55.953365955501795),
                Point.fromLngLat(92.874386357143521, 55.952961780130863),
                Point.fromLngLat(92.873892830684781, 55.952692218124866),
                Point.fromLngLat(92.872741324827075, 55.9525125939399),
                Point.fromLngLat(92.871644720435143, 55.9525575209409),
                Point.fromLngLat(92.870712568983436, 55.952018480747938),
                Point.fromLngLat(92.869615964591503, 55.951749002560973),
                Point.fromLngLat(92.86879344843328, 55.951165119186044),
                Point.fromLngLat(92.868464458733797, 55.95076085999608),
                Point.fromLngLat(92.868245104327798, 55.950311757624149),
                Point.fromLngLat(92.867861296981573, 55.949952425435185),
                Point.fromLngLat(92.867422671988606, 55.949638020247221),
                Point.fromLngLat(92.866983963176608, 55.949323615059257),
                Point.fromLngLat(92.865887358784676, 55.949548166245222),
                Point.fromLngLat(92.864790754392743, 55.949682863429189),
                Point.fromLngLat(92.863694066181779, 55.949907498434186),
                Point.fromLngLat(92.862597461789846, 55.949997352436185),
                Point.fromLngLat(92.861500773578882, 55.950042195618153),
                Point.fromLngLat(92.860349351540208, 55.949952425435185),
                Point.fromLngLat(92.859307480975986, 55.949548166245222),
                Point.fromLngLat(92.858320511877537, 55.949098980054259),
        ))

//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.882611099630594,55.974117117002606))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.882391829043627,55.973667930811644))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.882501464337111,55.973218744620681))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.88326907902956,55.972589934244752))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.88326907902956,55.972095904871821))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.883488433435559,55.971646718680859))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.883598068729043,55.971197532489896))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.883323896676302,55.970793273299932))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.882282109931111,55.970523795112967))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.881130687892437,55.970658576115966))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.880033999681473,55.970658576115966))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.87893739528954,55.97043402493))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878608405590057,55.970074692741036))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.8784438688308,55.969625506550074))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878279415890574,55.969176320359111))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878005243837833,55.968772061169147))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.877785889431834,55.968322958797216))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.877511717379093,55.967918699607253))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878553587943316,55.967604294419289))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.879156665876508,55.967020411044359))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.879211567342281,55.966571224853396))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.879266384989023,55.966122038662434))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.879266384989023,55.965628009289503))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878992212936282,55.96522375009954))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878553587943316,55.964909344911575))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878279415890574,55.964505085721612))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878224598243833,55.964055983349681))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878224598243833,55.963606797158718))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.878224598243833,55.963157610967755))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.87789560854435,55.962753351777792))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.877511717379093,55.96239410340786))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.877073092386127,55.962034771218896))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.876744102686644,55.961675439029932))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.876305477693677,55.961405877023935))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875866768881679,55.961091471835971))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875592596828938,55.960687296465039))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875428143888712,55.960238110274076))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.87537332624197,55.959788924083114))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.87537332624197,55.959294894710183))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.87537332624197,55.95884570851922))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875428143888712,55.958396522328258))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875482961535454,55.957947419956326))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875537779182196,55.957498233765364))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875537779182196,55.957004204392433))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875537779182196,55.95655501820147))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875537779182196,55.956105832010508))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875537779182196,55.955611802637577))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.87537332624197,55.955162616446614))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875208789482713,55.954713430255651))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.875044336542487,55.95426432788372))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.87487979978323,55.953815141692758))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.874715346843004,55.953365955501795))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.874386357143521,55.952961780130863))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.873892830684781,55.952692218124866))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.872741324827075,55.9525125939399))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.871644720435143,55.9525575209409))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.870712568983436,55.952018480747938))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.869615964591503,55.951749002560973))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.86879344843328,55.951165119186044))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.868464458733797,55.95076085999608))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.868245104327798,55.950311757624149))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.867861296981573,55.949952425435185))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.867422671988606,55.949638020247221))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.866983963176608,55.949323615059257))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.865887358784676,55.949548166245222))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.864790754392743,55.949682863429189))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.863694066181779,55.949907498434186))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.862597461789846,55.949997352436185))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.861500773578882,55.950042195618153))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.860349351540208,55.949952425435185))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.859307480975986,55.949548166245222))
//(trek2Coord as ArrayList<Point>).add(Point.fromLngLat(92.858320511877537,55.949098980054259))

        Log.e("trek2Coord", "$trek2Coord")

        return trek2Coord
//                as ArrayList<Point>
    }
}


