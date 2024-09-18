package com.example.viacepng

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    val baseUrl = "https://viacep.com.br"

    fun getInstance() : Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
//15- colar esses codigos e dar enter no retrofit e gsonconverter p imports
//16- insrucoes main activity
