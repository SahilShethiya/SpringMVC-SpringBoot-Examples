package vo;

public class State_VO {
	private String state_id;
	private String state_name;
	private Country_VO obj;
	public String getState_id() {
		return state_id;
	}
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public Country_VO getObj() {
		return obj;
	}
	public void setObj(Country_VO obj) {
		this.obj = obj;
	}
	
}
