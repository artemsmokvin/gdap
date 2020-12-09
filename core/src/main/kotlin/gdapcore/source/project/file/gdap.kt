package gdapcore.source.project.file

import com.badlogic.gdx.Game

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class gdap : Game() {
    override fun create() {
        setScreen(FirstScreen())
    }
}