package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Objects;

public class Validate<E> {
	
	SelectData select = new SelectData();
	
	public Validate(){
		//copy/ paste to test line: Validate val = new Validate();
		
	}
	//use for verifying that a username and password match for the login screen 
	public boolean Validate(String username, String password){
		//call our selectData method
		try {
			ArrayList< E > array = select.selectUser(username);
			System.out.println("row selected");
			
			String dbPass = (String) array.get(2);
			System.out.println(dbPass);
			
			//Internet says You almost always want to use Objects.equals()
			
			if (Objects.equals(password, dbPass)){
				System.out.println("validate confirm");
				return true;
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	//use for verifying a username already exists in the database 
	public boolean Validate(String uname) throws Exception{
		boolean status = false;
		
		try{
			Connection conn = getConnection(); //establish connection
			
			final String queryCheck = "SELECT * from user WHERE username = ?";
			final PreparedStatement ps = conn.prepareStatement(queryCheck);
			ps.setString(1, uname);
			final ResultSet resultSet = ps.executeQuery();
			
			
			if(resultSet.next()){
		        status= true;
		        System.out.println("FOUND IT");
		    }
		    else{
		        status= false;
		    }
		    conn.close();
		    
		} catch (Exception e){
			System.out.println(e);
			
		}
		return status;
		 
	}
	
	//Use for verifying a flightID already exists in database
	public boolean Validate(int flightID) throws Exception{
		boolean status = false;
		
		try{
			Connection conn = getConnection(); //establish connection
			
			final String queryCheck = "SELECT * from flights WHERE flightID = ?";
			final PreparedStatement ps = conn.prepareStatement(queryCheck);
			ps.setInt(1, flightID);
			final ResultSet resultSet = ps.executeQuery();
			
			
			if(resultSet.next()){
		        status= true;
		        System.out.println("FOUND IT");
		    }
		    else{
		        status= false;
		    }
		    conn.close();
		    
		} catch (Exception e){
			System.out.println(e);
			
		}
		return status;
		 
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
