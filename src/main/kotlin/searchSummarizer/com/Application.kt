package searchSummarizer.com

import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import searchSummarizer.com.presentation.plugins.configureSerialization
import searchSummarizer.com.presentation.routes.registerBrowserRoutes
import java.io.File

fun main() {

    embeddedServer(
        Netty,
        port =  System.getenv("PORT").toInt()
        // port = 8080
    ) {
        configureSerialization()
        registerBrowserRoutes()
    }.start(wait = true)
}
