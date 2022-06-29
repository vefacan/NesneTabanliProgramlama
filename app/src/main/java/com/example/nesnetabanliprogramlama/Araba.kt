package com.example.nesnetabanliprogramlama

class Araba(var renk: String,var hiz: Int,var calisiyorMu: Boolean) {



    fun calistir(){
        calisiyorMu = true
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(KacKm:Int){

        hiz = hiz + KacKm
    }

    fun yavasla(KacKm: Int){

        hiz = hiz - KacKm
    }


    fun bilgiAl(){

        println("Renk: $renk")
        println("Hız: $hiz")
        println("Çalışıyor mu? : $calisiyorMu")




    }
}