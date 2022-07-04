package com.example.nesnetabanliprogramlama

import java.util.*

fun main() {

    val girdi = Scanner(System.`in`)

    println("Lütfen dikdörtgenin uzun kenarını giriniz:")
    var uzunkenar = girdi.nextDouble()
    println("Lütfen dikdörtgenin kısa kenarını giriniz:")
    var kisakenar = girdi.nextDouble()


    val dikdortgen = Odev2()

    dikdortgen.islem(kisakenar,uzunkenar)







}