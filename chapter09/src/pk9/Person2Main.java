package pk9;

public class Person2Main {

	public static void main(String[] args) {
		
		Person2 personkim= new Person2();
		// 김유신 85.5 키 몸무게 185.0
		personkim.name="김유신";
		personkim.heigth=185.0f;
		personkim.weigth=85.5f;
		System.out.println(personkim.name);
		System.out.println(personkim.heigth);
		System.out.println(personkim.weigth);
		
		
		/* scan떠서 하는법
		 * Person2 pskim=new Person2();
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 : ");
		pskim.name=scan.next();
		System.out.print("키 : ");
		pskim.height=scan.nextFloat();
		System.out.print("몸무게 : ");
		pskim.weight=scan.nextFloat();
		System.out.println(pskim.name);
		System.out.println(pskim.height);
		System.out.println(pskim.weight);
		 */
		
		System.out.println("======================");
		Person2 lim= new Person2("lim", 182, 80);
		System.out.println(lim.name);
		System.out.println(lim.heigth);
		System.out.println(lim.weigth);
	}

}
