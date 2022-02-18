package com.cagatayinyurt.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    var userName = ""
    var userAge = 0

    runBlocking {
        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()
        userAge = downloadedAge.await()

        println("$userName $userAge")

//        launch {
//            val downloadedName = downloadName()
//            println(downloadedName)
//        }
//        launch {
//            val downloadedAge = downloadAge()
//            println(downloadedAge)
//        }
    }
}

suspend fun downloadName() : String {
    delay(2000)
    val userName = "JohnDoe: "
    println("username download")
    return userName
}

suspend fun downloadAge() : Int {
    delay(4000)
    val userAge = 26
    println("userage download")
    return userAge
}