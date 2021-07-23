package pk11;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s=new Student("감나우","123-1",1);

		System.out.println("name : "+s.name);
		System.out.println("ssn : "+s.ssn);
		System.out.println("studentno : "+s.studentno);
	}

}
