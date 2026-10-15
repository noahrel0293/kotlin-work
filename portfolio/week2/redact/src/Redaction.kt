// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(arg1: String, arg2: String, arg3: Char = 'X'): String{
    var txt = StringBuilder(arg1)
    var location: Int = 0
    var indexVal: Int
    var txtFin: String
    if(arg2.length < 1){
        txtFin = arg1
    }
    else{
        while(location >= 0){
            location = txt.indexOf(arg2)
            if(location >= 0){
                for(x in 0..arg2.length-1){
                    txt[location + x] = arg3
                }
            }
        }
        txtFin = txt.toString()
    }
    return txtFin
}