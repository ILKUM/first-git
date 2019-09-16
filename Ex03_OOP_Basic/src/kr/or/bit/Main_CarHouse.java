package kr.or.bit;



public class Main_CarHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarHouse a1 = new CarHouse("Smart",10000);
		a1.carinfo();
		a1.howmanySmart();
		
		CarHouse a2 = new CarHouse("Web",20000);
		a2.carinfo();
		a2.howmanyWeb();
		
		CarHouse a3 = new CarHouse("Java", 30000);
		a3.carinfo();
		a3.howmanyJava();
		
		CarHouse a4 = new CarHouse("Bob", 50000);
		a4.carinfo();
		a4.howmanyTotal();
		
		CarHouse a5 = new CarHouse("Smart",15000);
		a5.carinfo();
		
		
		
	}
}
	