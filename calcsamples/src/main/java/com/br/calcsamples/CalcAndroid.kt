package com.br.calcsamples

class CalcAndroid {
    fun numberSum(number: ArrayList<Int>, operation:String): Int {
        var result:Int = 0
        number.forEach {
            result = when(operation){
                "-" -> result - it
                "+" -> result + it
                else -> 0
            }
        }
        return result
    }
}