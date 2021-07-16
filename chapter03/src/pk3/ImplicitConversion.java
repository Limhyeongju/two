package pk3;

public class ImplicitConversion {

	public static void main(String[] args) {
		//묵시적 형변환
		byte bnum=10;
		int inum=bnum;
		
		System.out.println(bnum);
		System.out.println(inum);
		
		int inum2=20;
		float fnum= inum2;
		//정밀도가 높은 거에 맞춰지고 아무것도 없을때 소수점 한자리까지
		
		System.out.println(inum2);
		System.out.println(fnum);
		
		double dnum;
		dnum=fnum+inum;
		System.out.println(dnum);
	}

}
