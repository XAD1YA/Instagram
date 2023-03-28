package com.xadiyatullox.instagram.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface Int {

    fun retrofitInstance(): Api{
        return Retrofit.Builder()
            .baseUrl(Companion.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }

    companion object {
        const val BASE_URL = "https://reqres.in/api/"
    }
}