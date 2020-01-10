package pl.softwarealchemy.universe

interface Universe {
    fun <T: World> get(worldRegistry: WorldRegistry<T>): T

    fun exist(worldRegistry: WorldRegistry<*>): Boolean
}