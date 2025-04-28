package com.example.registro_usuarios

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
 data class Usuario( var nombre: String,
    var password: String):Parcelable {

}