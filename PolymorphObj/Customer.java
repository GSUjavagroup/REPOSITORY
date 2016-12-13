package polymorphObj;

public class Customer extends User {
	//customer 0; admin1
	private int userType;
	
	//getters and setters for userType
	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	//override default constructor
	public Customer() {
		super();
		userType = 0;
	}
	
	//constructor with all arguments needed for registration
	public Customer(String username, String password, String firstName, String middleInitial, String lastName, String address, String city, int zip, String state, String email, int ssn, String secQ, String secA) throws IllegalArgumentException{
		
		userType = 0;
		setUsername(username);
		setPassword(password);
		setFirstName(firstName);
		setMiddleInitial(middleInitial);
		setLastName(lastName);
		setAddress(address);
		setCity(city);
		setZip(zip);
		setState(state);
		setEmail(email);
		setSsn(ssn);
		setSecQ(secQ);
		setSecA(secA);
	}	
	
	
}
