package kr.or.bit;

public class Main_Clothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes c1 = new Clothes("nike", "pants", 70000);
		c1.showStack();
		c1.showSales();
		c1.showSalesnumber();
		c1.showAsset();
		c1.showStack();
		
		System.out.println();
		
		c1.selling();
		c1.showStack();
		c1.showSales();
		c1.showSalesnumber();
		c1.showAsset();
		c1.showStack();
		System.out.println();
		
		Clothes c2 = new Clothes("adidas", "T", 80000);
		c2.showStack();
		c2.showSales();
		c2.showSalesnumber();
		c2.showAsset();
		c2.showStack();
		
	}

	

}
