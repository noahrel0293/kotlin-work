// Task 7.7.1: program to compute stats for a numeric dataset
fun median(args: List<Float>){
    var listSize = args.size
    if(args.size % 2 > 0){
        listSize = listSize++
    }
    return args[listSize/2]
}