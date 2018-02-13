import dagger.Component
import javax.inject.Inject

fun main(args: Array<String>) {
    println(MainClass().info.text)
}

class MainClass {
    @Inject lateinit var info : Info
    init {
        DaggerMagicBox.create().poke(this)
    }
}

class Info @Inject constructor() {
    val text = "Hello Dagger 2"
}

@Component interface MagicBox {
    fun poke(mainClass: MainClass)
}
