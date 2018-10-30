package com.lesaga.gonzalez.oscar.testcoroutineskotlin.domain.usecase

import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.entity.ErrorResponse
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.server.LoginApi
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.server.Server
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.server.data.Login
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class GetLogin : UseCase<Login> {


    override fun execute(callBack: UseCaseCallBack<Login>) {
        GlobalScope.async {
            var response = Server.getServer<LoginApi>().getLogin().await()
            if (response.isSuccessful) {
                response.body()?.let {
                    callBack.success(it)
                }
            } else {
                callBack.error(ErrorResponse(response.code(), response.message()))
            }
        }


    }

}