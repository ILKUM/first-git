package kr.or.bit;

/*
 * ****~~함수는 하나의 기능만 구현한다~~~***
 함수(method): 기능 ,행위의 최소 단위
 ex)먹다, 걷는다, 잔다
 
 클래스의 구성요소 : 필드 + 생성자 + 함수
 
 ex) 게임방 : 게임기(동전넣는) 1번
 			캡슐뽑기(동전 넣고...무조건 반환) 3번
 			
  함수의 종류(4가지)
 1.void, parameter(o) : void print(String str) {실행코드}
 2.void, parameter(X) : void print(){실행코드}
 3.return Type, parameter(o) : int print(int data){ return 100 }
 4.return Type, parameter(x) : int print() { return 200 }
 
 *void (돌려주는 것이 없다) : return value 가 없다
 *return Type : [8가지 기본 타입] + String + 참조(객체의 주소) + Array + Collection + Interface
 **return Type 있으면 반드시 {블럭안에는 return이라는 키워드가 존재해야 한다}
 *parameter( 인자, 인수 ) :동전구멍 9(100원짜리, 1000짜리 지폐), 동전구멍이 여러개
 * 함수의 이름은 의미있는 단어의 조합:getReadnumber
 함수는 반드시 호출(Call) 되어야만 실행된다 : 누군가 그의 이름을 불러주었을 때...
 *
 */
public class Fclass {
	public int data;

	// void m() {
	public void m() {
		System.out.println("일반함수 : void , parameter(x)");
	}

	public void m2(int i) {
		System.out.println("parameter value :" + i);
		System.out.println("일반함수 : void, parameter(0)");
	}

	public int m3() {
		return 100; // return Type 있으면 반드시 return 키워드 사용
	}

	public int m4(int data) {
		return data + 1;
	}

	// 확장 (parameter 개수의 변화)
	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// private (접근자, 한정자)
	// 1. 클래스 내부에서는 의미 없음
	// 2. 객체입장에서는 private 보이지 않는다(캡슐화)

	// 객체 fc... 보이지 않는데 사용할 수 없는데 why?
	// [private 접근자]를 가진 함수의 목적은 무엇일까
	// 클래스 내부에서 [다른 함수]를 [도와줄 목적]으로
	// [공통함수]... 여러개의 함수가 사용하는 공통내용을 가지는 함수 ex)출력 전용함수
	private int operationMethod(int data) {
		return data * 200;
	}

	public int sum2(int data) {
		int result = operationMethod(data); //다른 함수 호출 하기
		if(result >0) {
			return 1;
		}else {
			return -1;
		}
	}
		
	//Quiz
	//a와 b 둘중에 큰 값을 return 하는 함수를 만드세요
	//ex) max(500,300) return 값이 500 받게 하면 되요
	
	/*
	 public int max(int a, int b) {
		if(a>=b) {
			return a;
		}else {
			return b;
		}
	}
	*/
	
	public int max(int a, int b) {
		return (a>b) ? a : b;
	}
	
	public String concat(String s , String s2, String s3) {
		String result = s+"/" + s2 +"/" + s3;
		return result;
	}
		
	//여기까지가 기본편
	//클래스는 타입이다
	/*
	 public int call(){int data = 100; return data;} 
	 public Tv call(){ Tv t = new Tv(); return t;}
	 public Tv call() {return new Tv();} // new Tv heap 올리고 주소를 return
	 
	 [Today Point]
	 클래스는 memory에 올려야 사용할 수 있다
	 Tv t = new Tv(); (메모리에 올리는 방법)
	 
	 public int call (Tv t){}  //t라는 변수는 Tv 타입을(주소) 를 받을 수 있다
	 public Tv call(){} //Tv 타입의 주소값을 return한다
	  
	  
	  
	  
	 
	 */
	
	public Tv objMethod() { 
		Tv t = new Tv(); //Tv 타입의 주소값을 return해야 하는 데 유일한 방법이 new
		t.brand = "LG";
		return t;
	}
	public Tv objMethod() {
		return t;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
