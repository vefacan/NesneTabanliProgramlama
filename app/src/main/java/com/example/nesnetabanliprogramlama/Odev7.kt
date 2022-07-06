package com.example.nesnetabanliprogramlama

import java.util.*

fun main (){

    val girdi = Scanner(System.`in`)

    println("Kotanızı giriniz:")
    var kota = girdi.nextInt()
    var internet = Odev7()
    internet.islem(kota)
}