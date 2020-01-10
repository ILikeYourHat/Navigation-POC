package pl.softwarealchemy.first

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first.*
import pl.softwarealchemy.universe.UniverseProvider
import pl.softwarealchemy.universe.WorldRegistry

class FirstActivity : AppCompatActivity() {

    private val universe by lazy { (application as UniverseProvider).getUniverse() }
    private val secondWorld by lazy { universe.get(WorldRegistry.SECOND) }
    private val thirdWorld by lazy { universe.get(WorldRegistry.THIRD) }
    private val fourthWorld by lazy { universe.get(WorldRegistry.FOUTH) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        firstToSecond.setOnClickListener {
            val intent = secondWorld.toSecondActivity(this)
            startActivity(intent)
        }
        firstToThird.setOnClickListener {
            val intent = thirdWorld.goToThirdActivity(this, 43)
            startActivityForResult(intent, REQUEST_THIRD)
        }
        firstToFourth.setOnClickListener {
            val intent = fourthWorld.toFourthActivity(this)
            startActivity(intent)
        }

        firstToFourth.visibility = if (universe.exist(WorldRegistry.FOUTH)) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            REQUEST_THIRD -> thirdWorld.getDataFromThirdActivity(resultCode, data)
                ?.let { showData(it) }
            else -> super.onActivityResult(requestCode, resultCode, data)
        }
    }

    private fun showData(goodbyeMessage: String) {
        Toast.makeText(this, goodbyeMessage, Toast.LENGTH_SHORT).show()
    }

    companion object {
        const val REQUEST_THIRD = 3
    }
}
