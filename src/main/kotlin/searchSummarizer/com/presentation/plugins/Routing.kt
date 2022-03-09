package searchSummarizer.com.presentation.plugins

import searchSummarizer.com.presentation.routes.registerBrowserRoutes
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {
    registerBrowserRoutes()
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
