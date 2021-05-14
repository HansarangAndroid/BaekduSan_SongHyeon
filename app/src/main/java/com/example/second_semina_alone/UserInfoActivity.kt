package com.example.second_semina_alone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.second_semina_alone.databinding.ActivityUserInfoBinding
import com.example.second_semina_alone.databinding.FragmentFollowingBinding



class UserInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val followingFragment = Following_Fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.user_info_fragment,followingFragment)
        transaction.commit()




    }


}


