package com.ku.corkcharge.service

import com.ku.corkcharge.data.NormalResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NormalService {
    @GET("normal")
    suspend fun getNormal(): Response<List<NormalResponse>>
}