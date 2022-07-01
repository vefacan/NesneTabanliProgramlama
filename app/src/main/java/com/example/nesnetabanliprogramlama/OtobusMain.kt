package com.example.nesnetabanliprogramlama

fun main (){

    val kamilKoc = Otobus(50,"Bursa","Ankara",10)

    println(kamilKoc.kapasite)

    kamilKoc.kapasite = 100
    kamilKoc.nereden = "İzmir"
    kamilKoc.nereye = "İstanbul"


    println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)


    kamilKoc.bilgiAl()
    kamilKoc.yolcuAl(20)

    println(kamilKoc.mevcutyolcu)

    kamilKoc.yolcuIndır(4)
    println(kamilKoc.mevcutyolcu)

}