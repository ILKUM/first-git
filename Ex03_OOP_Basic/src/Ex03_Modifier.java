import kr.or.bit.Car;

/*
 접근자(한정자) : modifier
 public (공유:package 구분(폴더) 구분없이 모든 자원 공유)
 private(개인: 클래스 내부 공유자원, 객체 입장에서는 접근 불가(사용불가))
 
 객체지향언어 특징
 1. 캡슐화(은닉화)
 1.1 클래스 내부에 있는 자원(member field, method) 적용
     private int number; // instance variable
     private void cal(){} // 내부(클래스)에서만 사용하는 공통자원
 1.2 캡슐화를 왜 하는 걸까? private를 왜쓸까 ?
 	 [직접할당을 막고 간접할당을 통해서 자원을 보호]
 	 
 	 [직접할당]
 	 public class Car {public int door} >>Car c = new Car(); c.door = 10; 여기서 door는 직접할당이 가능한 자원 타인의 할당을 막을 수없다
 	 
 	-1 안되요 ??
 	[간접할당 : 누구를 통해서 전달하고 받는 행위] >>누구는 함수
 	public class Car{ private int door; 
 						public void writeDoor(int data){
 						if(data >=0){door = data;}
 						else{door = 0; } }}
 						>>Car c = new Car(); c.writeDoor(100);
 						
 	불편해요
 	1. private int number; // 값을 읽거나 씀>>최소 두개의 함수가 필요???
 	   함수를 만들면 되요(결국 read 함수 1개, write 함수 1개)
 	   >>public void writeNumber(int data){ number = data;}//캡슐화된 자원에 write
 	   >>public int readNumber(){return number;}//캡슐화된 자원에 read
 	   
 	그래서 java 에서는 특후나 목적의 함수를 만들었어요 (캡슐화된 자원에 대해서 read, write) 전용함수...
 	전용함수를 setter 함수(write) , getter 함수(read)
 	
 	private int age;
 	-setter, getter 모두생성
 	-setter 만 생성
 	-getter 만 생성
 	 
 
 
 
 
 */
public class Ex03_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		int result = car.getWindow();
		System.out.println("result :" + result);
		car.setWindow(10);
		result = car.getWindow();
		System.out.println("result : "+ result);
		
		System.out.println("현재 자동차 속도:" + car.getSpeed());
		car.setSpeed(-100);
		System.out.println("현재 자동차 속도" + car.getSpeed());
		
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		
		
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());
	}

}
