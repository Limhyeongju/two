package pk10;

public class Guest {
	//이름과 성별 private
	
	public String getpoint() {
		//원래는 객체를 만들어서 접근해야하지만 static이므로 클래스명으로 접근 가능
		return Guide.point;
		
	}
	//생성자를 생략
	
	//getter and setter
	private String guestname;
	private String guestgender;
	
	public String getGuestname() {
		return guestname;
	}
	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}
	public String getGuestgender() {
		return guestgender;
	}
	public void setGuestgender(String guestgender) {
		this.guestgender = guestgender;
	}
	
	
	
}
