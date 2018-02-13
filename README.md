# demo_kotlin_shortest_dagger2
The IntelliJ project code showing short Dagger 2 code (perhaps shortest in the world?), that help make Dagger 2 easier to understand. 
The code is literally just

```
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
```

There's a blog illustrate it at https://medium.com/@elye.project/world-shortest-dagger-2-code-f14b1b8d9e71.
