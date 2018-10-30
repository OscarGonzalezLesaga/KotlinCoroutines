package com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.server.data

import com.google.gson.annotations.SerializedName

data class Login(
    @SerializedName("id") val id: String = "", @SerializedName("first_name") val name: String = "",
    @SerializedName("last_name") val surname: String = ""
)