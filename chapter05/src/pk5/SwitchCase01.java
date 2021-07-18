package pk5;

public class SwitchCase01 {
// if는 조건이 만족하면 다음걸 수행
	//switch가 켜지면 true 안켜지면 false
	//defalut 이것도 저것도 아니면(else 랑 비슷한 존재)
	public static void main(String[] args) {
		/*
		int ranking =3;
		char medalColar;
		//='a'; 이렇게 주어지면 default값을 대체하기에 default를 사용하지 않는다
		
		switch(ranking) {
		
		case 1:medalColar= 'g';
			break;// 브레이크를 걸어  여기 만족하면 밑에 조건들  무시 
			//case는 경우의 수
			//반드시 브레이크를 걸어야한다.
			//: 는 트루 값이어야만 넘어 갈수 있다.
		case 2:medalColar= 's';
			break;
		case 3:medalColar= 'b';
			break;
		default: medalColar='a';
		//default는 브레이크를 포함한다
		//결과가 안나오는 이유는 스위치문에 syso가 포함되서
		}
		System.out.println(ranking +"등 메달은:"+ medalColar+"입니다.");
*/ 
		// 비교 이렇게도 할수있다.
		int ranking =5;
		char medalColar='A'; // 초기값을 주어 default를 생략한다.
		switch(ranking) {
		
		case 1:medalColar= 'g';
			break;
		case 2:medalColar= 's';
			break;
		case 3:medalColar= 'b';
			break;
		
		//초기값을 주고하면 default 생략가능
		
			} 
		System.out.println(ranking +"등 메달은:"+ medalColar+"입니다.");
		}

}
