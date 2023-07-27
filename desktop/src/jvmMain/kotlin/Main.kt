import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import space.starlio.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
