
public class Ex08_Static_Method {

	public void method() {
		System.out.println("�� �Ϲ��Լ���");
	}
	
	public static void smethod() {
		System.out.println("�� static �Լ���");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�� static main �Լ���");
		smethod();
		Ex08_Static_Method ex= new Ex08_Static_Method();
		ex.method(); 
		ex.smethod();
	}

}