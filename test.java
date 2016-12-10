package userInfo;
import database.*;
public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Admin(String firstN, String middle, String lastN, String address, String city, 
		//String state, String zipcode, String ssn, String email, String username, String password, 
		//String securityQ, String securityA)
		
		insertUserData insert = new insertUserData();
		
		Customer steve = new Customer("Steve", "F", "Farley", "123 Road", "Marietta", "GA", "30062", "123456789", "steve@mail.com", "sfarley", "password", "favorite color?", "green");
		
		Admin laura = new Admin("Laura", "M", "Hornor", "123 Road", "Marietta", "GA", "30062", "123456789", "laura@mail.com", "lhornor", "password", "favorite color?", "blue");

		//insert.postCust(steve);
		insert.postAdmin(laura);
	}

}
