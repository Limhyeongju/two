package pk10;

import java.util.Scanner;

public class GuideTour {

	public static void main(String[] args) {
		//디버깅을 한다 어디서 값이 넘어오는지 알아보는것
		Scanner scan=new Scanner(System.in); //객체를 만들고 들어가면 깔금하다
		
		System.out.print("관광객수 : ");
		int n=scan.nextInt();
		//초기화되면서 메모리 확보및 객체 생성
		//게스트껄 만들었으니 밑에 쭉달려온다.
		
		Guide guide=new Guide(n);
		//guest가 등록을 guide에
		//관광객수의 메모리를 오버로딩해서 확보
		// 가이드(Guide)에서 게스트(Guest) 객체를 만듬
		System.out.println("관광객 등록");
		for(int i=0; i<n;i++) {
			System.out.print((i+1)+". 이름 : ");
			//i+1은 0이 안나오게 하려고 모양상
			guide.guest[i].setGuestname(scan.next());
			
			System.out.print((i+1)+". 성별: ");
			String gen=scan.next();
			guide.guest[i].setGuestgender(gen);
			
			System.out.println("============================");
			
		}
		
		outer : while(true) {//outer로 들어가는곳 입력
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.println("선택 >>");
			
			int select=scan.nextInt();
			
			switch(select) {
			case 1:
				for(int i=0;i<n;i++) {
					System.out.println((i+1)+". 이름 : "+guide.guest[i].getGuestname() );
					System.out.println((i+1)+". 성별 : "+guide.guest[i].getGuestgender() );
					System.out.println((i+1)+". 목적지 : "+guide.guest[i].getpoint() );
					//point 초기값이 지정되어있어서 변하지 않는다, 이름과 성별만 변경
				}
				break;
			case 2:
				System.out.println("어디로 변경하시겠습니까? ");
				Guide.point=scan.next();
				System.out.println(Guide.point + "로 목적지 변경");
				//클래스 멤버변수의 활용
				System.out.println("--------------------------");
				break;
			case 3:
				System.out.println("종료");
				break outer; //braek outer에서 들어가는 곳이 없음
			}
				
		
		
			}
		}
	}
	
	

		
		
		
		
		
		
		
		
		


