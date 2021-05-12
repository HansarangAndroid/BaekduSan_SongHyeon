package com.example.second_semina_alone

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.second_semina_alone.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //여긴 프래그멘트를 띄울 공간!

        //여기서 보여줄 프래그멘트 생성
        val SecondFragment = SecondFragment()

        //프개르멘트 매니저가 프개르멘트를 관리할 작업 단위생성(transaction)
        val transaction = supportFragmentManager.beginTransaction()

        //어떤 뷰(ID)에 어떤 프래그멘트를 넣을 것인가?
        //해당 작업단위에서
        transaction.add(R.id.second_semina,SecondFragment)

        transaction.commit()




    }
}