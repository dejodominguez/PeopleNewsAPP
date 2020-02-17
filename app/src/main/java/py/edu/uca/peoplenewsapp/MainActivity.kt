package py.edu.uca.peoplenewsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*
import py.edu.uca.peoplenewsapp.Consumer.Common
import py.edu.uca.peoplenewsapp.Remote.IMyAPI
import py.edu.uca.peoplenewsapp.models.APIResponse
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.AbstractExecutorService

class MainActivity : AppCompatActivity() {

    internal lateinit var mService: IMyAPI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Init Service
        mService = Common.api

        //Event
        //txtUsusario.setOnClickListener { startActivity(Intent(this@MainActivity,MainActivityMenu::class.java)) }
        btnLogin.setOnClickListener { authenticateUser(txtUsusario.text.toString(), txrPassword.text.toString()) }
    }

    private fun authenticateUser(txtUsusario: String, txrPassword: String) {
        mService.loginUser(txtUsusario, txrPassword)
            .enqueue(object: Callback<APIResponse> {
                override fun onFailure(call: retrofit2.Call<APIResponse>?, t: Throwable?) {
                    Toast.makeText(this@MainActivity,t!!.message,Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: retrofit2.Call<APIResponse>?, response: Response<APIResponse>?) {
                    if (response!!.body()!!.isError)
                        Toast.makeText(this@MainActivity, response.body()!!.errormsg,Toast.LENGTH_LONG).show()
                        else
                        Toast.makeText(this@MainActivity,"Login Acceso",Toast.LENGTH_LONG).show()

                }
            })
    }


}
