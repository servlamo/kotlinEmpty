import kotlinx.serialization.*
import kotlinx.serialization.json.*
fun main(args: Array<String>) {
    println("Hello World!")
    val format = Json {  isLenient = true }
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}