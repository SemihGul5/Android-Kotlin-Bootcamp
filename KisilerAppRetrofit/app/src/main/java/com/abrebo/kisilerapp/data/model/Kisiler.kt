package com.abrebo.kisilerapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

data class Kisiler(var kisi_id:Int,
                   var kisi_ad:String,
                   var kisi_tel:String): Serializable {
}