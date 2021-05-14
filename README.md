# 두번쨰 세미나 level 2-1 과제
### 안청년 탈출하기

## 구현 한것
### GridLayout
  - `app:spanCount="3"`을 통해 아이템의 개수를 설정할 수 있다
  
## 추가로 구현한 것
### ScrollView
  - ScrollView의 자식 레이아웃은 하나여만 한다. 그래서 보통 하나의 View Group만 추가한다.
  - orientation을 통해 스크롤의 방향을 정할 수 있다
  -부모 레이아웃의 자식이기 떄문에 `layout_height="0dp"`
  -자식 레이아웃인 RecyclerView는 아이템의 개수가 다르기 떄문에 `layout_width="wrap_content"`, `layout_height="0dp"`
  
  

## 개선할 점
1. 구분선 추가
구분선을 추가하고 싶어서 Following_Fragment에

`binding.userList.addItemDecoration(
                DividerItemDecoration(this,DividerItemDecoration.VERTICAL)`
                
`
해당 코드를 추가하는 과정에서 계속 에러가 났다. 정확히는 Context인 'this' 부분에서 에러가 발생했다
Context에 대한 구글링을 해보았지만 잘 모르갰다. 다른 사례들을 보면 보통 mainActivity에 저 코드를 추가하는데
나는 Fragment Activity라서 다른 것 같다. 차이를 모르겠다. 물어보거나 다시 공부를 해야한다




