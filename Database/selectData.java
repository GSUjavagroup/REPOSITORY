package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import userInfo.Admin;
import userInfo.Customer;

public class insertUserData {
	
	public insertUserData(){
		
	}
	//code to push customer object data to MySQL
	public static void postCust(Customer a) throws Exception{
		getConnection();
		
		int userType = a.getUserType(); 	//userType
		String userName = a.getUsername(); 	//username
		String pass = a.getPassword(); 		//password
		String firstN = a.getFirstN();		//firstName
		String middleI = a.getMiddle();		//middleInitial
		String lastN = a.getLastN();		//lastName
		String address = a.getAddress();	//address
		String city = a.getCity();			//city
		String zip = a.getZipcode();		//zip
		String state = a.getState();		//state
		String email = a.getEmail();		//email
		String ssn = a.getSsn();			//ssn
		String secQ = a.getSecurityQ();		//secQ
		String secA = a.getSecurityA();		//secA
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			//next make a prepared statement; args are SQL code; INSERT INTO "tablename" + fields to insert
			//SQL code: firstName, lastName (column headers) VALUES(' ')
			//inserting variables into values: single quote bc it's String, ending quote string + variable + ending quote, add variable same syntax
			PreparedStatement posted = con.prepareStatement("INSERT INTO user(userType, username, password, firstName, middleInitial, lastName, address, city, zip, state, email, ssn, secQ, secA) "
					+ "VALUES('"+userType+"', '"+userName+"', '"+pass+"', '"+firstN+"', '"+middleI+"', '"+lastN+"', '"+address+"', '"+city+"', '"+zip+"', '"+state+"', '"+email+"', '"+ssn+"', '"+secQ+"', '"+secA+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
			
		
			
		}catch (Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
		
	}
	public static void postAdmin(Admin a) throws Exception{
		getConnection();
		
		int userType = a.getUserType(); 	//userType
		String userName = a.getUsername(); 	//username
		String pass = a.getPassword(); 		//password
		String firstN = a.getFirstN();		//firstName
		String middleI = a.getMiddle();		//middleInitial
		String lastN = a.getLastN();		//lastName
		String address = a.getAddress();	//address
		String city = a.getCity();			//city
		String zip = a.getZipcode();		//zip
		String state = a.getState();		//state
		String email = a.getEmail();		//email
		String ssn = a.getSsn();			//ssn
		String secQ = a.getSecurityQ();		//secQ
		String secA = a.getSecurityA();		//secA
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			//next make a prepared statement; args are SQL code; INSERT INTO "tablename" + fields to insert
			//SQL code: firstName, lastName (column headers) VALUES(' ')
			//inserting variables into values: single quote bc it's String, ending quote string + variable + ending quote, add variable same syntax
			PreparedStatement posted = con.prepareStatement("INSERT INTO user(userType, username, password, firstName, middleInitial, lastName, address, city, zip, state, email, ssn, secQ, secA) "
					+ "VALUES('"+userType+"', '"+userName+"', '"+pass+"', '"+firstN+"', '"+middleI+"', '"+lastN+"', '"+address+"', '"+city+"', '"+zip+"', '"+state+"', '"+email+"', '"+ssn+"', '"+secQ+"', '"+secA+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
			
		
			
		}catch (Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
		
	}
	
	public static Connection getConnection() throws Exception{
		//import connection from java.sql and add try/catch 
		try{
			String driver = "com.mysql.jdbc.Driver";
			//string url is where the database is located over the Internet 
			String url = "jdbc:mysql://localhost:3306/AirlineReservation";
					//formula for local is default 3306 port + database name
					//if not using local host then put IP address of server connecting to
			String username = "root"; //default username
			String password = "5rujiruz"; //whatever you set your password to on installation
			//default username is root and use password set in terminal setup
			Class.forName(driver);
			//driver variable created above is used
			
			Connection conn = DriverManager.getConnection(url, username, password);
					//import driver manager and use built in method getConnection
			
			System.out.println("Connected");
			return conn;
		} catch (Exception e) {
			System.out.println(e); //make sure we add a catch for failed connections
		}
		
		return null;
		//leave as null and return connection in the try statement above
	}


}

	//firstName = jtf[0].getText();
	//middleInitial = jtf[1].getText();
	//lastName = jtf[2].getText();
	//streetAddress = jtf[3].getText();
	//city = jtf[4].getText();
	//state = comboBox_1.getSelectedItem().toString();
	//zipCode = jtf[5].getText();
	//SSN = jtf[6].getText();
	//emailAddress = jtf[7].getText();
	//userName = jtf[8].getText();
	//initialPassword = jtf[9].getText();
	//confirmPassword = jtf[10].getText();
	//secQuest = comboBox_2.getSelectedItem().toString();
	//answerToQuestion = jtf[11].getText();
