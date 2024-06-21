package com.example.vitbatch.kotlinexs
import com.example.vitbatch.student
import com.example.vitbatch.employee

fun main() {
    println("hello world")
    var mystudent: student = student(nAME = "meher", age = 12, address = "ananthapur")
    println("name is" + mystudent.nAME)
    mystudent.nAME = "mehera"
    println("name changed to " + mystudent.nAME)
    var employee:employee=employee(nAME = "MEHER", age = 12, address = "ananthapur")
    println("name of employee"+employee.nAME)
    println("name of age employee"+employee.age)
    println("name of age employee"+employee.address)
}