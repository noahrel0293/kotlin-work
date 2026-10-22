// Task 7.7.1: program to compute stats for a numeric dataset
fun median(args: List<Float>): Float{
    var listSize = args.size
    if(listSize == 0){
        throw IllegalArgumentException()
    }
    if(args.size % 2 > 0){
        listSize = listSize + 1
    }
    return args[listSize/2 - 1]
}