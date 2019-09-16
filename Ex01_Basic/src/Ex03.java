/*
 1. 자바는 시스템에서 기본 8가지 타입을 제공(자료형) 
 2. 8가지 기본타입(값을 저장하는 타입)
 3. 숫자 -> 정수 (음의 정수, 0, 양의 정수) -> byte(-128~127)
  								  -> char (한 문자를 표현하는 자료형)
  								  >> 한문자(2Byte) >> 한글 1자 2byre, 영문자, 특수문자, 공백 2byte)
  								  >> unicode 형식
  								  -> short
  								  -> int(-21~21억) : **java 정수의 연산 기본타입(4byte)**
  								  -> long(8byte) : int보다 큰 값
  								  
  		-> 실수(부동소수점)	-> float(4byte), double(8byte)
  		-> 정밀도(표현범위가 크다)>> double **java 실수 연산 기본 **
 3-1. 논리 -> 참 거짓  -> boolean >> 프로그램의 논리의 흐름제어
 
 궁금한점 : 문자열의 표현 ??>>홍길동, hello, 
 String 은 참조타입(클래스)	>> String s = new String("안녕");
 ex)
 String str = "홍길동";
 그냥 int, double처럼 사용하자.
 
 자바는 크게
 1. 값타입  >>숫자, 논리  (8가지)
 2. 참조타입 >> 클래스, 배열 >> 변수의 주소값을 담는것을 참조타입이라고 함.
 2-1.class == 설계도 == Type **꼭 외우자!!!! 월요일 질문할거임
 
  
  
 */
class Car{  //Car 라는 Type : 설계도)
	String color;
	int window;
	
}

public class Ex03 {

