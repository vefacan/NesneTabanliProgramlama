package com.example.nesnetabanliprogramlama

class Otobus(var kapasite:Int, var nereden:String, var nereye:String, var mevcutyolcu:Int) {



    fun bilgiAl(){


        println("Kapasite: $kapasite")
        println("Nereden: $nereden")
        println("Nereye: $nereye")
        println("Mevcut Yolcu: $mevcutyolcu")

    }

    fun yolcuAl(yolcuekle: Int){

        mevcutyolcu = mevcutyolcu + yolcuekle
    }

    fun yolcuIndır (yolcuazalt:Int){

        mevcutyolcu = mevcutyolcu - yolcuazalt


    }







}