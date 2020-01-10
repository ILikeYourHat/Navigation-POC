package pl.softwarealchemy.second

import android.content.Context
import android.content.Intent
import pl.softwarealchemy.universe.worlds.SecondWorld

object SecondHomeworld: SecondWorld {
    override fun toSecondActivity(context: Context): Intent {
        return Intent(context, SecondActivity::class.java)
    }
}