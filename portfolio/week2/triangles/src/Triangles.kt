// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(args: Triangle): Boolean{
    fun triangleSideTest(arg1: Double, arg2: Double, arg3: Double): Boolean{
        if(arg1<(arg2+arg3)){
            return true
        }
        else{
            return false
        }
    }
    var valid1 = triangleSideTest(args.first, args.second, args.third)
    var valid2 = triangleSideTest(args.second, args.first, args.third)
    var valid3 = triangleSideTest(args.third, args.first, args.second)
    if(valid1 == true && valid2 == true && valid3 == true){
        return true
    }
    else{
        return false
    }
}

fun triangleArea(args: Triangle): Double{
    var argsFloat = arrayOf(args.first, args.second, args.third)
    var semiperim = (argsFloat[0] + argsFloat[1] + argsFloat[2])/2
    var areaSqurd = semiperim * (semiperim - argsFloat[0]) * (semiperim - argsFloat[1]) * (semiperim - argsFloat[2])
    var areaTri: Double= sqrt(areaSqurd)
    return areaTri
}