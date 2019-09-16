import kr.or.bit.Emp;
import kr.or.bit.Menu;
import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 100;
		
		Person person=null; //선언만 있는 상태 >>stack 이라는 메모리 영역에 변수가 만들어지고 null 값 할당
						//person 방의 4 byte 크기를 갖는다
		System.out.println("person :" + person);
		person = new Person(); //할당(Person 객체의 주소값)
								//person 타입은 메모리를 갖는다
		System.out.println("Ref person :" + person);//kr.or.bit.Person@15db9742
		person.name = "홍길동";
		person.age = 10;
		person.print();
		
		//선언과 할당을 동시에
		Person myperson = new Person();
		myperson.name = "아무개";
		myperson.age = 100;
		myperson.print();
		
		int num = 100;// local variable 반드시 초기화: 처음 값을 넣는 행위
		Person you;//초기화 되어 있지 않아요... 사용불가 ... Person 도 Type 다
		//System.out.println(you);
		//The local variable you may not have been initialized
		
		//1. you 라는 변수의 초기화(값을 ... 인위적으로 null 할당... 일반적으로 주소값을 갖는 것)
		you = new Person();//주소값으로 초기화
		
		Person my;
		my = you;// 초기화 하였습니다(주소값으로 초기화)
				//my 와 you 동거를 시작... 같은 집으 ㅣ주소를 가지고 있으니까)
		System.out.println(my == you);
		System.out.println(my + " : " + you);
		
		//Tv만들기
		Tv tv1 = new Tv();
		tv1.brand = "samsung";
		tv1.channel = 100;
		tv1.plus();
		System.out.println(tv1.channel + "/" + tv1.brand);
		
		Tv tv2 = new Tv();
		tv2.brand = "lg";
		tv2.channel = 10;
		tv2.minus();
		System.out.println(tv2.channel +" / " + tv2.brand);
		
		Menu one = new Menu();
		one.code= 1;
		one.name= "알리오올리오";
		one.kind= "면류";
		one.price = 8000;
		
		
		Emp emp = new Emp();
		BodyInformation bodyinfo = new BodyInformation;
		
		emp.empno = 7788;
		emp.name = "김유신";
		emp.job = "IT";
		emp.sal = 5000;
		emp.bodyinfo.height = 180;
		emp.bodyinfo.weight = 70;
		
		
		
		
		
		
	}

}
