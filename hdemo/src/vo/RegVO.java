package vo;

public class RegVO {

	private int id;
	private String firstname;
	private String lastname;
	
	userVO uv = new userVO();
	
	public userVO getUv() {
		return uv;
	}
	public void setUv(userVO uv) {
		this.uv = uv;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
