package com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.login.presenter

import com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.login.view.LoginView

interface LoginPresenter {
    fun attachView(view: LoginView)
    fun manageLogin(user: String, password: String)
}