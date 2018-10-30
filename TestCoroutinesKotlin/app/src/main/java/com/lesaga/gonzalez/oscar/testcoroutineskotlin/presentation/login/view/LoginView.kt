package com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.login.view

import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.entity.ErrorResponse
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.server.data.Login


interface LoginView {
    fun manageLoginOk(login: Login)
    fun manageLoginError(error: ErrorResponse)
}