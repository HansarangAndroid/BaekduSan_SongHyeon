# 7번째 세미나

## 자동 로그인 구현
https://user-images.githubusercontent.com/81518783/122750465-7e0d6a80-d2c9-11eb-8eb8-157fff5aa0f3.mp4

### SigninActivity
#### 로그인 성공 시 입력한 ID & PWD를 getSharedPreferences 저장
<pre><code>
if(response.isSuccessful){
if(!hasUserAuthData()) {
                                Log.d("!hasUserAuthData()","아이디 비번 없을시 ")

                                with(binding){
                                    CherishUserAuthStorage.saveUserId(this@SignInActivity,inputId.text.toString())
                                    CherishUserAuthStorage.saveUserPw(this@SignInActivity,inputPwd.text.toString())
                                }
                            }
                         }
</code></pre>

#### AuthStroage에 ID,PWD가 있는 경우, 즉 한 번 로그인했을 경우에 전에 입력한 ID,PWD로 자동 로그인하여 바로 HomeActivity로 이동하게 했습니다
<pre><code>
private fun serchUserAuthStroage(){
        if(hasUserAuthData()) //AuthStorage가 데이터로 차있을 경우
        {
            //저장된 id/pw로 로그인을 한다
                //입력할 필요없이 자동 로그인이 된다

            val requsetLoginData = RequsetLoginData(
                email = binding.inputId.text.toString(),
                password = binding.inputPwd.text.toString()
            )

            ServiceCreater.soptService.postLogin(requsetLoginData)
            Log.d("자동 로그인","성공")
            Toast.makeText(this@SignInActivity,"자동로그인 성공",Toast.LENGTH_SHORT)
                .show()
            intent = Intent(this@SignInActivity,HomeActivity::class.java)
            startActivity(intent)

        }


        }
</code></pre>

#### hasUerAuthData()함수를 통해 ID,PWD의 저장 유무를 확인
<pre><code>
private fun hasUserAuthData() = CherishUserAuthStorage.getUserId(this).isNotEmpty() &&
            CherishUserAuthStorage.getUserPw(this).isNotEmpty()
</code></pre>

## 로그아웃 구현
https://user-images.githubusercontent.com/81518783/122750414-6f26b800-d2c9-11eb-829f-1b072cd78e7b.mp4


#### HomeActivity에서 로그아웃 버튼을 눌렀을 때 CherishUserStorage에서 저장된 ID,PWD를 지우고 SignActivity로 이동하게 했습니다
<pre><code>
 private fun OnClickLogout(){
        binding.logoutBtn.setOnClickListener{
            CherishUserAuthStorage.clearAuthStorage(this)
            intent = Intent(this@HomeActivity,SignInActivity::class.java)
            startActivity(intent)

        }

    }
</code></pre>

