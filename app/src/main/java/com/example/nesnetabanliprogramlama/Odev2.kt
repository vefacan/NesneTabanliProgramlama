package com.example.nesnetabanliprogramlama

import java.util.*

fun main() {

    val girdi = Scanner(System.`in`)

    println("Lütfen dikdörtgenin uzun kenarını giriniz:")
    var uzunkenar = girdi.nextDouble()
    println("Lütfen dikdörtgenin kısa kenarını giriniz:")
    var kisakenar = girdi.nextDouble()

    var dikdortgencevresi = (uzunkenar*2) + (kisakenar*2)

    println("Dikdörtgenin çevresi: $dikdortgencevresi")

}