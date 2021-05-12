package com.example.second_semina_alone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.second_semina_alone.data.SecondInfo
import com.example.second_semina_alone.databinding.SecondDataBinding


//처음에 RecycerView 상속
//ViewHolder class 만들고, 뷰 띄우기
// 빨강색 띄우면 뜨는것들 import하기
class SecondListAdapter : RecyclerView.Adapter<SecondListAdapter.SecondListViewHolder>() {

    //뷰홀더로 변경할 data, 데이터 파일 넣어주기
    val userlist2 = mutableListOf<SecondInfo>()

   class SecondListViewHolder(
           private val binding: SecondDataBinding

   ) : RecyclerView.ViewHolder(binding.root){
       fun onBind(secondInfo: SecondInfo){
           binding.name.text=secondInfo.usernaem
       }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondListViewHolder {
        //뷰홀더에서 뷰를 참조,관리를 위해서
        //ViewBining 객체 만들어주기
        //뷰로 만들어줄 데이터 넘겨주기
        //데이터->뷰이게 뷰 홀더니까
        val binding = SecondDataBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
        )
        return SecondListViewHolder(binding)

    }

    //뷰홀더에 데이터를 줬으니
    //데이터를 전달하자!
    //내가 준 데이터를 뷰에 배치해줘!
    override fun onBindViewHolder(holder: SecondListViewHolder, position: Int) {
        holder.onBind(userlist2[position])
    }

    override fun getItemCount(): Int = userlist2.size


}
