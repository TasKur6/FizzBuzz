package com.example.fizzbuzz

fun main() {
    var x = 1

    while (x <= 300) {
        var str = ""
        if (x % 3 == 0 || x % 5 == 0 || x % 7 == 0 || x % 11 == 0 || x % 13 == 0) {
            if (x % 11 == 0) {
                if(x % 13 == 0) {
                    str += "Fezz"
                }
                str += "Bong"
                x += 1
                println(str)
                continue
            }
            if (x % 3 == 0) {
                str += "Fizz"
            }
            if (x % 13 == 0) {
                str += "Fezz"
            }
            if (x % 5 == 0) {
                str += "Buzz"
            }
            if (x % 7 == 0) {
                str += "Bang"
            }
            if (x % 17 == 0) {
                str = rev(str)
            }
        }
        else {
            str += x
        }
        x += 1
        println(str)
    }
}
fun rev(a: String): String {
    var cp = a
    var str = ""
    while (cp != "") {
        str += cp.substring(cp.length - 4, cp.length)
        cp = cp.substring(0, cp.length - 4)
    }
    return str
}