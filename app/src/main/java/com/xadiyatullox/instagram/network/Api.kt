package com.xadiyatullox.instagram.network

import com.xadiyatullox.instagram.model.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

sealed interface Api{

@Headers("Content-type:application/json")

@GET("users")
fun getAllUsers(): Call<List<Data>>}