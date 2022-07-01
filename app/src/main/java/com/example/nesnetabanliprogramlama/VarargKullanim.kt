package com.example.nesnetabanliprogramlama

fun main() {

    fun toplam(vararg sayilar: Int): Int {

        var sonuc = 0

        for (s in sayilar) {

            sonuc = sonuc + s


        }

        return sonuc


    }


    val t1 = toplam(1, 2, 3, 4, 5, 2, 4, 3, 5, 7, 8, 1, 42, 62, 67)

    println("Toplam $t1")

}