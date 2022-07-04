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
class Odev3 {

    fun faktoriyel (sayi:Int) : Int{

        var sonuc = 1

        for (i in 1..sayi){

           sonuc = sonuc * i
        }
        println("Cevabınız: $sonuc")
        return sonuc


    }

}

class Odev4 {

    fun kelimeadedi (kelime:String,harf:Char) {

        var sonuc = 0


        for (k in kelime ){
            if (k == harf ){
                sonuc = sonuc + 1
            }
        }
        println("Harf adeti: $sonuc")
    }
}
