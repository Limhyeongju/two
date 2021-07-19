package pk10;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 ga=new Student1();
		ga.setStudentname("아무개");
		System.out.println(ga.serialnum);
		Student1.serialnum++; //시리얼넘버를 1개씩 오르기위해
		
		Student1 na=new Student1();
		ga.setStudentname("머시기");
		System.out.println(na.serialnum);
		
	}

}
