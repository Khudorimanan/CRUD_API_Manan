package com.example.crud_api_manan

import com.google.gson.annotations.SerializedName

class ResultStaff (
    @field: SerializedName("pesan")
    val pesan: String? = null,
    @field: SerializedName("staff")
    val staff: List<DataItem>? = null,
    @field: SerializedName("status")
    val status: Int? = null
)
