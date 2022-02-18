package com.cagatayinyurt.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    // Dispatchers
    // Default, IO, Main, Unconfined

    // Dispatchers.Default -> CPU Intensive
    // Dispatchers.IO -> Input / Output -> Networking, Data
    // Dispatchers.Main -> UI
    // Dispatchers.Unconfined -> Inherited Dispatcher

    runBlocking {
        // Module with the Main dispatcher had failed to initialize. Go to MainActivity.kt
        launch(Dispatchers.Main) {
            println("Main Thread ${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO) {
            println("IO Thread ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Default) {
            println("Default Thread ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread ${Thread.currentThread().name}")
        }
    }
}