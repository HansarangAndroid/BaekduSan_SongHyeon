package com.example.second_semina_alone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.second_semina_alone.data.SecondInfo
import com.example.second_semina_alone.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    //프래그먼트 상속
    //프래그멘트가 죽지못하고 메모리를 비울수없는 상황 예방해주는 binding
    // 질문 ?= null이 이게 프래그멘트가 없는 경우 null값이다. 그니까 메모리 비우고 예방해주는건가?
    //남이 사용하면 안되니까 private
    //왜 var일까?
    private var _binding : FragmentSecondBinding? = null
    private val binding get() = _binding?:error("뷰참조 실패")



    override fun onCreateView(
            //뷰를 그리는 시점
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //저 것들은 뭘까?
        _binding = FragmentSecondBinding.inflate(
                inflater,
                container,
                false)
        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        //프래그멘트가 죽으면 메모리를 비워주기 위해
        //null로 만들어귀
        _binding =null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //onCreateView 로 뷰 제작 후 Activity에 접근하기
        //리싸이클러뷰에 adapter 연걸하기
        //adapter를 통해 데이터->뷰로 바꿔주고 출력해주기 위해서

        //1. 어댑터에 초기값 넣어주기
        val SecondListAdapter = SecondListAdapter()

        //2 RecylerView 에 어댑터를 우리가 만든 어댑터로 만들기
        binding.userList2.adapter = SecondListAdapter

        SecondListAdapter.userlist2.addAll(
                listOf<SecondInfo>(
                        SecondInfo(
                                usernaem = "김송현",
                                fimage = "모르겠다"

                        ),
                        SecondInfo(

                                usernaem = "안드로이드",
                                fimage = "모르겠다"
                        )
                )


        )

        SecondListAdapter.notifyDataSetChanged()

    }


    }
