package com.example.nesnetabanliprogramlama

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

        println("Değer giriniz:")
    val girilendeger = girdi.nextDouble()

    val odev1 = Odev1()
        odev1.derece(girilendeger)
}