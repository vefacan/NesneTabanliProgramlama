package com.example.nesnetabanliprogramlama

class Odev1 {

    fun derece(girilendeger:Double):Double{

        var sonuc = (1.8 * girilendeger) + 32
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

class Odev5 {

    fun islem (kenarsayisi : Int):Int{

        var sonuc = (kenarsayisi - 2) * 180
        println("İç açılar toplamı : $sonuc")
        return sonuc
    }
}

class Odev6 {

    fun islem(gun: Int) : Int {

       var sonuc = (gun * 8)
        if (sonuc > 160){
           println("Ücretiniz: ${((sonuc - 160) * 20) + (160 * 10)}")
        }
        else if (sonuc <= 0){
            println("Ücretiniz: ${sonuc * 0}")
        }
        else {
            println("Ücretiniz: ${sonuc * 10}")
        }
        return sonuc
    }
}

class Odev7 {

    fun islem(kota:Int) : Int {

        var para = 0
        if (kota > 50){
            para = (((kota - 50) * 4) + 100)
            println("Ücretiniz $para")
        }
        else if (kota <= 0){

            println("Ücretiniz: ${para*0}")

        }
        else {
            para = 100
            println("Ücretiniz $para")
        }
            return para
    }
}
