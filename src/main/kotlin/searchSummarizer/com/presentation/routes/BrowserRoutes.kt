package searchSummarizer.com.presentation.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.browserRouting() {
    route("/summarized") {
        get("/urls") {
            call.respondText(
                text = """
                    <!DOCTYPE html>
                    <html>
                    <head>
                    <title>Summarized Url</title>
                    </head>
                    <body>
                    <script>
                        triggerAppOpen()
                        function fallbackToStore() {
                          document.write("faild");
                        };
                        function openApp() {
                          // window.location.replace('http://0.0.0.0:8080/summarized/loading');
                          // window.location.replace('https://search-summarizer.herokuapp.com/summarized/loading');
                          window.location.replace('summarized_urls://');
                        };
                        function triggerAppOpen() {
                          openApp();
                          setTimeout(fallbackToStore, 250);
                        };
                    </script>
                    </body>
                    </html>
                """.trimIndent(),
                contentType = ContentType.Text.Html
            )

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
