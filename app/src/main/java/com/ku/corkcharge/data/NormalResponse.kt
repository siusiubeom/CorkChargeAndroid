package com.ku.corkcharge.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NormalResponse(
    @SerialName("id")
    val id: Int
)
