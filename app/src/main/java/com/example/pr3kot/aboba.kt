package com.example.pr3kot

fun main(){

    readln().run{
        count() { c -> c.lowercaseChar() == 'p' }.run(::println)
    }

}