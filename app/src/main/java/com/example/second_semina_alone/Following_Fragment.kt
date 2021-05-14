package com.example.second_semina_alone

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.example.second_semina_alone.databinding.ActivityUserInfoBinding
import com.example.second_semina_alone.databinding.FragmentFollowingBinding

//처음에 생성되면 쓸데없는게 굉장히 많음
//onCreateView 남기고 다 지우기!
class Following_Fragment : Fragment() {
    //프래그먼트 상속
    private var _binding: FragmentFollowingBinding? =null
    private val binding get() = _binding ?:error("뷰를 참조하기 우해 바인딩이 초기화되지 않았습니다")

    override fun onCreateView(


        //액티비티와 다른 생명주기이지만 이름은 비슷
        //뷰를 그리는 시점의 주기
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_following_, container, false)
        // inflate xml을 메모리에 객체화 == setContentView
        _binding = FragmentFollowingBinding.inflate(
                inflater,
                container,
                false)
        return binding.root




    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //리싸이클러뷰에 adapter 연결하기
        //뷰가 만들어지는 시점, 프래그먼트에서 뷰가 만들어지고 나서 액티비티에 접근할 수 있는 시점에 어댑터 넣어주기
        //그래서 어댑터가 무엇인가?
        // 1. 우리가 사용할 어댑터의 초기값 넣어주기
        val followingListAdapter = FollowingListAdapter()
        //2. RecylerView 에 어댑터를 우리가 만든 어댑터로 만들기

        binding.userList.adapter = followingListAdapter
        /*(binding.userList.addItemDecoration(
                DividerItemDecoration(this,DividerItemDecoration.VERTICAL)
        )*/


        //Adapter에 데이터 넣고 갱신하기
        //어댑터에서 userList를 꺼내서 리스트데이터 추가하기
        followingListAdapter.userList.addAll(
                listOf<FollowingUserInfo>(
                        FollowingUserInfo(
                                userImage = R.drawable.beme,
                                userName = "BeMe"
                        ),
                        FollowingUserInfo(
                                userImage = R.drawable.sopt27,
                                userName = "SOPT 27"
                        ),
                        FollowingUserInfo(
                                userImage = R.drawable.and,
                                userName = "Anroid"
                        ),
                        FollowingUserInfo(
                                userImage = R.drawable.insta,
                                userName = "Instagram"
                        ),
                        FollowingUserInfo(
                                userImage = R.drawable.whale,
                                userName = "칭찬할고래"
                        ),
                        FollowingUserInfo(
                                userImage = R.drawable.whale,
                                userName = "칭찬할고래"
                        ),
                        FollowingUserInfo(
                                userImage = R.drawable.whale,
                                userName = "칭찬할고래"
                        ),

                )

        )

        //어댑터야 모든 데이터가 변했으니 다시 그려줘~~~
        //부분적으로 데이터를 바꾸고 싶은 사람은 심화과제 해보기
        followingListAdapter.notifyDataSetChanged()



    }




}