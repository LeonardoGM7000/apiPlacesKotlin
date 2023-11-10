package com.example.api2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.api2.ui.theme.PlacesResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting() {

    val body =  RequestBodyDto("hotel")

    var responseText by remember { mutableStateOf("Hello!") }

    val retrofit = remember {
        Retrofit.Builder()
            .baseUrl("https://places.googleapis.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService = remember { retrofit.create(ApiService::class.java) }

    LaunchedEffect(apiService) {
        try {
            val response = apiService.postRequest(body).execute()
            if (response.isSuccessful) {
                Log.i("testAndroid2", "funciono:)))")
            } else {
                Log.e("testAndroid2", "no funciono:(((")
            }
        } catch (e: Exception) {
            Log.e("testAndroid3", "Exception: ${e.message}")
        }
    }

    Text(text = responseText)
}

interface ApiService {
    @Headers(
        "Content-Type: application/json",
        "X-Goog-Api-Key: AIzaSyBpmAJRF6PsRJVNm6oq1qmfXbdaBjNA5mQ",
        "X-Goog-FieldMask: places.formattedAddress"
    )
    @POST("v1/places:searchText")
    fun postRequest(@Body requestBodyDto: RequestBodyDto): Call<PlacesResponse>
}


data class RequestBodyDto(val textQuery: String)

//https://places.googleapis.com/v1/places:searchText

