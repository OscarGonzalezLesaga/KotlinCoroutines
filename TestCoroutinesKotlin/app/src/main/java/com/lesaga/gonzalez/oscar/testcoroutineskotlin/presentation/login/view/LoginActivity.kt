package com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.R
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.entity.ErrorResponse
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.server.data.Login
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.home.view.HomeActivity
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.login.presenter.LoginPresenter
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.login.presenter.LoginPresenterImpl
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.login.view.LoginView
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.utils.showToast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {

    private val presenter: LoginPresenter = LoginPresenterImpl()

    override fun manageLoginOk(login: Login) {
        showToast("${getString(R.string.welcome)} : ${login.name}")
        startActivity(Intent(this, HomeActivity::class.java))
    }

    override fun manageLoginError(error: ErrorResponse) {
        showToast(error.message)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        iniData()
    }

    private fun iniData() {
        presenter.attachView(this)
        btnLogin.setOnClickListener {
            manageLoginClick()
        }
    }

    private fun manageLoginClick() {
        presenter.manageLogin(inputEmail.text.toString(), inputPassword.text.toString())
    }

}

