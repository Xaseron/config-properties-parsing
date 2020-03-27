package config.properties.parsing

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.micronaut.context.annotation.Property
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


import java.util.logging.Logger

@Controller("/objectives")
class ObjectivesController() {
    val log = Logger.getLogger(javaClass.name)

    @field:Property(name = "objectives")
    var _objectives: Any? = null

    val objectives: List<Objective>
    get() {
        val mapper = jacksonObjectMapper()
        val writeValueAsString = mapper.writeValueAsString(_objectives)
        log.info(writeValueAsString)
        return mapper.readValue(writeValueAsString)
    }


    @Get("/")
    fun objectives(): List<Objective>? {
        log.info("Hei")

        return objectives
    }
}
