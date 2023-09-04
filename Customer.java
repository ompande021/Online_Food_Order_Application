package relationship;

public class Customer {
	
	private String Cname;
	private long Cno;
	private String order;
	private long orderId;
	private double orderprice;
	private String hotel;
	
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	
	public long getCno() {
		return Cno;
	}
	public void setCno(long cno) {
		Cno = cno;
	}
	
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	public double getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}
	
	public String getHotel()
	{
		return hotel;
	}
	public void setHotel(String hotel)
	{
		this.hotel = hotel;
	}
	
	public Customer(String cname, long cno, String order, long orderId, double orderprice, String hotel) {
		
		this.Cname = cname;
		this.Cno = cno;
		this.order = order;
		this.orderId = orderId;
		this.orderprice = orderprice;
		this.hotel = hotel;
	}
	
}
