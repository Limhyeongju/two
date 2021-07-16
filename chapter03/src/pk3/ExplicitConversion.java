package pk3;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int inum=1000;
		//32비트
		//byte bNum=iNum;// 명시적으로(명확하게 표현해줘야한다) 8비트 -128 ~ 127
		// int가 byte보다 더 크기 때문
		
		byte bnum=(byte)inum;
	
		System.out.println(inum);
		System.out.println(bnum);
		
		double dnum1=1.2;
		float fnum1=0.9f;
		//int iNum2=dNum1+fNum2; 오류 밑에거 처럼 double이랑 float은 실수까지 포함하기때문에 
	    //정수만 표현하는 int로 바꿔주기 위해 앞에다가 i
	    // 앞의 int를 추가하여 아n래식처럼 나온다(명시적선언)
		
		int inum2=(int)(dnum1+fnum1); //2.1->2
		int inum3=(int)dnum1+(int)fnum1; //1+0=1
		System.out.println(inum2);
		System.out.println(inum3);
		
	}

}
