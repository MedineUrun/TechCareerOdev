package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {

    fun soru1(kenarSayisi:Int):Int{
        return (kenarSayisi - 2) * 180
    }

    fun soru2(gunSayisi:Int):Int{
        var topSaat = gunSayisi * 8
        var maas:Int = 0
        if(topSaat > 150){
            maas = 150 * 40
            maas += (topSaat - 150) * 80
            return maas
        }else{
            return topSaat * 40
        }
    }

    fun soru3(otoparkSuresi:Int):Int{
        return if(otoparkSuresi > 1){
            50 + ((otoparkSuresi - 1) * 10)
        }else{
            50
        }
    }

    fun soru4(km:Double):Double{
        return km * 0.621
    }

    fun soru5(kenar1:Double, kenar2:Double):Double{
        return kenar1 * kenar2
    }

    fun soru6(sayi:Int):Int{
        var toplam = 1
        var count = sayi
        while (count > 0){
            toplam *= count
            count--
        }
        return toplam
    }

    fun soru7(kelime:String):Int{
        var count = 0
        for (element in kelime){
            if (element == 'e'){
                count++
            }
        }
        return count
    }

}