package pl.softwarealchemy.universe

import pl.softwarealchemy.universe.worlds.FirstWorld
import pl.softwarealchemy.universe.worlds.FourthWorld
import pl.softwarealchemy.universe.worlds.SecondWorld
import pl.softwarealchemy.universe.worlds.ThirdWorld
import kotlin.reflect.KClass

sealed class WorldRegistry<T: World>(
    val world: KClass<T>
) {
    object FIRST: WorldRegistry<FirstWorld>(FirstWorld::class)
    object SECOND: WorldRegistry<SecondWorld>(SecondWorld::class)
    object THIRD: WorldRegistry<ThirdWorld>(ThirdWorld::class)
    object FOUTH: WorldRegistry<FourthWorld>(FourthWorld::class)
}