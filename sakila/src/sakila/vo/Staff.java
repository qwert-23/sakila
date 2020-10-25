package sakila.vo;

public class Staff {
	// 11개의 필드
	// toString 하기
	private int staffId;
	private String fitstName;
	private String lastName;
	private int adressId;
	private String picture;
	private String email;
	private int storeId;
	private int active;
	private String userName;
	private String password;
	private String lastUpdate;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getFitstName() {
		return fitstName;
	}
	public void setFitstName(String fitstName) {
		this.fitstName = fitstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAdressId() {
		return adressId;
	}
	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", fitstName=" + fitstName + ", lastName=" + lastName + ", adressId="
				+ adressId + ", picture=" + picture + ", email=" + email + ", storeId=" + storeId + ", active=" + active
				+ ", userName=" + userName + ", password=" + password + ", lastUpdate=" + lastUpdate + "]";
	}
	
	


}
