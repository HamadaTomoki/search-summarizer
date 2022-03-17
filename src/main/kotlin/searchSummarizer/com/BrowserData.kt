package searchSummarizer.com

import kotlinx.serialization.Serializable

@Serializable
data class SummarizedUrl(
    var id: String = "",
    var title: String = "",
    var author: String = "",
    var urls: List<String> = listOf()
)

val summarizedUrlStorage = listOf(
    SummarizedUrl(
        "fb7100a8-0747-405b-b76a-a774cc8df1da",
        "SwiftUI",
        "はんまど",
        listOf(
            "https://medium.com/swlh/how-to-open-the-camera-and-photo-library-in-swiftui-9693f9d4586b",
            "https://qiita.com/wai21/items/21b381823fb12bb88268?utm_source=pocket_mylist",
            "https://www.yururiwork.net/archives/1821?utm_source=pocket_mylist"
        )
    ),
    SummarizedUrl(
        "cc2d58e8-15d1-431c-8f80-3e0cc33af2c7",
        "Kotlin",
        "はまちゃん",
        listOf(
            "https://qiita.com/hkusu/items/f1c55a0e0d03543b24d5?utm_source=pocket_mylist",
            "https://proandroiddev.com/custom-kotlinx-serializers-cd148e72d712",
            "https://hirauchi-genta.com/kotlin-also/?utm_source=pocket_mylist",
            "https://qiita.com/hkusu/items/f1c55a0e0d03543b24d5?utm_source=pocket_mylist",
        )
    ),
    SummarizedUrl(
        "e0955c64-f4df-4e06-a345-16735eb68e2d",
        "Android",
        "はまだ",
        listOf(
            "https://proandroiddev.com/should-we-choose-kotlins-stateflow-or-sharedflow-to-substitute-for-android-s-livedata-2d69f2bd6fa5",
            "https://star-zero.medium.com/livedata%E3%81%A8stateflow%E3%81%AE%E9%81%95%E3%81%84-5c141c6eb0f9",
            "https://evangelidis.medium.com/android-how-to-set-gradient-color-as-background-7812c4cf06ec",
            "https://proandroiddev.com/safe-compose-arguments-an-improved-way-to-navigate-in-jetpack-compose-95c84722eec2",
        )
    )
)