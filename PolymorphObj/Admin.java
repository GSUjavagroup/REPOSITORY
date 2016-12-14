package polymorphObj;

public class Admin extends User{
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
	public Admin() {
		super();	//inherit parent abstract class fields
		userType = 1;
	}
	
	//constructor with all arguments 
	public Admin(String username, String password, String firstName, String middleInitial, String lastName, String address, String city, int zip, String state, String email, int ssn, String secQ, String secA) throws IllegalArgumentException{
		
		userType = 1;
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
