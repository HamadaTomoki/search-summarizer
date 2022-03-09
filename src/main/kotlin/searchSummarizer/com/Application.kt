package searchSummarizer.com

import searchSummarizer.com.presentation.plugins.configureRouting
import searchSummarizer.com.presentation.plugins.configureSerialization
import searchSummarizer.com.presentation.plugins.configureSockets
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {

    embeddedServer(
        Netty,
        port = System.getenv("PORT").toInt() // 8080
    ) {
        configureRouting()
        configureSerialization()
        configureSockets()
        routing {
            get("/") {
                call.respondText("Hello, world!")
            }
        }
    }.start(wait = true)
}
