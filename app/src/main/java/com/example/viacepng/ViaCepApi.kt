package com.example.viacepng

import retrofit2.Response
import retrofit2.http.GET

interface ViaCepApi {
    @GET("/ws/31250-010/json")
    suspend fun getEnderecos() : Response<Endereco>
}
//11- cola esses codigos e da enter no @GET e response para dar imports
//12- instrucoes mainactivity
