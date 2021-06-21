package com.example.firstseminar.SharedPrference

import android.content.Context

object CherishUserAuthStorage {

    private const val STORAGE_KEY = "user_auth"
    private const val USER_ID_KEY = "user_id"
    private const val USER_PW_KEY = "user_pw"


    fun getUserId(context : Context) : String {
        // SharedPreferences - 전체적으로 접근할 때
        val sharedPreferences = context.getSharedPreferences(
            //어플리케이션 정보에서 SharedPreference를 받아온다
            "${context.packageName}.$STORAGE_KEY",
            //이름을 앱에 고유하게 식별 가능하도록 설정
            // 왜 STORAGE_KEY를 쓰는거지?
            Context.MODE_PRIVATE
        )
        return sharedPreferences.getString(USER_ID_KEY,"") ?: ""
    }

    fun getUserPw(context: Context) : String {
        val sharedPreferences = context.getSharedPreferences(
            "${context.packageName}.$STORAGE_KEY",
            Context.MODE_PRIVATE
        )
        return sharedPreferences.getString(USER_PW_KEY,"") ?: ""
    }

    fun saveUserId(context: Context, id:String){
        val sharedPreferences = context.getSharedPreferences(
            "${context.packageName}.$STORAGE_KEY",
            Context.MODE_PRIVATE
        )

        sharedPreferences.edit() //파일 저장을 위한 메소드드호출
            .putString(USER_ID_KEY,id)
            .apply() //디스크에서 비동기적으로 쓰도록하는 메소드
    }

    fun saveUserPw(context: Context, pw:String){
        val sharedPreferences = context.getSharedPreferences(
            "${context.packageName}.$STORAGE_KEY",
            Context.MODE_PRIVATE
        )
        sharedPreferences.edit()
            .putString(USER_PW_KEY,pw)
            .apply()
    }

    fun removeUserId(context: Context){
        val sharedPreferences = context.getSharedPreferences(
            "${context.packageName}.$STORAGE_KEY",
            Context.MODE_PRIVATE
        )
        sharedPreferences.edit()
            .remove(USER_ID_KEY)
            .apply()
    }

    fun removeUserPw(context: Context){
        val sharedPreferences = context.getSharedPreferences(
            "${context.packageName}.$STORAGE_KEY",
            Context.MODE_PRIVATE
        )

        sharedPreferences.edit()
            .remove(USER_PW_KEY)
            .apply()
    }

    fun clearAuthStorage(context: Context){
        val sharedPreferences = context.getSharedPreferences(
            "${context.packageName}.$STORAGE_KEY",
            Context.MODE_PRIVATE
        )
        sharedPreferences.edit()
            .clear()
            .apply()
    }



}