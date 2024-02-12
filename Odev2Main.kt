package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){

    val f = Odev2()

    var soru1 = f.soru1(5)
    println("İç açılar toplamık : $soru1")

    var soru2 = f.soru2(10)
    println("Maaş toplamı : $soru2")

    var soru3 = f.soru3(5)
    println("Otopark ücret : $soru3")

    var soru4 = f.soru4(5.0)
    println("Mil : $soru4")

    var soru5 = f.soru5(5.0,7.0)
    println("Dikdörtgen alanı : $soru5")

    var soru6 = f.soru6(4)
    println("Faktöriyel : $soru6")

    var soru7 = f.soru7("medine")
    println("E harfinin adeti : $soru7")
}
