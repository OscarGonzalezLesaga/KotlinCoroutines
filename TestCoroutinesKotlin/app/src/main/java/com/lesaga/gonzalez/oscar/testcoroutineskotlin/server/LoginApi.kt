package com.lesaga.gonzalez.oscar.testcoroutineskotlin.server

import com.lesaga.gonzalez.oscar.testcoroutineskotlin.server.ParamServer.Companion.LOGIN_END_POINT
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.server.data.Login
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface LoginApi {

    @GET(LOGIN_END_POINT)
    fun getLogin(): Deferred<Response<Login>>
}