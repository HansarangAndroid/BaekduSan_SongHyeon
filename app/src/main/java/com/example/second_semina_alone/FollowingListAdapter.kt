package com.example.second_semina_alone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.second_semina_alone.databinding.ItemFollowerUserBinding


class FollowingListAdapter : RecyclerView.Adapter<FollowingListAdapter.FollowingUserViewHolder>(){
    val userList = mutableListOf<FollowingUserInfo>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowingUserViewHolder {
        val binding = ItemFollowerUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
        )
        return FollowingUserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FollowingUserViewHolder, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int = userList.size

    class FollowingUserViewHolder(
            private val binding : ItemFollowerUserBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(followingUserInfo: FollowingUserInfo){
            binding.followUserName.text = followingUserInfo.userName
        }
    }


}