package kr.or.bit;

//라인 주석(해석되지않는 주석)
/*
 만든이 : 홍길동
 날짜 : 2019-08-05
 설명 : 이파일은 참조파일입니다.
 
 class 설계도이다. (완전 중요하다)
 설계도 기본적인 구성요소(상태정보(속성): 변수 +행위정보(기능):함수)
 
 자동차 설계도 >> 
 상태정보(속성) : 백미리, 엔진, 타이어, 창문 , 속도  >>변수>> int (타입) speed(변수) = 0  
 행위정보(기능) : 달린다, 멈춘다, 속도를 높인다. >> 함수 > public void speedup(){++speed}
 
 엔진설계도 : 톱니바퀴, 고무줄, 기름, 
 
 */

public/*접근자*/ class Emp { //사원이라는 설계도 
	 public int empno; //사원은 사본을 가지고있다.(사번 숫자데이터)
	 //변수 -> 정보를 나타낸다(고유)-> member field ->>instance variable 
	 public String ename; // 이름
	 public String job; //직종
	 
	
	 private int data;
	 
	 //트수한 목적 : 캡슐화된 자원에 대해서 set, get >> setter함수 , getter 함수
	 public int getData() { //기능 (행위정보) >> method
		 return data;
		 
	 }
	 public void/*나 너한테 돌려줄거 없다 라는 뜻의 함수*/ setData(int input) {
		 if(input < 100) {
			 this.data=input;
		 }else {
			 this.data = 0;
		 }
		 //캡슐화의 진정한 의미 - 직접할당을 못하게하고 간접할당을 하는 것 
		 
	 }

public String getEmpInfo() {
	return empno + "/"+ ename + "/" + job;
	
}
	 
	 
}
//보기에 깔끔하다.(가독성) : 변수명이 알수 있는 단어로 표현되어야한다.
//getListById

//행위정보(기능) : 함수(method)
//함수는 반드시 호출 동작 














