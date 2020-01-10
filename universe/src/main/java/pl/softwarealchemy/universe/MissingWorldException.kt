package pl.softwarealchemy.universe

import java.lang.RuntimeException

class MissingWorldException(message: String) : RuntimeException(message) {
}