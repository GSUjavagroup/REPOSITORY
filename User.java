package userInfo;

public class User {
	
	private String firstN; 		//jtf[0]
	private String middle; 		//jtf[1]
	private String lastN; 		//jtf[2]
	private String address;		//jtf[3]
	private String city;		//jtf[4]
	private String state;
	//no array value for state?
	private String zipcode;		//jtf[5]
	private String ssn;			//jtf[6]
	private String email;		//jtf[7]
	private String username;	//jtf[8]
	private String password;	//jtf[9]
	//nothing for jtf[10] because it's confirming password?
	private String securityQ;
	//no array value for security question
	private String securityA;	//jtf[11]
	
	
	public User(User orig) {
		// TODO Auto-generated constructor stub
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstN() {
		return firstN;
	}
	public void setFirstN(String firstN) {
		this.firstN = firstN;
	}
	public String getLastN() {
		return lastN;
	}
	public void setLastN(String lastN) {
		this.lastN = lastN;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSecurityQ() {
		return securityQ;
	}
	public void setSecurityQ(String securityQ) {
		this.securityQ = securityQ;
	}
	public String getSecurityA() {
		return securityA;
	}
	public void setSecurityA(String securityA) {
		this.securityA = securityA;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//METHODS FOR ALL USERS (remember customer and admin will inherit)
	
	
	

}
