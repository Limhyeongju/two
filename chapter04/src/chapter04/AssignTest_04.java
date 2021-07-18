package chapter04;

public class AssignTest_04 {

	public static void main(String[] args) {
		//전위 연산
		int gamescore= 150;
		int lastscore1=++gamescore;
		//1을 더하고 읽어 151
		int lastscore2=--gamescore;
		//1을 뺴고 읽기 150
		//System.out.println(lastscore1);
		// System.out.println(lastscore1);
		
		 //후위 연산
		 int lastscore3=gamescore++; //읽고  난후 1을 더해
		// System.out.println(lastscore3); //150
		// System.out.println(gamescore);	//151
		 
		 int lastscore4=gamescore--;// 읽고난후(출력) 1을 빼
		 System.out.println(lastscore4); //151
		 System.out.println(gamescore);//150
		 
		

	} 

}
