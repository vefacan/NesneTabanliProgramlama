package com.example.nesnetabanliprogramlama

import java.util.*

fun main (){

    val girdi = Scanner(System.`in`)

    println("Kenar sayısını giriniz:")
    var kenarsayisi = girdi.nextInt()

    var islem = Odev5()

    islem.islem(kenarsayisi)
}