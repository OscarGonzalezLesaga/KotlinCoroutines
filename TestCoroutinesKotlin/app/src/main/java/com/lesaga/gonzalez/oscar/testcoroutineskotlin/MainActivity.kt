package com.lesaga.gonzalez.oscar.testcoroutineskotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.server.LoginApi
import com.lesaga.gonzalez.oscar.testcoroutineskotlin.server.Server
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniData()
    }

    private fun iniData() {
        GlobalScope.async {
            var response = Server.getServer<LoginApi>().getLogin().await()
            if (response.isSuccessful) {
                user.text = response.body()?.name
            } else {
                Log.d("Error Login:", "${response.code()}")
            }
        }
    }
}