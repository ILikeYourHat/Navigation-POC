package pl.softwarealchemy.universe.worlds

import android.content.Context
import android.content.Intent
import pl.softwarealchemy.universe.World

interface SecondWorld: World {

    fun toSecondActivity(context: Context): Intent

}