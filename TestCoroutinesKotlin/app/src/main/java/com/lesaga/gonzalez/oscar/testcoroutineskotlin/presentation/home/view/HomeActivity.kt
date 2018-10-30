package com.lesaga.gonzalez.oscar.testcoroutineskotlin.presentation.home.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.R

class HomeActivity : AppCompatActivity(), HomeView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}