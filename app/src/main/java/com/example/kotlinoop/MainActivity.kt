package com.example.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myUser=User()
        myUser.name="James"
        myUser.age=19
        println(myUser.information())

        var james=Musician("James","Guitar",20)

        var myPiano=Piano()
        myPiano.brand="Yamaha"
        myPiano.roomName="Jack"
        myPiano.digital=true
        myPiano.info()


        //Lambda expressions
        var myTestString={myString:String ->  println(myString) }

        myTestString("My Lambda String")

        // Fonk ve classların geri dönüş değerini yazmazsak default olarak Unit(boş) döner
        // String, Int, Boolean gibi değerler dönerse türü Unit'ten o tanıma döner

        var sum={x:Int,y:Int-> println((x+y).toString()) }
        sum(13,25)

        var sum2 :(Int,Int)->Int={a,b -> a+b}
        println(sum2(2,5).toString())

        //asynchronous
        //callback func, listener func, completion fun(tamamlanma fonk)
        /**
         * Asyncler internetten veri çekilirken app in kitlenip kalmamasını
         * onu arka planda devam ettirip diğer işlemlere devam etmemizi sağlar.
         */
        fun downloadMusician(url: String,completion : (Musician) -> Unit){
            //url -> download
            //data geldikten sonra completion calıştırılacak.
            val kirk=Musician("Kirk","Guitar",60)
            completion(kirk)
        }
        downloadMusician("metallica.com") {
            println(it.name)
        }


    }
}