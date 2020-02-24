package py.edu.uca.peoplenewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import py.edu.uca.peoplenewsapp.Consumer.Common
import py.edu.uca.peoplenewsapp.Remote.LoginAPI
import py.edu.uca.peoplenewsapp.models.APIResponse
import py.edu.uca.peoplenewsapp.models.Login
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    internal lateinit var mService: LoginAPI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Init Service
       mService = Common.api

        //Event
        //txtUsusario.setOnClickListener { startActivity(Intent(this@MainActivity,MainActivityMenu::class.java)) }
        btnLogin.setOnClickListener { authenticateUser(txtUsusario.text.toString(), txrPassword.text.toString()) }
    }

    private fun authenticateUser(usuario: String, password: String) {
        mService.getlogin(usuario, password)
            .enqueue(object : Callback<Login> {
                override fun onFailure(call: retrofit2.Call<Login>?, t: Throwable?) {
                    Toast.makeText(this@MainActivity,t!!.message,Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: retrofit2.Call<Login>?, response: Response<Login>?) {
                    Log.d("test", "respuesta¨: ${response?.body()}")

                    //if (response!!.body()!!.error)
                        //Toast.makeText(this@MainActivity, response.body()!!.errormsg,Toast.LENGTH_LONG).show()
                       // else
                        Toast.makeText(this@MainActivity,"Login Acceso",Toast.LENGTH_LONG).show()

                }
            })
    }


}
