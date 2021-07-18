package pk8;


//상속
public class DmbcellPhone extends Cellphone{ //sellphone을 상속받아 확장해서 쓴다는 의미

	//필드
	int channel;
	
	//생성자 //생성자 만들때는 void를 사용하지 않습니다. public void 하면 에러
	public  DmbcellPhone(String model, String color, int channel) { 
		this.model= model;
		this.color=color;
		this.channel=channel;
		}
	//매서드
	void turnOnDmb() {
		System.out.println("채널" + channel +"번 DMb 방송수신을 시작합니다");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널" + channel +"번 으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println(" DMb 방송수신이 끝납니다");
	}
	
}
