package searchSummarizer.com

import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import searchSummarizer.com.presentation.routes.registerBrowserRoutes
import java.io.File

fun main() {

    embeddedServer(
        Netty,
        port =  System.getenv("PORT").toInt() // 8080
    ) {
        registerBrowserRoutes()
        routing {
            static(".well-known") {
                staticRootFolder = File(".well-known") // Establishes a root folder
                file("assetlinks.json")
            }
        }
    }.start(wait = true)
}
