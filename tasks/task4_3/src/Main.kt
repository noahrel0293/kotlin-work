// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Provide 3 grades!")
        exitProcess(1)
    }
    var marksAvg: Double= (args[0].toDouble() + args[1].toDouble() + args[2].toDouble())/3
    when (marksAvg.roundToInt()) {
        in 0..39 -> println("${marksAvg.roundToInt()} Fail")
        in 40..69 -> println("${marksAvg.roundToInt()} Pass")
        in 70..100 -> println("${marksAvg.roundToInt()} Distinction")
    }
}