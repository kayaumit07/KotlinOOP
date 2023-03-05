package com.example.kotlinoop

class Piano:InterfaceHouseDecor, Insturment {
    var brand:String?=null
    var digital:Boolean?=null
    override var roomName: String
        get() = "Kitchen"
        set(value) {}



}