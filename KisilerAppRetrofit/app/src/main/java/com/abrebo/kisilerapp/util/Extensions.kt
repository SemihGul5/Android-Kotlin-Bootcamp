package com.abrebo.kisilerapp.util

import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation


fun Navigation.gecisYap(it:View,gecisID:Int){
    findNavController(it).navigate(gecisID)
}
fun Navigation.gecisYap(it:View,navDirections: NavDirections){
    findNavController(it).navigate(navDirections)
}