package pk8;

public class TakeTrans {

	public static void main(String[] args) {
		
	stdinfo studentjames= new stdinfo("james", 5000);
	stdinfo studentjames2= new stdinfo("james2", 10000);
	stdinfo studenttomas= new stdinfo("tamas", 10000);
	stdinfo studenttomas2= new stdinfo("tamas2", 3000);
	
		Bus bs100=new Bus(100);
		
		studentjames.takeBus(bs100);
		studentjames.showinfo();
		bs100.businfo();
		studentjames2.takeBus(bs100);
		studentjames2.showinfo();
		bs100.businfo();
		
		System.out.println("======================");
		subway subwayGreen=new subway("2호선");
		
		studenttomas.takesubway(subwayGreen);// 지하철 수입증가, 승객증가
		studenttomas.showinfo();//학생정보 돈-
		subwayGreen.subwayinfo();
		studenttomas2.takesubway(subwayGreen);// 지하철 수입증가, 승객증가
		studenttomas2.showinfo();//학생정보 돈-
		subwayGreen.subwayinfo();// 지하철 정보 돈+
		
	}
	
	
	
	
	
}
