import com.newolf.composetutorial.LocalMessageActivity.LocalMessage


/**
 * SampleData for Jetpack Compose Tutorial 
 */
object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        LocalMessage(
            "NeWolf",
            "I miss you so much!!!"
        ),
        LocalMessage(
            "NeWolf",
            """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trim()
        ),
        LocalMessage(
            "NeWolf",
            """I think Kotlin is my favorite programming language.
            |It's so much fun!""".trim()
        ),
        LocalMessage(
            "NeWolf",
            "Searching for alternatives to XML layouts..."
        ),
        LocalMessage(
            "NeWolf",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trim()
        ),
        LocalMessage(
            "NeWolf",
            "It's available from API 21+ :)"
        ),
        LocalMessage(
            "NeWolf",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        LocalMessage(
            "NeWolf",
            "Android Studio next version's name is Arctic Fox"
        ),
        LocalMessage(
            "NeWolf",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        LocalMessage(
            "NeWolf",
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        LocalMessage(
            "NeWolf",
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        LocalMessage(
            "NeWolf",
            "Previews are also interactive after enabling the experimental setting"
        ),
        LocalMessage(
            "NeWolf",
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}
