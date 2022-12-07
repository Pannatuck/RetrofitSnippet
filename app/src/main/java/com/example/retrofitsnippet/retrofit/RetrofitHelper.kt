package com.example.retrofitsnippet.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    val baseUrl = "https://quotable.io/"

    // этот метод будет использоваться для роботы с Retrofit, он будет делать обращегия на указанный ресурс
    // и выполнять нужные запросы, указанные в нашем случае в QuotesApi
    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
                // этот конвертер нужен для перевода объектов из JSON в Java object
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}