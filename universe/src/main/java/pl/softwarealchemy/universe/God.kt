package pl.softwarealchemy.universe

class God {

    private val map = mutableMapOf<WorldRegistry<*>, World>()

    fun <T: World, F: T> define(worldRegistry: WorldRegistry<T>, world: F) = apply {
        map[worldRegistry] = world
    }

    fun createUniverse() = object: Universe {
        override fun <T : World> get(worldRegistry: WorldRegistry<T>): T {
            val world = map[worldRegistry] ?: throw MissingWorldException("${worldRegistry::class.java.simpleName} not found")
            @Suppress("UNCHECKED_CAST")
            return world as T
        }

        override fun exist(worldRegistry: WorldRegistry<*>): Boolean {
            return map[worldRegistry] != null
        }
    }

}