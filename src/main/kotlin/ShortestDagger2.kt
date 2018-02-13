import dagger.Component
import javax.inject.Inject

fun main(args: Array<String>) {
    MainClass()
}

class MainClass {
    @Inject lateinit var info: Info
    init {
        DaggerMagicBox.builder().build().poke(this)
        println(info.text)
    }
}

class Info @Inject constructor() {
    val text = "Hello Dagger 2"
}

@Component
interface MagicBox {
    fun poke(app: MainClass)
}