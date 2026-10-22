// Task 7.7.1: statistics functions
fun median(args: List<Float>){
    var listSize = args.size
    if(args.size % 2 > 0){
        listSize = listSize++
    }
    return args[listSize/2]
}

fun statsCalc(args: List<Float>){
    
}