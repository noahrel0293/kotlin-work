// Task 4.7: finding the longest line in a file
import kotlin.io.path.*

fun main(args: Array<String>) {
    val path = Path(args[0])
    var currentLine = 0
    var longestLine = 0
    var longestLen = 0
    path.forEachLine {
        currentLine = currentLine + 1
        if(it.length > longestLen){
            longestLen = it.length
            longestLine = currentLine
        }
    }
    println("Line $longestLine is the longest (length = $longestLen)")
}