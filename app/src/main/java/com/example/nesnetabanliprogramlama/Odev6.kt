package com.example.nesnetabanliprogramlama

import java.util.*

fun main (){

    val girdi = Scanner(System.`in`)

    println("Çalıştığınız gün sayısını giriniz:")
    var gun = girdi.nextInt()


    /* Günde 8 saat çalışılır , 160 saat üzeri mesai sayılır.
            Çalışma Saat Ücreti = 10 TL
            Mesai Saat Ücreti = 20 TL
     */


    var odev6 = Odev6()

    odev6.islem(gun)



}