package py.edu.uca.peoplenewsapp.Consumer

import py.edu.uca.peoplenewsapp.Remote.LoginAPI
import py.edu.uca.peoplenewsapp.Remote.RetrofitClient

object Common {
    //val BASE_URL="http://630ded24.ngrok.io/REST_New_People/webresources/"
    val BASE_URL="http://10.0.2.2:8080/REST_New_People/webresources/"
    val api:LoginAPI
    get() = RetrofitClient.getClient(BASE_URL).create(LoginAPI::class.java)
}