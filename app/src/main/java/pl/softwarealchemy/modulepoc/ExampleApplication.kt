package pl.softwarealchemy.modulepoc

import android.app.Application
import pl.softwarealchemy.first.FirstHomeworld
import pl.softwarealchemy.second.SecondHomeworld
import pl.softwarealchemy.third.ThirdHomeworld
import pl.softwarealchemy.universe.God
import pl.softwarealchemy.universe.WorldRegistry
import pl.softwarealchemy.universe.Universe
import pl.softwarealchemy.universe.UniverseProvider

class ExampleApplication : Application(), UniverseProvider {

    private lateinit var universe: Universe

    override fun onCreate() {
        super.onCreate()
        universe = God()
            .define(WorldRegistry.FIRST, FirstHomeworld)
            .define(WorldRegistry.SECOND, SecondHomeworld)
            .define(WorldRegistry.THIRD, ThirdHomeworld)
            .applyDevWorlds()
            .createUniverse()
    }

    override fun getUniverse() = universe
}