package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//make sure you have jdbc driver in library build path 

public class createTables {
	public static void main(String[]args) throws Exception{
		//getConnection();
		createTableUser();
		createTableFlights();
		createTableConfirmation();
		
	}
	public static void createTableUser() throws Exception{
		try{
			Connection con = getConnection();
			//once we call this method we're connected to db & ready to modify
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS user(userType int NOT NULL, username varchar(45), "
					+ "password varchar(45), firstName varchar(45), middleInitial varchar(1), lastName varchar(225), "
					+ "address varchar(200), city varchar(45), zip int(5), state varchar(45), email varchar(225), "
					+ "ssn int(9), secQ varchar(225), secA varchar(225), PRIMARY KEY(username))"); 
					//for arg put in actual SQL statement
			//tablename (user) should be all lowercase. If this table doesn't exist; go ahead and create it
			//inside () tell what fields the table will have 
			//getting the SQL statement ready to use but not using yet 
			
			create.executeUpdate();
			//execute the actual statement to SQL
			
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Function Completed");
		}
	}
	
	public static void createTableFlights() throws Exception{
		try{
			Connection con = getConnection();
			//once we call this method we're connected to db & ready to modify
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS flights(flightID int NOT NULL AUTO_INCREMENT, flightNum varchar(10), "
					+ "departure varchar(45), arrival varchar(45), depTime int(11), arrTime int(11), duration int, gate varchar(45), capacity int, cost int, PRIMARY KEY(flightID))"); 
					//for arg put in actual SQL statement
			//tablename (flights) should be all lowercase. If this table doesn't exist; go ahead and create it
			//inside () tell what fields the table will have 
			//getting the SQL statement ready to use but not using yet 
			
			create.executeUpdate();
			//execute the actual statement to SQL
			
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Function Completed");
		}
	}
	
	public static void createTableConfirmation() throws Exception{
		try{
			Connection con = getConnection();
			//once we call this method we're connected to db & ready to modify
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS confirmation(confirmID int NOT NULL AUTO_INCREMENT, flightID int, "
					+ "username varchar(45), cost int(11), PRIMARY KEY(confirmID))"); 
					//for arg put in actual SQL statement
			//tablename (confirmation) should be all lowercase. If this table doesn't exist; go ahead and create it
			//inside () tell what fields the table will have 
			//getting the SQL statement ready to use but not using yet 
			
			create.executeUpdate();
			//execute the actual statement to SQL
			
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Function Completed");
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
