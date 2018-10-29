package com.lesaga.gonzalez.oscar.testcoroutineskotlin.server.data

import com.google.gson.annotations.SerializedName

data class Login(@SerializedName("id") val id: String = "", @SerializedName("title") val name: String = "")