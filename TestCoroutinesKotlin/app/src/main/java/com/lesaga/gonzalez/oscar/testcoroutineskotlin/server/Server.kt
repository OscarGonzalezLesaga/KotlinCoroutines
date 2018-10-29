package com.lesaga.gonzalez.oscar.testcoroutineskotlin.server

import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Server {
    companion object {
        inline fun <reified T> getServer(
            endPoint: String = "https://jsonplaceholder.typicode.com/",
            factory: Converter.Factory? = null
        ): T {
            val finalFactory = factory
                ?: GsonConverterFactory.create(GsonBuilder().create())

            val retrofit = Retrofit.Builder().baseUrl(endPoint).addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(finalFactory).build()

            return retrofit.create(T::class.java)
        }

    }
}