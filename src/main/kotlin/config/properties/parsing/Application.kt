package config.properties.parsing

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("config.properties.parsing")
                .mainClass(Application.javaClass)
                .start()
    }
}