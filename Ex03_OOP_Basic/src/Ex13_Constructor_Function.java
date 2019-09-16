import kr.or.bit.Book;

/*
 생성자 함수(constructor)
 1. 함수긴 함수인데 특수한 목적의 함수
 2. 특수한 목적 (memmber field 초기화)
 
 Tip) static >> static{}, 일반변수 >> {}
 
 3. 일반함수와 다른점
 3.1	함수의 이름 고정(class 이름과 동일)
 3.2	실행 시점 때문에 return Type이 없음, void > defalt가 void 라 생략
 3.3	실행 시점 객체생성 시 호출되는 함수
 
 4. 목적: 생성되는 객체마다 다른 초기값을 부여하는 방법m
 
 class Car{ int door=0;}
 
 5. 생성자 함수는 overloading 가능
 ************* 개발자의 의도 ***********
 *예외적으로 overloading 된 생성자 함수가 하나라도 존재한다면 컴파일러는 자동으로 default 생성자 함수를 만들지 않는다
 *만약 default 생성자 함수를 사용하고 싶다면 강제 구현하세요
 *why? 개발자의 강제적 의도가 들어있는 것 
 일반 함수보다 코드량의 감소...
 */

class Car{
	String name;
	//Car(){} 명시하지 않으면 Compiler가 Car(){} 있다고 생각하고 실행합니다
}

class Car2{
	String carname;
	Car2(){ //default constructor (생성자)
		System.out.println("나 생성자 함수야^^");
		carname = "pony"; //member field 초기화
	}
}

class Car3{
	int number;
	Car3(){
		System.out.println("member field 초기화");
	}
}

class Car4{
	int door;
	int wheel;
	
	//Car4(){			}
	Car4(int num){ //overloading (가능)
		door = num;
		System.out.println("overloading door" + door);
	}
	Car4(int num, int num2){
		door = num;
		wheel = num2;
		System.out.println("overloading wheel,door" + wheel+"/"+door);
	}
}

class Car5{
	String name;
	int wheel;
	Car5(String carName, int carWheel){
		name = carName;
		wheel = carWheel;
		System.out.printf("이름 : %s , 휠갯수 : %d",name, wheel);
				
	}
}

class House{
	String doorcolor;
	House(String color){
		doorcolor = color;
	}
}

class House2{
	String doorcolor;
	
	House2(){
		doorcolor = "yellow";
	}
	
	House2(String color){
		doorcolor = color;
	}
}

public class Ex13_Constructor_Function {

	public static void main(String[] args) {
		Car c = new Car();//Car(); 함수를 호출
		
		//Car2 c2 = new Car2();
		//Car2 c22 = new Car2();
		Car4 c4 = new Car4(10,50);
		Car4 c5 = new Car4(50, 100);
		
		//Car5 sc = new Car5("길동", 4);
		
		House h = new House("black");
		
		House2 h3 = new House2();
		System.out.println(h3.doorcolor);
		
		House2 h4 = new House2("red");
		System.out.println(h4.doorcolor);
		
		
		Book b1 = new Book("소공녀", 10000);
		b1.nameBook();
		b1.priceBook();
		b1.infoBook();
		
		Book b2 = new Book("어린완자", 5000);
		b2.nameBook();
		b2.priceBook();
		b2.infoBook();
		
		Book b3 = new Book("나는 나를 파괴할 권리가 있다", 8000);
		b3.nameBook();
		b3.priceBook();
		b3.infoBook();
		
		String b1name = b1.getBookName();
		System.out.println(b1name);
				
		
	}

}
