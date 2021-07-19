package pk10;

public class CompanyMain {

	public static void main(String[] args) {
		// 일반적인 객체
		
		/*Company Company1= new Company();
		Company Company2= new Company();
		
		System.out.println(Company1);
		System.out.println(Company2);
		*/
		System.out.println("================================");
		//static은 최종값이 같은거지 각자 주소는 다르다  
		//객체를 하나만 생성할수 있는 singleton, 주소도 하나만 나온다.
		Company mycompany1=Company.getinstance();
		Company mycompany2=Company.getinstance();
		System.out.println(mycompany1);
		System.out.println(mycompany2);
		System.err.println(mycompany1==mycompany2);
		
		
		
	}
	public void sume() {
		
	}
}
