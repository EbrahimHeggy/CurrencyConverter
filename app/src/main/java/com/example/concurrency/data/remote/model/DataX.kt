package com.example.concurrency.data.remote.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName


@Entity("fav_currencies")
data class DataX(
    @PrimaryKey(autoGenerate = false)
    val code: String,
    val imageUrl: String,
    val name: String
)