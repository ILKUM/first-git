import kr.or.bit.Airplane;
import kr.or.bit.Card;

public class Ex05_Static_CardMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.cardInfor();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfor();
		*/
		
		//..53을 만들었어요...
		//고객: 카드가 제가 생각했던 크기가 아니네요
		
		
			
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		Card.h = 100;
		Card.w = 70;
		c.cardInfor();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfor();
		
			
		Airplane a1 = new Airplane("점보",747);
		
		Airplane a2 = new Airplane("덤보",858);
		Airplane.checktotal();
		a1.showMe();
		a2.showMe();
				
	}

}
