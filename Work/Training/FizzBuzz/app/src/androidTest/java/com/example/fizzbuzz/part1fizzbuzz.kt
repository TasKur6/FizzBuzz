package com.example.fizzbuzz

fun main() {
    var loopNumber = 1

    while (loopNumber <= 300) {
        val finalString = calculateFizzBuzz(loopNumber)
        loopNumber += 1
        println(finalString)
    }
}

fun calculateFizzBuzz(input: Int): String {
    var number = input
    val brokenUpString = mutableListOf<String>()

    if (number % 11 == 0) {
        if(number % 13 == 0) {
            brokenUpString.add("Fezz")
        }
        brokenUpString.add("Bong")
        number += 1
        return convertToString(brokenUpString)
    }
    if (number % 3 == 0) {
        brokenUpString.add("Fizz")
    }
    if (number % 13 == 0) {
        brokenUpString.add("Fezz")
    }
    if (number % 5 == 0) {
        brokenUpString.add("Buzz")
    }
    if (number % 7 == 0) {
        brokenUpString.add("Bang")
    }
    if (number % 17 == 0) {
        brokenUpString.reverse()
    }
    if (brokenUpString.toString() == "[]") {
        brokenUpString.add(number.toString())
    }
    return convertToString(brokenUpString)
}

fun convertToString(list: MutableList<String>): String {
    var convertedToString = ""
    for (item in list) {
        convertedToString += item
    }
    return convertedToString
}