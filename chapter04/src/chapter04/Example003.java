package chapter04;

public class Example003 {

	public static void main(String[] args) {
		int score=50;
		//삼항연산자를 이용하여 score가 90보다 크면 A이고 score가 80보다 크면 B
		char d= score>90? 'A':'B';
		System.out.println(d);
		
		//삼항연산자를 이용하여 score가 90보다 크면 A이고 score가 80보다 크면 B
				// 그이하면 모두 c로 간주한다.
		char e= (score>90)? 'a': ((score>80?'b': 'c')); 
		System.out.println(e);
	}

}
