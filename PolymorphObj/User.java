package polymorphObj;

public abstract class User {
	
	private String username;	//jtf[8]
	private String password;	//jtf[9]
	private String firstName; 	//jtf[0]
	private String middleInitial; //jtf[1]
	private String lastName; 		//jtf[2]
	private String address;		//jtf[3]
	private String city;		//jtf[4]
	private int zip;			//jtf[5]
	private String state;		//no array value for state?
	private String email;		//jtf[7]
	private int ssn;			//jtf[6]
	private String secQ;		//no array value for security question
								//nothing for jtf[10] because it's confirming password?
	private String secA;		//jtf[11]
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getSecQ() {
		return secQ;
	}
	public void setSecQ(String secQ) {
		this.secQ = secQ;
	}
	public String getSecA() {
		return secA;
	}
	public void setSecA(String secA) {
		this.secA = secA;
	}
	
	
	
	
	
	

}
