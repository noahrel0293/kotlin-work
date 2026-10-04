// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size < 3.00){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    var argsFloat = arrayOf(args[0].toFloat(), args[1].toFloat(), args[2].toFloat())
    var semiperim = (argsFloat[0] + argsFloat[1] + argsFloat[2])/2
    var areaSqurd = semiperim * (semiperim - argsFloat[0]) * (semiperim - argsFloat[1]) * (semiperim - argsFloat[2])
    var areaTri = sqrt(areaSqurd)
    println("Area = %.5f".format(areaTri))
}