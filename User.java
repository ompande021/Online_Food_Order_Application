package relationship;

public class User {
	private String name;
	private long cNo;
	private String status;
	private int pswd = 1234;             //(Password 1234)
	
	public String getName()
	{
		return name;
	}
	public long getCNo()
	{
		return cNo;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;			
	}
	
	public void setPswd(int pswd)
	{
		this.pswd=pswd;
	}
	public User(String name, long cNo, String status)
	{
		this.name= name;
		this.cNo=cNo;
		//this.pswd=pswd;
		this.status=status;
	}
	public int getPswd() {
		return pswd;
	}

}
