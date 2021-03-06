package com.cagatayinyurt.kotlincoroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Light weight Babyyyy

//        GlobalScope.launch {
//            repeat(100000) {
//                launch {
//                    println("android")
//                }
//            }
//        }

        // Scope
        // Global Scope, runBlocking, CoroutineScope

        // runBlocking
//        println("runBlocking start")
//        runBlocking {
//            launch {
//                delay(5000)
//                println("runBlocking")
//            }
//        }
//        println("runBlocking end")

        // GlobalScope
//        println("GlobalScope Start")
//        GlobalScope.launch {
//            delay(5000)
//            println("GlobalScope")
//        }
//        println("GlobalScope End")

        // CoroutineScope
        println("CoroutineScope Start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("CoroutineScope")
        }
        println("CoroutineScope End")

    }
}