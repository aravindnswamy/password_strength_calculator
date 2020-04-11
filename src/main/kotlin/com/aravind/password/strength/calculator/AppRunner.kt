package com.aravind.password.strength.calculator

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * A runner class for the application.
 *
 * Note: the application implements REST API.
 * MVC dispatcher servlet delegates RESTFUL requests to @RestController
 * @author aravind.n
 */

@SpringBootApplication
open class AppRunner

fun main(args: Array<String>) {
    SpringApplication.run(AppRunner::class.java)
}