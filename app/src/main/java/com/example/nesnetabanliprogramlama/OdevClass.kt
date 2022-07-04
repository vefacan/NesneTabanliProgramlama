package com.example.nesnetabanliprogramlama

class Odev1 {

    fun derece(girilendeger:Double):Double{

        var sonuc = 1.8*girilendeger+32
        println("Sonucunuz: $sonuc")
        return sonuc
    }

}

class Odev2 {

    fun islem (kisakenar:Double, uzunkenar:Double):Double{

        var dikdortgencevresi = (uzunkenar*2) + (kisakenar*2)
        println("Dikdörtgenin çevresi: $dikdortgencevresi")
        return dikdortgencevresi

    }
}

