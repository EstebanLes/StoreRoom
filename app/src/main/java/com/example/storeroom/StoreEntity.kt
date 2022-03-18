package com.example.storeroom

import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "StoreEntity")
data class StoreEntity(
    var id: Long = 0,
    var name: String,
    var phone: String = "",
    var website: String = "",
    var isFavorite: Boolean = false
)
