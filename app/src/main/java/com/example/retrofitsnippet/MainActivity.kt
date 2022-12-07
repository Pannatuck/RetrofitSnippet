package com.example.retrofitsnippet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitsnippet.retrofit.QuotesApi
import com.example.retrofitsnippet.retrofit.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)
        // запуск корутины для роботы с Retrofit
        GlobalScope.launch {
            val result = quotesApi.getQuotes()
            if (result != null)
                Log.d("strlght: ", result.body().toString())
        }
    }
}