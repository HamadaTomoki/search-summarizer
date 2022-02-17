package searchSummarizer.com

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import searchSummarizer.com.plugins.*

fun main() {

    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
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
