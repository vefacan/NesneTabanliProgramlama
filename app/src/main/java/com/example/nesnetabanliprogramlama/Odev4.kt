package com.example.nesnetabanliprogramlama

import java.util.*

fun main (){

    val girdi = Scanner(System.`in`)

    println("Lütfen kelimenizi giriniz:")
    var kelime = girdi.next()
    println("Lütfen harf giriniz:")
    var harf = girdi.next().single()

    val kelimeodevi = Odev4()

    kelimeodevi.kelimeadedi(kelime,harf)
}