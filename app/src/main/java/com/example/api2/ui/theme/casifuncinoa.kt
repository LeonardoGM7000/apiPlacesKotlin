package com.example.api2.ui.theme

/*
package com.example.api2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.api2.ui.theme.Api2Theme
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
import retrofit2.http.POST

class MainActivity : ComponentActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("testAndroid", "1")

        setContent {
            Greeting()
        }
    }


}

@Composable
fun Greeting() {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://places.googleapis.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(ApiService::class.java)


    fun llamar(){
        apiService.postRequest(body).enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                Log.i("testAndroid", "funciono:)))")
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                Log.e("testAndroid", "no funciono:(((")
            }
        })
    }

    Log.i("testAndroid", "1")

    llamar()

    Log.i("testAndroid", "2")
    Text(
        text = "Hello Leo!",
    )
}

interface ApiService {

    @POST("places:searchText")
    fun postRequest(@Body body: Map<String, Any>): Call<ResponseBody>
}

val body = mapOf(
    "Content-Type" to "application/json",
    "textQuery" to "Spicy Vegetarian Food in Sydney, Australia",
    "X-Goog-Api-Key" to "AIzaSyBpmAJRF6PsRJVNm6oq1qmfXbdaBjNA5mQ",
    "X-Goog-FieldMask" to "places.formattedAddress",
)

//https://places.googleapis.com/v1/places:searchText


 */