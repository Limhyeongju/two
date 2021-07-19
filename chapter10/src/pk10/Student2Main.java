package pk10;

public class Student2Main {

	public static void main(String[] args) {
		Student2 ga=new Student2();
		ga.setStudentname("귤");
		
		System.out.println(ga.studentname);
		System.out.println("학생이름 :"+ga.studentname+"\n"+"Serial : "+ga.studentID);
		System.out.println("");
		Student2 na=new Student2();
		na.setStudentname("귤two");
		
		System.out.println(na.studentname);
		System.out.println("학생이름 :"+na.studentname+"\n"+"Serial : "+na.studentID);
	}

}
