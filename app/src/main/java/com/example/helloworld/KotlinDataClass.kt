package com.example.helloworld

data class User(val id: Long, var name: String)
//open data class User(val id: Long, val name: String) - not works

fun main(){
    val user1 = User(1, "Denis")
//    val name = user1.name
//    println(name)
//    user1.name = "Michael"
    val user2 = User(1, "Michael")

    println(user1 == user2)

    println("User details: $user1")

    println(user1.equals(user2))

    val updatedUser = user1.copy(name="Denis Panjuta")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) //print 1
    println(updatedUser.component2()) // prints denis panjuta

    val (id, name) = updatedUser
//    val id = updatedUser.id
//    val name = updatedUser.name
    println("id=$id, name=$name")
}