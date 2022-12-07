package com.example.retrofitsnippet.retrofit

import com.example.retrofitsnippet.retrofit.retrofitDataClass.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {
    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}