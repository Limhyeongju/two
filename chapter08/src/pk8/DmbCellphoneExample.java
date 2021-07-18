package pk8;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		
		DmbcellPhone dmbcellphone= new DmbcellPhone("Java phone", "흰색", 11);
		// CellPhone
		System.out.println( "모델 : "+dmbcellphone.model);
		System.out.println( "색상 : "+dmbcellphone.color);
		//DmbcellPone
		System.out.println( "채널 : "+dmbcellphone.channel);
		
		//CellPhone으로 부터 상속받은 메서드 호출
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("여보세요");
		dmbcellphone.receVoice("안녕하세요 저는 이호진입니다");
		dmbcellphone.sendVoice("싫어요");
		dmbcellphone.hangUp();
		System.out.println();
		
		//Dmbcellphone으로부터 메서드 호출
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(7);
		dmbcellphone.turnOffDmb();
	}

}
