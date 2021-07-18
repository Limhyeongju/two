package chapter04;

public class IncreTest_01 {

	public static void main(String[] args) {
		
		int a,b,c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a;"+(++a));// a=a+1 또는 a+1=1>11
		System.out.println("a++;"+(a++));//11
		System.out.println("후위계산"+a);//12

		System.out.println("c++;"+(c++));//3
		System.out.println("후위계산"+c);//4

		//a전위계산 + b후위계산의 결과값
				System.out.println(("++a:"+(++a))+("b++:"+(b++))); 
				//System.out.println("++a + b++ : " + (++a + b++));//13+20=33
				//System.out.println("후위계산 : " + b);//21
	}

}
