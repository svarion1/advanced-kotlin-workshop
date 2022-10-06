package dev.sebastiano.workshop

internal class LateInit {

    private lateinit var _fruit: String

    var fruit: String?
        get() = if (::_fruit.isInitialized) _fruit else null
        set(value) = if (value != null) _fruit = value else throw IllegalArgumentException("Fruit cannot be null")

    fun performSomeWork(): String = "Here's something for ya: $_fruit"
}