	public static void main(String[] args) {
		Car c = new Car();
		//c 변수는 Car라는 타입을 가지고 있다.
		//c 는 값이 아니라 주소값을 가지고 있다.(주소값을 가지고 있는 변수를 참조변수라고 한다.)
		System.out.println("c의 변수값 " + c);
		//c의 변수값 Car@15db9742 주소값 : 클래스명 + @ + 주소
		
		Car c2;//선언
		c2 = new Car(); //할당(주소값 할당)
		System.out.println("C2라는 변수의 값 :" + c2);
		//C2라는 변수의 값 :Car@6d06d69c 
		
		Car c3 = c; //  주소값 할당 // "=" 같다는 것이 아니라 c3의 값을 c에 줘(?)라는 뜻
		System.out.println(c + " : "+ c3); //Car@15db9742 : Car@15db9742
		System.out.println(c == c3);//true
		c3.color = "black";
		System.out.println(c.color);
		
		//값 타입(8가지 + String)
		int i = 200; // 선언과 할당 local variable
		System.out.println("i라는 변수의 값은 ;" + i);
		int j; //선언 local variable
		j = 1000; //할당(c초기화)
		
		int a, b; // 각각 초기화
		a = 10;
		b = 20;
		
		int k = 1111;
		int k2 = k; //값 할당
		System.out.println("k2 :" + k2);
		k2 = 2222;
		//k값 출력 >> k는 그대로 1111
		
		//int(-21~21)
		//Today point!!!
		//int p - 100000000000;(x)
		//숫자 리터럴 10000000000 은 int not long
		//정수 리터럴 (숫자) 범위는 int 다 
		// 정수 리터럴ㄹ은lONG 크기로 인지 :접미사 L을 맨끝에 **중요하다
		long number2 = 100;
		long number = 10000000000L; // l을 맨 끝에 보여주면 됨
		System.out.println("number : " + number);
		
		
		//Char : 2byte (정수값)
		//한문자를 표현하는 자료형
		//일반적인 상황에서는 
		//1. 한글 한자>>2byte
		//2. 영문자, 공백, 특수문자>>1byte
		//한글이던, 영문이던, 2byte 로 표현(unicode)
		//아스키코드표를 기준으로 확인
		
		//java 문자열 : "가", String str = "홍길동", String str = "AAAAAa",
		//java 문자 : '가', Char(문자를 저장하지만 내부적으로는 정수로 저장된다(?)) c = 'A';
		
		char single = '가';
		System.out.println(single);
		//char single2= '가나';
		char ch = 'A';
		System.out.println(ch);
		//저장하고 있는 정수값...
		//casting 타입변환 
		
		int intch = 'A'; //내부적으로 암시적 형변환
		System.out.println("intch :" + intch);
		System.out.println((int)ch); //type casting //기준은 아스키 코드표
		
		char ch2 = 'a';
		System.out.println(ch2);
		System.out.println((int)ch2); //'int'를 사용하여 그 문자가 가지고 있는 아스키 코드표로 변환해줌
		
		int intch2 =65;//**값을 보지말고 type을 보자 
		char ch3 = (char)intch2;//강제적 형변환 -> 큰것을 작은것으로 갈때는 데이터 손실이 일어날수있다.
		System.out.println(ch3);
		
		int intch3 = ch3; //암시적형변환
		//int intch3 = (int)ch3;//작은것을 큰것으로 자동변환...
		System.out.println(intch3);
		//Today point
		//1.변수가 가지고 있는 값을 보지말고 [변수의 타입]을 보자
		//2.변수의 타입 크기를 확인하자
		//3.큰타입에는 작은 타입 값을 넣을 수 있어요
		//4.작은타입에는 큰타입값을 못넣어요
		//char <-int    오렇게 하려면 타입을 바꿔주자! 이렇게 -> char <-(char)int
		//int <- char 가능(내부적의 변환) >>>int <- (int)char
		
		//버려지는 값이 생길 수있다.
		
		int intvalue = 10165468; //(주의하자)
		byte bytevalue = (byte)intvalue;
		System.out.println(bytevalue); //쓰레기값이 발생...큰타입을 작은타입에 꾸겨넣을때는 데이터 손실이 항상 발생할수있다.
		
		//String (문자열) 타입으로 보자
		//String 값 타입이 아니고 클래스 타입(사실은 new 통해서 메모리에 올리고 사용)
		//원칙 : String str = new String("홍길동");
		//POINT : String 은 그냥 일반 타입처럼 ....(int, double)....
		
		
		//String str2  = str + "월요월"  //DB
				
		//System.out.println(str2);
		
		//Tip)java 특수문자 사용하기
		//문자를 인지 시키기 위해서 : \ 역슬러시
		char sing = '\'';
		System.out.println(sing);
		
		//홍"길"동 이라는 문자열을 출력해보세요
	
		String name = "홍\"길\"동";
		System.out.println(name);
		
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		System.out.println(result);
		
		System.out.println("100"+100); //100100 이라고 출력
		System.out.println(100+100+"100"); //100100
		System.out.println(100+100+"100");//200100
		System.out.println(100+(100+"100"));//100100100
		System.out.println(100+"100"+100);//100100100
		
		
		//C:\temp 문자열로 출력
		
		String path = "C:\\temp"; //\t : 탭  \n : new line
		
		//실수(부동소수점) 
		//float(4byte)
		//double(8byte) : "**실수의 기본타입(리터럴) double" (정밀도가 높다(소수이하 자리수 표현..._))
		
		float f = 3.14f; //모든 실수는 double 타입 >> 3.14 라는 리터럴 값은 double 타입
						//float 타입의 리터럴 f, F
		
		float f2 = 1.123456789f; 
		System.out.println("f2 :" + f2); //1.12345678 대략 7자리 (반올림처리)
		
		double d = 1.1234567812345678;
		System.out.println("d: " +d);//1.1234567891234568 대략 16자리표현
		
		
		//quiz
		//~128~127
		byte q = (byte)128;
		System.out.println(q);
		
		
		
		
		//double d2 = 100.0; //암시적 형변환
		double d2 = (double)100;
		System.out.println(d2);
		
		//Quiz 
		double d3 = 100;
		int i5 = 100;
		
		//int result2 = (int)d3 + i5; int = int + double(정수 + 실수 >> 실수)
       
		//1.int 를 double로 변환 >>int result2 = d3 + i5;
		//double result2 = d3 + i5; 데이터 손실이 없다.
		
		//2. 큰 타입을 작은 타입으로 변환은 데이터 손실!!
 		//int result2 = (int)d3 + i5; //지금은 문제가 안되요..d3값 int 범위 넘는 값이라면(데이터 손실이 발생할 수 있다.)
 		
 		//3. 데이터 손실가능
		int result2 = (int)(d3+i5);
		//Today Point
		//작은타입 + 큰타입 >> 큰타입
		//타입간 변환 >> 변수가 가지는 값을 보지말고 변수의 타입을 보고 판단하자
		//명시적 형변환(casting) (int)
		
		int i6 = 100;
		byte b2 = (byte)i6; //명시적 형변환
		System.out.println(i6);
		
		byte b3 = 20;
		int i7 = b3; //컴파일러가 내부적으로 (int)b3생성 암시적 형변환
		
		//각각 타입에 대해서 (2진수, 8진수,,,,, 틈틈이)
		
		
		
		
		
		
		
				
		
		
		

	}

}
