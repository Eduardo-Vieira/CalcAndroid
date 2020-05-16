package com.br.calcsamples

class CalcAndroid {
    fun numberSun(number: ArrayList<Int>): Int {
        var result:Int = 0
        number.forEach {
            result = result + it
        }
        return result
    }
}