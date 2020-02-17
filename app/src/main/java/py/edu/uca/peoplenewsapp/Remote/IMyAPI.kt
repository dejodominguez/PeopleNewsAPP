package py.edu.uca.peoplenewsapp.Remote


import py.edu.uca.peoplenewsapp.models.APIResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface IMyAPI {
    @FormUrlEncoded
    @POST("register")
    fun registerUser(@Field("name") name:String, @Field("pass") password: String): Call<APIResponse>

    @FormUrlEncoded
    @POST("login")
    fun loginUser(@Field("name") name:String, @Field("pass") password: String): Call<APIResponse>
}