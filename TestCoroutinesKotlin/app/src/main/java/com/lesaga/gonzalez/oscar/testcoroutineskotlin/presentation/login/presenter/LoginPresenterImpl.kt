package com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.login.presenter

import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.entity.ErrorResponse
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.server.data.Login
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.domain.usecase.GetLogin
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.domain.usecase.UseCaseCallBack
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.login.view.LoginView

class LoginPresenterImpl : LoginPresenter {

    private var view: LoginView? = null
    private var getLogin: GetLogin = GetLogin()

    override fun attachView(view: LoginView) {
        this.view = view
    }

    override fun manageLogin(user: String, password: String) {
        getLogin.execute(object : UseCaseCallBack<Login> {
            override fun success(login: Login) {
                view?.manageLoginOk(login)
            }

            override fun error(error: ErrorResponse) {
                view?.manageLoginError(error)
            }

        })
    }
}