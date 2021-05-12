package com.example.second_semina_alone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.second_semina_alone.data.FollowingUserInfo
import com.example.second_semina_alone.databinding.ItemFollowerUserBinding

// Adapter란?
// 두 사물이 상호작용할 수 있게하는 방법, 장치
// 인터페이스 ex) 리모콘 == tv 인터페이스
// 데이터와 뷰를 상호작용하게 해줌
// 데이터를 viewholder으로 감싸 뷰에서 나타낼 수 있게하는 장치
//데이터->뷰로 바꿔줌

//1. Adapter는 RecylcerView의 Adapter를 상속받아야함
// <> 안에는 데이터를 어떤 뷰로 바꿀지 해당하는 뷰홀더가 들어감
// <ViewHolder> 부분으로 해당 어댑터가 어떤 뷰홀더로 변경하는지 알려줌
class FollowingListAdapter : RecyclerView.Adapter<FollowingListAdapter.FollowingUserViewHolder>(){


    //viewholder로 변경할 data 가지고 있기
    val userList = mutableListOf<FollowingUserInfo>()
//ViewHolder?
//뷰에대한 정보를 넣어주는 역할
// view의 요소 관리자
// activity 홀더의 view를 담고있는 상자(layout) 관리자
    //아이템마다 viewholder를 만드는 방법 정의함
// Adapter에서 데이터를 뷰로 변환하기 위해서
//뷰를 잡고 관리하는
//뷰홀더를 어떻게 만들 것인가?
//뷰홀더 반환
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowingUserViewHolder {
    // 뷰홀더에서 뷰를 참조,관리를 위해서
    //ViewBinding 객체 만들어주기
    //item_follow_user.xml에 뷰로 만들어줄 데이터(username,userid)가 담김
    //이곳을 객체로 넘겨줘야함
        val binding = ItemFollowerUserBinding.inflate(
//LayoutInflater?
// RecylcerView에서 ViewHolder에서 뷰를 만들때
// 도와주는친구

// context : 앱의 흐름과 정보를 담음. 얘가 있어야 앱의 리소스 접근가능. LayoutInflater와 친구
// .from ? parent? 부모 뷰 그룹에서 정보를 줌
                LayoutInflater.from(parent.context),
                parent,
                false
        )


    // 뷰홀더에 참조할 뷰 객체 넘겨주기
        return FollowingUserViewHolder(binding)
    }

    //위에서 뷰홀더에 Data(뷰 객체)를 넣어줬으니
    //Data를 전달해보자
    //내가 준 데이터를 뷰에 배치해줘!!
    override fun onBindViewHolder(holder: FollowingUserViewHolder, position: Int) {
        holder.onBind(userList[position])
        //리스트에서 지금 보여줘야할 위치 데이터
        //뷰 하나하나 전달
    }

    override fun getItemCount(): Int = userList.size
    //걍 뷰 몇개냐, 전체 아이템수

    //데이터를 받은 뷰홀더
    // 데이터 묶기
    class FollowingUserViewHolder(
            private val binding : ItemFollowerUserBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(followingUserInfo: FollowingUserInfo){
            binding.la.text = followingUserInfo.la
            binding.rpEx.text = followingUserInfo.rpex
            binding.rpName.text = followingUserInfo.rpName
            //binding.followUserName.text = followingUserInfo.userName
        }
    }


}