package com.abrebo.filmlerapp.data.model


import org.jetbrains.annotations.NotNull
import java.io.Serializable


data class Filmler(var id:Int,
                   var ad:String,
                   var resim:String,
                   var fiyat:Int):Serializable {
}