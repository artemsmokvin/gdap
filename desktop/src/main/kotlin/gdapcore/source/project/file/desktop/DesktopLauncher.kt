package gdapcore.source.project.file.desktop

import com.badlogic.gdx.Files.FileType
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import gdapcore.source.project.file.gdap

/** Launches the desktop (LWJGL) application.  */
object DesktopLauncher {
    @JvmStatic
    fun main(args: Array<String>) {
        createApplication()
    }

    private fun createApplication(): LwjglApplication {
        return LwjglApplication(gdap(), defaultConfiguration)
    }

    //// This prevents a confusing error that would appear after exiting normally.
    private val defaultConfiguration: LwjglApplicationConfiguration
        private get() {
            val configuration = LwjglApplicationConfiguration()
            configuration.title = "gdap"
            configuration.width = 640
            configuration.height = 480
            //// This prevents a confusing error that would appear after exiting normally.
            configuration.forceExit = false
            for (size in intArrayOf(128, 64, 32, 16)) {
                configuration.addIcon("libgdx$size.png", FileType.Internal)
            }
            return configuration
        }
}