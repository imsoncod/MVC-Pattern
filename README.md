## MVC Pattern
#### ▶ 디자인 패턴
* ##### 건축의 여러 기법을 하나의 틀로 만들어놓은 것을 '디자인패턴'이라고 한다
* ##### 건축이든 소프트웨어든간에 많은 사람들이 설계를 하면서 문제가 생기고 그것을 해결함을 반복하면서 만들어진 비슷한 형태
#### ▶ MVC 패턴이란? : 하나의 프로젝트를 구상할 때, 그 구성요소를 아래 3가지 역할로 구분한 패턴
* ##### Model: 데이터와 관련된 것, 데이터의 형식을 지정하고 데이터를 저장하거나 불러오는 등 데이터 처리가 이루어진다
* ##### View : 화면에 표시되어 우리 눈에 보이는 시각적인 UI 요소
* ##### Controller : View와 Model을 이어주는 다리역할, Model의 데이터를 View에 나타나도록 이벤트 처리를 담당
#### ▶ 웹에 적용한 MVC
##### ㅤ1. 사용자가 웹사이트에 접속한다
##### ㅤ2. Controller는 사용자가 요청한 웹페이지를 서비스 하기 위해서 Model을 호출한다
##### ㅤ3. Model은 데이터를 제어한 후에 그 결과를 리턴한다
##### ㅤ4. Controller는 Model이 리턴한 결과를 View에 반영한다
##### ㅤ5. 데이터가 반영된 View가 사용자에게 보여진다
#### ▶ 장점
* ##### 아직 기초 공부단계라 역할별로 나누어 깔끔하게 코딩할 수 있고 유지보수가 용이하다는 정도까지만 실감된다
#### ▶ 단점
* ##### MVC 패턴을 적용하여 프로젝트를 진행하며 알아가 볼 예정이다, 적응하는데 시간이 좀 걸릴 것 같다
#### ▶ MVC 패턴 구조의 기본 설계가 갖추어진 프레임워크
* ##### Java <--> Spring
* ##### Python <--> Django (MTV)
* ##### JavaScript <--> AngularJS, Node.js
* ##### Ruby <--> Ruby on Rails
#### ▶ 라이브러리 vs 프레임워크
* ##### 남이 이미 짜놓은 코드라는 점에서 서로 비슷하다
* ##### 라이브러리 : 특정 기능에 대한 도구 or 함수들을 모은 집합으로 프로그래머가 개발하는데 필요한 것들을 모아둔 것
* ##### 프레임워크 : 개발 시 필수적인 코드, 알고리즘, DB연동 등과 같은 기능들을 원할하게 구현하기 위해 제공해주는 뼈대,틀
