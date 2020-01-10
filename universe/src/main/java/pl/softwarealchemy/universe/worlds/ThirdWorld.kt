package pl.softwarealchemy.universe.worlds

import android.content.Context
import android.content.Intent
import pl.softwarealchemy.universe.World

interface ThirdWorld: World {

    fun goToThirdActivity(context: Context, number: Int): Intent

    fun getDataFromThirdActivity(resultCode: Int, data: Intent?): String?
}