package pl.softwarealchemy.third

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val number = intent.extras?.get(KEY_NUMBER) ?: 0
        numberLabel.text = number.toString()
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_OK, Intent().putExtra(KEY_GOODBYE, "THX BYE"))
        super.onBackPressed()
    }

    companion object {
        const val KEY_NUMBER = "number"
        const val KEY_GOODBYE = "goodbye"
    }
}
