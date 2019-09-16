//1. Ex02_variable 클래스
//2.특수한 main함수를 가지고 있는 클래스
//3. static void main(String[] args) : 프로그램의 시작점, 진입점

//4. main함수가 없는 클래스(lib) : 다른 클래스를 도와주는 클래스

//Tip; c#도 똑같은데  static void Main() m이 대문자
//9월 초쯤에 C#책 보면 70프로 이해가능

//변수 : variable
//변수 scope (유효범위) : 선언되는 위치
//1. instance variable : 객체변수 class Test {int age} //클래스안 중괄호안에에 있는 변수다
//2. local variable : 지역변수(함수 안에 있는 변수) class Test{[public void run () {int age}} /반드시 초기화해야한다.
//2-1. 함수안에 if 블럭 안에 있는 변수도 지역변수 scope블럭 ...안에서만
//3. static variable : 공유변수(자원) : 객체간 공유자원 
//함수의 정의 : 뭐를 해라 라고하는 기능

//원칙 : 하나의 java파일 하나의 클래스 >> Test.java >>class Test {}
//연습용 : 하나의 java파일 안에 여러개의 클래스를 만들어 사용 가능(단, class 중 하나만 public가진다.)


//class는 설계도이다 == class는 Type이다.(작은 여러개의 타입을 가지고 있는 큰 타입)
//설계도를 표현하려면 "속성"과 "행위"
//속성 = 고유와 상태 / 행위는 함수와 기능
//
class Test{
	int iv = 500; //질문 : 그럼 초기화를 안해도되는건데 왜 함?
	//instance variable
	//이 변수는 초기화 하지 않아도 된다(기본값: default)를 가지고 있다.
	//why 초기화를 하지 않아도 사용 가능할까요(hint : 설계도 하나 여러개의 아파트 창문의 개수도 다를 수 있다.)
	//답 ) 객체마다 다른 값을 가질 수 있다. 
	
	int window;
	Test(){//생성자(constructor)//목적 :member field의 초기화 //객체 생성과 동시에 호출
		
	}
	Test(int data){ //오버로딩(overloading) : 하나의 이름으로 여러가지 기능 수행
		window = data;
		
		}
	void write() {
		int num = 100;  //local variable 지역변수이다. 왜냐면 print 함수안에 있는 변수이기 때문에 헷갈리면 {}중괄호를 보자
						//함수가 호출되면 그때 메모리에 생성되고 함수가 종료되면 메모리에 사라진다(num이)
						//num은 heap일까 스택에 잇을까
						//실행되는 함수는 다 스택에 만들어진다.
						//고로 write 함수는 스택에 만들어지니까 num도 스택에 만들어진다.
		
		iv = 6666;
		}
	void print() {
		//System.out.println(num);    사용불가(print 함수 실행시 num 존재하지 않아요)
		System.out.println("Test.iv :" + iv);
	}
}





public class Ex02_variable {
	 public static void main(String[] args) {
		 int lv = 500;//얘는 local 변수(지역변수) = > 이유는 main 함수안에 있는 변수이기 때문에
		 System.out.println("lv 변수값 : " + lv);
		 //실행(javac로 컴파일 >> java Ex02_variable)단축키 (ctrl +f11)
		 
		// int number;//선언
		//초기화를 하지않은 변수를 사용할때 에러가 나는거임
		//System.out.println(number);
		//The local variable number may not have been initialized
	
		 int number = 0;
		 System.out.println("초기화 number :" + number);
		 //1. 지역변수는 반드시 초기화하고 사용해야한다.*초기화 - (처움 값을 입력하는 것)
		 //2. 약속 (함수안에 있는 변수는 반드시 초기화하자)
		 
		 int num; //선언
		 System.out.println("졸려요");
		 System.out.println("나두 졸려요");
		 num = 200;//할당 
		 //선언과 할당은 분리가 가능하지만, 이런식으로 하면 나중에 쓸데없는 에러가 발생할 수 있다.
		 //그러니 선언과 할당은 분리하지말고 같이 하자.
		 System.out.println("num : " + num);
		 
		 // 클래스도 타입이다.
		 //Test t = new Test();
		 //System.out.println(t.iv);//iv는 객체변수임
		 //ex)
		 //Test t는 아파트를 지을 부지라고 말 한거
		 //new는 아파트를 짓는 행위 
		 //아파트 이름은 Test
		 //아파트안의 창문은 - iv
		 //창문안에 500\
		 //t는 연산자를 불러오는 것???
		 
		 Test apt = new Test();
		 System.out.println("창문의 개수: " + apt.window);
		 
		 Test apt2 = new Test(10);
		 System.out.println("창문의 개수 : " + apt2.window);
		 
		 apt2.write();
		 apt2.print();
		 
		 System.out.println("주소값:" + apt);
		 //주소값:Test@15db9742

	 }
}
