package com.lesaga.gonzalez.oscar.testcoroutineskotlin.server

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface LoginApi {

    @GET("todos/1")
    fun getLogin(): Deferred<Response<Login>>
}