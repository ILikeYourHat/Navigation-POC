package pl.softwarealchemy.universe.worlds

import android.content.Context
import android.content.Intent
import pl.softwarealchemy.universe.World

interface FourthWorld: World {

    fun toFourthActivity(context: Context): Intent

}