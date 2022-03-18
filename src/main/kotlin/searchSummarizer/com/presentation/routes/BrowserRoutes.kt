package searchSummarizer.com.presentation.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import searchSummarizer.com.SummarizedUrl
import searchSummarizer.com.summarizedUrlStorage
import java.io.File

fun Route.browserRouting() {

    route("/") {
        get{
            call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
        }
    }

    route("/summarized") {

        get("/urls") {
            val id =
                call.request.queryParameters["id"] ?: return@get call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
            val summarizedUrl: SummarizedUrl = summarizedUrlStorage.find { it.id == id } ?: return@get call.respondText(
                "ID is not Found",
                status = HttpStatusCode.NotFound
            )
            call.respond(summarizedUrl)
        }
    }

    static(".well-known") {
        staticRootFolder = File(".well-known") // Establishes a root folder
        file("assetlinks.json")
    }
}


fun Application.registerBrowserRoutes() {
    routing {
        browserRouting()
    }
}
