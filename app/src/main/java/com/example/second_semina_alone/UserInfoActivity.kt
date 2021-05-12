package com.example.second_semina_alone

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.second_semina_alone.databinding.ActivityUserInfoBinding
import com.example.second_semina_alone.databinding.FragmentFollowingBinding

class UserInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //액티비티에서 보여줄 프래그맨트 생성
        val followingFragment = Following_Fragment()

        //프래그멘트매니저가 프래그멘트를 관리할 transaction(작업단위) 생성
        val transaction = supportFragmentManager.beginTransaction()

        //해당 작업단위에서
        // 어떤 view(id 참고)에 어떤 fragment를 보여줄 것인가?
        // 그것이 해당 뷰에 추가하는 일이다 선언
        transaction.add(R.id.user_info_fragment,followingFragment)
        //실제 xml에서 프래그멘트를 담을 공간의 id를 user_info_fragment라 함
        //이 공간에 방금 생성한 followingFragment를 넣어주세요


        //실제 실행
        transaction.commit()

        //more버튼 클릭 시
        //home으로 이동
        binding.button.setOnClickListener(){
            val Intent = Intent(this,HomeActivity::class.java)
            startActivity(Intent)

        }
    }


}


