package searchSummarizer.com.presentation.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.browserRouting() {

    route("/summarized") {
        get("/urls") {
        }
        get("/loading") {
            call.respondText("Loading", status = HttpStatusCode.Created)
        }
    }
}


fun Application.registerBrowserRoutes() {
    routing {
        browserRouting()
    }
}
