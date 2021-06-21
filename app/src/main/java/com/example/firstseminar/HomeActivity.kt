package com.example.firstseminar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.firstseminar.SharedPrference.CherishUserAuthStorage
import com.example.firstseminar.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        OnClickLogout()


    }
    private fun OnClickLogout(){
        binding.logoutBtn.setOnClickListener{
            CherishUserAuthStorage.clearAuthStorage(this)
            intent = Intent(this@HomeActivity,SignInActivity::class.java)
            startActivity(intent)

        }

    }



    override fun onStart() {
        super.onStart()
        Log.d("자기소개화면","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("자기소개화면","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("자기소개 화면","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("자기소개화면","onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("자기소개화면","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("자기소개화면","onDestroy")
    }
}

