package pl.softwarealchemy.modulepoc

import pl.softwarealchemy.fourth.FourthHomeWorld
import pl.softwarealchemy.universe.God
import pl.softwarealchemy.universe.WorldRegistry

fun God.applyDevWorlds() = define(WorldRegistry.FOUTH, FourthHomeWorld)