package com.example.nesnetabanliprogramlama

fun main (){


    fun selamla(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    selamla()

    fun selamla1():String{
        val sonuc = "Merhaba Mehmet"
        return sonuc
    }

    val gelenSonuc = selamla1()
    println(gelenSonuc)

    fun selamla2(isim:String){

        val sonuc = "Merhaba $isim"
        println(sonuc)
    }
    selamla2("Zeynep")


    fun toplama(){

        val toplam = 30 + 40
        println("toplama = $toplam" )
    }

    toplama()


    fun toplama1(top1:Int,top2:Int): Int {
        val toplam = top1 + top2
        return toplam
    }

    val t1 = toplama1(73,41)
    println("toplama2 = $t1")

}