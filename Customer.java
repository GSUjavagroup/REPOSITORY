package userInfo;

public class Customer extends User {
	//customer 0; admin1
	private int userType = 0;
	

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public Customer() {
		super();
		this.userType = userType;
	}
	public Customer(String firstN, String middle, String lastN, String address, String city, String state, String zipcode, String ssn, String email, String username, String password, String securityQ, String securityA) throws IllegalArgumentException{
		userType = 0;
		
		setFirstN(firstN);
		setMiddle(middle);
		setLastN(lastN);
		setAddress(address);
		setCity(city);
		setState(state);
		setZipcode(zipcode);
		setSsn(ssn);
		setEmail(email);
		setUsername(username);
		setPassword(password);
		setSecurityQ(securityQ);
		setSecurityA(securityA);
	}
		
}
