package pl.softwarealchemy.third

import android.app.Activity
import android.content.Context
import android.content.Intent
import pl.softwarealchemy.universe.worlds.ThirdWorld

object ThirdHomeworld : ThirdWorld {

    override fun goToThirdActivity(context: Context, number: Int): Intent {
        return Intent(context, ThirdActivity::class.java)
            .putExtra(ThirdActivity.KEY_NUMBER, number)
    }

    override fun getDataFromThirdActivity(resultCode: Int, data: Intent?): String? {
        return when (resultCode) {
            Activity.RESULT_OK -> data?.getStringExtra(ThirdActivity.KEY_GOODBYE)
            else -> null
        }
    }
}