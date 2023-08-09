package com.example.mobilefinalproject.retrofit

class RetrofirClient {

    companion object{
        fun getClient(baseUrl:String) : Retrofit{
            return Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
                .build()

        }
    }

}
