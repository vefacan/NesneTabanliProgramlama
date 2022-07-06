package com.example.nesnetabanliprogramlama

fun main(){

    val bmw = Araba("Kırmızı",10,false)

    bmw.bilgiAl()

    bmw.calistir()
    bmw.bilgiAl()

    bmw.durdur()
    bmw.bilgiAl()

    bmw.hizlan(100)
    bmw.bilgiAl()

    bmw.yavasla(20)
    bmw.bilgiAl()

    val sahin = Araba("Beyaz",20,true)

    sahin.hizlan(120)
    sahin.bilgiAl()




}