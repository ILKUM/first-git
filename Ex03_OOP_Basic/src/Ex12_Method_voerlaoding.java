class Human2{
	String name;
	int age;
	
}

class Test{
	Human2 add (Human2 h){//주소갑을 받아서 주소값을 리턴한다
		 				//주소값은 Human2의 주소값
		h.name = "홍길동";
		h.age = 200;
		return null;
			
	}
	
	Human2 add(Human2 h, Human2 h2) { //h >>xx번지  h2>>yy번지
		h2.age = h.age;
		h2.name = h.name;
		return h2;
	}
}
public class Ex12_Method_voerlaoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		Human2 man = new Human2();
		Human2 man2 = t.add(man);
		System.out.println("man 참조변수 == man2 참조변수" + (man==man2));
		System.out.println(man2.name +"/" + man2.age);
		System.out.println(man);
		System.out.println(man2);
		////////////////////////
		Human2 m = new Human2();//xx번지
		m.age = 20;
		m.name = "아무개";
		
		Human2 m2 = new Human2();//yy번지
		
		Human2 m3 = t.add(m, m2); //xx번지, yy번지
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
