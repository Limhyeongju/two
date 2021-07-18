package pk6;

import java.util.Random;

public class MyLotto {

	public static void main(String[] args) {
		// 로또번호 6개를 담을 배열을 준비
		int[] lotto=new int[6]; //0 1 2 3 4 5 첨자가생긴다
		System.out.print("이번주 로또 예상번호 : ");
		outer : for(int i=0; i<lotto.length;) {//i++이 생략가능
			
			lotto[i]=new Random().nextInt(45)+1;
			
			//중복값을 비교하는 반복문
			
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					continue outer; //중복되는게 있으면 outer부터 다시시작(continue)
				}// if
			}//inner for
			
			System.out.print(lotto[i] + " ");
			i++;;
		}//outer for
	}//main

}//class
