package com.example.nesnetabanliprogramlama

fun main (){

    fun Int.carpi(sayi:Int):Int{

        return this * sayi

    }

    val sonuc = 5.carpi(2)

    println(sonuc)


    infix fun Int.carpi2(sayi:Int):Int{

        return this * sayi

    }

    val sonuc2 = 5 carpi2  (2)

    println(sonuc2)





}