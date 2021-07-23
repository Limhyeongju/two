package pk11;

public class Student extends StudentPeople {
	 public int studentno;
	 
	 public Student(String name, String ssn,int studentno) {
		 //String name, String ssn 상속받았으므로 생략해도 된다
		 
		 super(name,ssn); //그냥 super();디폴트생성자니까 오버로딩을 해서 괄호안에 넣어줘야한다.
		 //오보로딩된 부모 생서자 호출 =People(name, ssn)
		 this.studentno=studentno;
		 
		 
	 }

}
