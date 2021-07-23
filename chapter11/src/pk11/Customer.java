package pk11;

public class Customer {
	
	protected int customerID;
	protected String customername;
	protected String customergrade;
	protected double bonuspoint;
	double bonusratio;
	
	
	public Customer() {
		customergrade = "SILVER";
		bonusratio = 0.01;
	}
	
	public Customer(int customerID,String customename ) {
		this.customerID=customerID;
		this.customername=customename;
		customergrade="silver";
		bonusratio=0.01;
	}
	
	public int calcprice(int price) { //포인트적립
		bonuspoint+=bonuspoint*price;
		return price;
		
	}
	public String showCstomerInfo() {
		return customername+"님의 등급은 "+customergrade+ "입니다.";
	}
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomergrade() {
		return customergrade;
	}

	public void setCustomergrade(String customergrade) {
		this.customergrade = customergrade;
	}

	

}
