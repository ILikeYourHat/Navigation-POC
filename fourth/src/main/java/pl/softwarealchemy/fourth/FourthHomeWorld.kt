package pl.softwarealchemy.fourth

import android.content.Context
import android.content.Intent
import pl.softwarealchemy.universe.worlds.FourthWorld

object FourthHomeWorld: FourthWorld {
    override fun toFourthActivity(context: Context): Intent {
        return Intent(context, FourthActivity::class.java)
    }
}