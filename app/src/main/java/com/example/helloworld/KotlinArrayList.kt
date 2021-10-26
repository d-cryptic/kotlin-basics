package com.example.helloworld

//Why should you use arrayLists
//ArrayLists are used to create a dynamic array. which means the size of an arraylist can be increase or decreased according to your requirement
// The arraylist class provides both read and write functionalities
// the arrayList follows the sequence of insertion order
// An arraylist is non synchronized and it may contain duplicate elements

//constructor of arraylist
/*
* ArrayList<E>(): Is used to create an empty ArrayList
* ArrayList(capacity:Int): Is used to create an ArrayList of specified capacity
* ArrayList(elements:Collection<E>): Is used to creeate an ArrayList filled with the elements of a collection
* */

//Functions of ArrayList
/*
* open fun add(element:E):Boolean -> ussed to add the specific element into the collection
* open fun clear() -> used to remove all elements from the collection
* open fun get(index: Int):E -> used to return the element at specified index in the list
* open fun remove(element:E):Boolean -> used to remove a single instance of the specific element from current collection, if it is available
* Many more functions
* */


//Empty ArrayList
//fun main(){
//    val arraylist = ArrayList<String>()   // creating an empty arraylist
//    arraylist.add("One") // adding an object in arraylist
//    arraylist.add("Two")
//    println("...print ArrayList")
//    for(i in arraylist){
//        println(i)
//    }
//}

//Array using collections
//fun main() {
//    val arrayList: ArrayList<String> = ArrayList<String>(5)
//    var list: MutableList<String> = mutableListOf<String>()
//
//    list.add("One")
//    list.add("Two")
//
//    arrayList.addAll(list)
//    println("...print ArrayList...")
//
//
//// Filled elements in ArrayList using collections
//    val itr = arrayList.iterator()
//    while (itr.hasNext()) {
//        println(itr.next())
//    }
//
//    println("size of arrayList = " + arrayList.size)
//
//}

//ArrayList - get()

fun main(args:Array<String>){
    val arrayList:ArrayList<String> = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    for(i in arrayList){
        println(i)
    }

    println("...arrayList.get(1)")
    println(arrayList.get(1))
}