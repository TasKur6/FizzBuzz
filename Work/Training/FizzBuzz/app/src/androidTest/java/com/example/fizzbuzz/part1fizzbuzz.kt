package com.example.fizzbuzz

fun main() {
    var x = 1
    while (x <= 100) {
        if (x % 3 == 0 || x % 5 == 0) {
            if (x % 3 == 0) {
                print("Fizz")
            }
            if (x % 5 == 0) {
                print("Buzz")
            }
        }
        else {
            print(x)
        }
        x += 1
        println()
    }

}