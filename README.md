## 2차 세미나 필수 과제
### 구현한 것
1. ellpiseze,maxLine을 통한 '....'처리

`android:maxLines="1"
android:ellipsize="end"`

이밖에도
`ellipsize=start` `ellipsize=middle`
옵션이 있다는 것을 알게 되었다

ti일 때 출시한 어플 '칭찬할고래'엔 사용자의 닉네임이 6글자 넘어가는 경우 뒤에 ...처리를 하는 기능이 있었다.
epipseze와 madLine을 사용하면서 특정 글자수 이상일 경우엔 ... 처리를 어떻게하는지도 알고 싶어졌다.

2. more 버튼 클릭시 2차 세미나 시간에 만든 fragmentfmf 가진 Activity로 이동

https://user-images.githubusercontent.com/81518783/117929753-1e21bc80-b338-11eb-8923-085048ce5bb3.mp4


또다른 Activity, Adapter, Fragment를 만들었다.


### 알게 된 것
### Adatper란?
두 사물이 상호작용할 수 있게하는 방법, 장치
인터페이스 ex) 리모콘 == tv 인터페이스
데이터와 뷰를 상호작용하게 해줌
데이터를 viewholder으로 감싸 뷰에서 나타낼 수 있게하는 장치
데이터->뷰로 바꿔줌


### ViewHolder란?
뷰에대한 정보를 넣어주는 역할
view의 요소 관리자
activity 홀더의 view를 담고있는 상자(layout) 관리자
아이템마다 viewholder를 만드는 방법 정의함


### 이외의 것
평소에 SYSTEM UI ERROR가 자주나는 편이라 XML에서 문제가 있다고 생각했다.
그래서 나와 팟장님의 XML 코드를 비교해보며 어떻게하면 UI ERROR가 안나는지, 어떻게하면 뷰를 예쁘게 만들 수 있는지 분석을 했다.

프래그먼트와 리사이클러뷰 제작 과정을 이해하기 위해 설명 주석을 굉장히 많이 달았다.
설명 주석과 코드를 번갈아보면서 '이 코드는 왜 짜야하는지' ,'이 다음엔 무엇을 해야한는지'를 생각했다.


