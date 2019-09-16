package kr.or.bit;

public class CarHouse {
	private static int stack;//총 재고
	private String model;//모델 명
	private int price;// 가격
	private static int smartStack;// smart모델 재고
	private static int webStack;// web 모델 재고
	private static int javaStack;// java 모델 재고
			
	public CarHouse(String model, int price){

		if(!model.equals("Smart") && !m.equals("Web") && !m.equals("Java")) {// 잘못입력시 메시지 출력
			System.out.println("차량 모델을 확인하세요");	
			System.exit(0);
		} else {
			this.model = model;// model에 m값 입력
			this.price = price;// price에 p값 입력
			stack++;//총 재고 증가			
			if(model.equals("Smart")){//모델이 Smart인 경우
				smartStack++;//Smart 재고 증가
			} else if (model.equals("Web")) {//모델이 Web인 경우
				webStack++;//Web 재고 증가
			} else {
				javaStack++;//Java 재고 증가
			}
		}
	}
	
	public void carinfo() {//차량 정보 호출
		
		if(model.equals("Smart")) {
			for(int i =1; i<=5; i++) //삼각형
			{
				for(int j=1; j<=5-i; j++) 
				{
					System.out.print(" ");
				}
				for(int j=1; j<=i+i-1; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}			
			System.out.println("모델명 : " + this.model + modelLogo.getSlogo() + "\t가격 : " + this.price);
		}else if(model.equals("Web")) {
			for(int i = 1; i<=5; i++) {//역삼각형
				for(int j = 1; j<i; j++) {
					System.out.print(" ");
				}
				for(int j =1; j<=2*(5-i)+1;  j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("모델명 : " + this.model + modelLogo.getWlogo() + "\t가격 : " + this.price);
		}else if(model.equals("Java")){
			for(int i=1; i<=5; i++) {//사각형
				for(int j =1; j<=5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("모델명 : " + this.model + modelLogo.getJlogo() + "\t가격 : " + this.price);
		}else {
			System.out.println("정보 없음");
		}
		
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public void howmanyTotal() {//총 재고 확인
		System.out.println("총재고 : " + stack);
	}
	
	public void howmanySmart() {//Smart 재고 확인
		System.out.println("Smart 재고 :" + smartStack);
	}
	
	public void howmanyWeb() {//Web 재고 확인
		System.out.println("Web 재고 : " + webStack);
	}
	
	public void howmanyJava() {//Java 재고 확인
		System.out.println("Java 재고 : " + javaStack);
	}
}



