package py.edu.uca.peoplenewsapp.Consumer

import py.edu.uca.peoplenewsapp.Remote.IMyAPI
import py.edu.uca.peoplenewsapp.Remote.RetrofitClient

object Common {
    val BASE_URL="http://localhost:8080/REST_New_People/webresources/entity."

    val api:IMyAPI
    get() = RetrofitClient.getClient(BASE_URL).create(IMyAPI::class.java)
}