fun main(){
    val string1 = "Susi Susanti"
    val string2 = "Susi susanti"

    if(string1 == string2)
        println("Sama")
    else
        println("Beda")

    if(string1.equals(string2))
        println("Sama")
    else
        println("Beda")

    val bil = 45
    if(bil < 50){
        println("Kurang dari 50")
    }else{
        println("Lebih dari 50")
    }
    if(bil%5 == 0){
        println("Kelipatan 5")
    }else{
        println("Bukan kelipatan 5")
    }
}