package com.lesaga.gonzalez.oscar.testcoroutineskotlin.utils

import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

fun AppCompatActivity.showToast(text: String, duration: Int = LENGTH_SHORT) {
    this.runOnUiThread {
        Toast.makeText(this, text, duration).show()
    }
}