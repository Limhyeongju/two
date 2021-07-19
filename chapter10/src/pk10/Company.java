package pk10;

public class Company {

	
	/* 자동차 회사
	 * 생산/ 부품/ 영업/ 사업
	 * 회사는 하나로 고정, 회사에 소속  
	 * 생산부의 땡땡, 영업부의 누구, 등 회사는 같다.
	 * 회사를 변하지 않는 값 싱글톤 기법 객체를 딱 1개만 만들어 다른것들이 참조하지 못하게
	 요런 개념이다*/
	//객체를 단 하나만 생성
	private static Company instance=new Company();
	//요렇게 만들면 객체는 하나밖에 사용못한다.
	
	private Company() {
		//생성자를 보호하기에 다른 메서드를 타고와야 사용가능하다.
	}
	public static Company getinstance() { //static객체이기 때문에 반드시 static으로 들어와야한다
		if(instance ==null) { //객체를 생성한적이 없다면
			instance= new Company();
			}
		return instance; // 싱글톤으 변형이 없다.
	}
	
	
}
