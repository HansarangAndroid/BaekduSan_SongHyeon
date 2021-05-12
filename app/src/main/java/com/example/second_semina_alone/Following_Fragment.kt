package com.example.second_semina_alone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.second_semina_alone.data.FollowingUserInfo
import com.example.second_semina_alone.databinding.FragmentFollowingBinding
//Fragment 생성되면 xml+kt 자동생성
//처음에 생성되면 쓸데없는게 굉장히 많음
//onCreateView 남기고 다 지우기!
class Following_Fragment : Fragment() {
    //프래그먼트 상속
    //프래그멘트가 죽지못하고 메모리를 비울 수 없는 상황 예방 해주는 친구임
    private var _binding: FragmentFollowingBinding? =null
    private val binding get() = _binding ?:error("뷰를 참조하기 우해 바인딩이 초기화되지 않았습니다")

    override fun onCreateView(
        //액티비티와 다른 생명주기이지만 이름은 비슷
        //뷰를 그리는 시점의 주기, 뷰 관련된 초기화가 이루어짐
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //제작한 xml을 사용해 view에 참조하기 위함
        // inflate함수
        // xml을 메모리에 객체화 == setContentView부분과 같다.
        _binding = FragmentFollowingBinding.inflate(
                inflater,
                container,
                false)
        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        //뷰가 만들어질 떄 초기화하고
        //뷰가 죽으면 참조를 삭제해주기
        _binding =null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //onCreateView로 뷰가 만들어진 후. 이때부터 fragment가 activity에 접근 가능
        super.onViewCreated(view, savedInstanceState)
        //리싸이클러뷰에 adapter 연결하기
        //뷰가 만들어지는 시점, 프래그먼트에서 뷰가 만들어지고 나서 액티비티에 접근할 수 있는 시점에 어댑터 넣어주기
        //그래서 어댑터가 무엇인가?
        //뷰와 데이터가 상호작용할 수 있게 도와주는 중간장치, 리모콘이 tv와 연결되어야 잘되듯이
        // 1. 우리가 사용할 어댑터의 초기값 넣어주기
        val followingListAdapter = FollowingListAdapter()

        //2. RecylerView 에 어댑터를 우리가 만든 어댑터로 만들기
        binding.userList.adapter = followingListAdapter

        //Adapter에 데이터 넣고 갱신하기
        //어댑터에서 userList를 꺼내서 리스트데이터 추가하기
        followingListAdapter.userList.addAll(
                listOf<FollowingUserInfo>(
                        FollowingUserInfo(
                                rpName = "겁나게겁나네길게써보자가나다라마바사아자차타타파파",
                                rpex = "완전짱짱긴문장입니다가나다라마바사아자차파타카파아아",
                                la = "kotlin"
                        ),
                        FollowingUserInfo(
                                rpName = "정말정말긴문장이에요",
                                rpex = "너무너무긴문장이에요",
                                la = "kotlin"
                        ),
                        FollowingUserInfo(
                                rpName = "첫번쨰 레포토리",
                                rpex = "너무너무긴문장이에요",
                                la = "kotlin"
                        )

                )
        )
        //어댑터야 모든 데이터가 변했으니 다시 그려줘~~~
        //부분적으로 데이터를 바꾸고 싶은 사람은 심화과제 해보기
        followingListAdapter.notifyDataSetChanged()





    }


}