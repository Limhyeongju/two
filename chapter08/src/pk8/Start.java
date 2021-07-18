package pk8;

import java.util.Random;
import java.util.Scanner;

public class Start {

	private int random=new Random().nextInt(50)+1;
	private int count;
	private String result="FAIL ";
	
	public String check(int n) {// 사용자가 입력한 숫자
		//셋중 1개의 결과를 뽑아내는 ㅓㅅ
		count++;
		if(n<random) {
			System.out.println("up");
		
	}else if(n>random) {
		System.out.println("down");
	}else {
		System.out.println(count + "회 만에 정답!!!");
		result = "success";
	}
	return result;
	}
}