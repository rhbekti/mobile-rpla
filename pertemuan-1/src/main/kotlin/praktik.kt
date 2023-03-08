fun main(){
    // no 3
    println("Hello,World")
    println("Hallo Apa Kabar")

    //

    // no 8
    val num = 101.99
    println(num)

    // no 9
    val boolValue = false
    println(boolValue)

    val ch = 'A'
    println(ch)

    val ch2:Char
    ch2 = 'Z'
    println(ch2)

    // no 10
    val num1 = 101.99
    val num2 = 100.50
    var op:Double

    op = num1 + num2
    println(op)

    op = num1 - num2
    println(op)

    op = num1 * num2
    println(op)

    op = num1 / num2
    println(op)

    op = num1 % num2
    println(op)

    // no 11
    var nama = "Susi Susanti"
    println("Panjang String : ${nama.length}")

    // no 12
    var arrNilai = arrayOf<Int>(70,80,60,90)
    println("Nilai ke-2 : "+arrNilai.get(1))

    // no 13
    arrNilai.set(1,85)
    print("Nilai ke-2 : "+arrNilai.get(1))

    // no 14
    val nilai = 90
    if(nilai < 50){
        println("Nilaiku jelek")
    }else{
        println("Ayahku memberiku hadiah")
    }

    // no 15

    if(nilai < 50){
        println("nilai jelek")
    }else if(nilai < 70){
        println("nilai cukup")
    }else{
        println("nilai bagus")
    }

    // no 16
    val num3 = 101
    if(num3<0){
        println("Bilangan Negatif")
    }else{
        if(num3%2 == 0){
            println("Bilangan Genap")
        }else{
            println("Bilangan Ganjil")
        }
    }

    // no 17
    val num4 = -23
    val num5 = 12

    if(num4<0){
        println("Bilangan Negatif")
    }else{
        if(num4%2 == 0){
            println("Bilangan Genap")
        }else{
            println("Bilangan Ganjil")
        }
    }

    if(num5<0){
        println("Bilangan Negatif")
    }else{
        if(num5%2 == 0){
            println("Bilangan Genap")
        }else{
            println("Bilangan Ganjil")
        }
    }

    // no 18
    var umur = 15

    when(umur){
        in 1..16 -> {
            val selisih = 17 - umur
            println("Anda akan berhak ikut pemilu dalam $selisih tahun lagi")
        }
        in 17..100 -> println("Anda berhak untuk ikut pemilu")
    }

    // no 19
    var umur1 = 21

    when(umur1){
        in 1..16 -> {
            val selisih = 17 - umur1
            println("Anda akan berhak ikut pemilu dalam $selisih tahun lagi")
        }
        in 17..100 -> println("Anda berhak untuk ikut pemilu")
    }

    // no 20
    val myArray = arrayOf(3,5,8,2,4,7,6)
    for((index,value) in myArray.withIndex()){
        println("Nilai pada index $index adalah : $value")
    }

    // no 21
    var i = 0
    while(i < myArray.size){
        println("Nilai pada index $i adalah : ${myArray.get(i)}")
        i++
    }

    // no 22
    var tertinggi = 0
    while (i < myArray.size){
        if(tertinggi < myArray.get(i)){
            tertinggi = myArray.get(i)
        }
        i++
    }

    println("Nilai tertinggi adalah "+tertinggi)

    // no 22
    println(myArray.max())
}