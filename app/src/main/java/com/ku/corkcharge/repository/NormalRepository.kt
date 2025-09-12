package com.ku.corkcharge.repository

import com.ku.corkcharge.data.NormalResponse
import com.ku.corkcharge.service.NormalService
import retrofit2.Response
import javax.inject.Inject

interface NormalRepository {
    suspend fun getNormal(): Response<List<NormalResponse>>
}

class NormalRepositoryImpl @Inject constructor(
    private val api: NormalService
): NormalRepository {
    override suspend fun getNormal(): Response<List<NormalResponse>> {
        return api.getNormal()
    }
}