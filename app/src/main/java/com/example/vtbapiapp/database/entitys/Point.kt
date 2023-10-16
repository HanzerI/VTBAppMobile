package com.example.vtbapiapp.database.entitys

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity
data class Point(
    @SerializedName("latitude") val latitude: Double,
    @SerializedName("longitude") val longitude: Double
)