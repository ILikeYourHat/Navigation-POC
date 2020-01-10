package pl.softwarealchemy.universe

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class Creator {

    inline fun <reified T> create() = create(T::class.java)

    fun <T> create(clazz: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return Proxy.newProxyInstance(
            Creator::class.java.classLoader,
            arrayOf(clazz),
            Handler
        ) as T
    }

    private object Handler : InvocationHandler {
        override fun invoke(obj: Any, method: Method, arguments: Array<out Any?>): Any? {
            return when (method.returnType) {
                Int::class.java -> 43
                else -> null
            }
        }
    }
}