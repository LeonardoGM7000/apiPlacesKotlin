package com.example.api2.ui.theme

import com.google.gson.annotations.SerializedName

data class PlacesClass (
    @SerializedName("places" ) var places : ArrayList<Places> = arrayListOf()
)