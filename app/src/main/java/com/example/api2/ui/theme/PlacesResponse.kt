package com.example.api2.ui.theme

import com.google.gson.annotations.SerializedName

data class PlacesResponse(
    @SerializedName("places") var places: List<Place>
)

data class Place(
    val formattedAddress: String,
)
