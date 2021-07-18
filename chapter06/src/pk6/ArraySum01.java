package pk6;

public class ArraySum01 {

	public static void main(String[] args) {

		
		int[] score= {83,90,87};
		System.out.println("score[0]: "+ score[0]);
		System.out.println("score[1]: "+ score[1]);
		System.out.println("score[2]: "+ score[2]);

		int sum=0; // 누적해서 쓸려면 초기화값이필요하다
		for(int i=0; i<3; i++) {
			sum+=score[i];
		}
	
		System.out.println("총합: " + sum);
		double avg=(double)sum/3;
		//String.format : 문자열 형식으로 바꿔주는것
		System.out.println(String.format("평균 : %.2f", avg));
		//String.format("평균 : %.2f" 소수점 2자리까지 표현, 3자리에서 반올림 밑에는 자름
		//Math.round(avg)
		System.out.println(String.format("평균 : %.2f", Math.round(avg)));
	}

}
