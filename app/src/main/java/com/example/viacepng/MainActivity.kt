package com.example.viacepng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viaCepApi= RetrofitHelper.getInstance().create(ViaCepApi::class.java)
        // iniciando uma nova coroutine
        GlobalScope.launch{
            val result= viaCepApi.getEnderecos()
            if(result!= null)
                Log.d("Retorno da API: ", result.body().toString())
        }
    }
}
//1- instrucoes build.gradle

//6- botao direito no com.example / new / kotlin class file / tipo data class / nome

//9- botao direito no com.example /new / kotlin class file / tipo interface / nome ViaCepApi
//10- instrucoes viacepapi

//13- botao direito no com.example / new / kotlin class file / tipo object / nome RetrofitHelper
//14- instrucoes retrofithelper

//17- colar esses codigos na classe oncreate e dar enter para imports
//18- pasta manifests / androidmanifest.xml e colar a permissao:
// <uses-permission android:name="android.permission.INTERNET"></uses-permission>
