package kr.or.bit;


public class Dstore {

	private String brand;
	private int floor;
	

	public Dstore(String brand, int floor) {

		
			this.brand = brand;
			this.floor = floor;
			

	}

	public void show() {

		System.out.println(this.floor + " - " + this.brand);

	}
}
