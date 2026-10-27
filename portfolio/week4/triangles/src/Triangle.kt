// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(var sideA: Double, var sideB: Double, var sideC: Double) {
    var perimeter: Double = sideA + sideB + sideC
    var semiPerimeter: Double = perimeter / 2
    var area: Double = sqrt(semiPerimeter * (semiPerimeter-sideA) * (semiPerimeter-sideB) * (semiPerimeter-sideC))

    init {
        fun isValidTriangle(sideA: Double, sideB: Double, sideC: Double): Boolean{
            fun triangleSideTest(arg1: Double, arg2: Double, arg3: Double): Boolean{
                if(arg1<(arg2+arg3)){
                    return true
                }
                else{
                    return false
                }
            }
            var valid1 = triangleSideTest(sideA, sideB, sideC)
            var valid2 = triangleSideTest(sideB, sideA, sideC)
            var valid3 = triangleSideTest(sideC, sideA, sideB)
            if(valid1 == true && valid2 == true && valid3 == true){
                return true
            }
            else{
                return false
            }
        }

        if(isValidTriangle(sideA, sideB, sideC)==false){
        throw IllegalArgumentException()
        }

    }

    override fun toString(): String = "Triangle($sideA, $sideB, $sideC)"

}