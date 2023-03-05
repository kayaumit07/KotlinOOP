package com.example.kotlinoop

/**
 *
 * Property //
 *
 * Encapsülation
 * Sınıf içerisinde bilgileri saklama işlemi

*/


class Musician(name: String, insturment: String, age: Int) {
    var name:String?= name
        private set
        get

    private var insturment:String?= insturment
    private var age:Int?= age


   /** init {
        this.name="Default"
        this.insturment="Guitar"
        this.age=0
    }*/
}