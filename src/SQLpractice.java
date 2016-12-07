package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQLpractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//YOU NEED TO UNCOMMENT EACH FUNCTION TO RUN IT IN THE MAIN
		
		//actually call the connection in the main; will prompt to auto add throw/try/catch
		//getConnection();
		
		//go directly to create table bc we open connection in the code anyways:
		//createTable();
		
		//testing inserting data function:
		//post();

	}
	public static void post() throws Exception{
		//create two variables; use final method to save memory
		final String var1 = "John";
		final String var2 = "Miller";
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			//next make a prepared statement; args are SQL code; INSERT INTO "tablename" + fields to insert
			//SQL code: firstName, lastName (column headers) VALUES(' ')
			//inserting variables into values: single quote bc it's String, ending quote string + variable + ending quote, add variable same syntax
			PreparedStatement posted = con.prepareStatement("INSERT INTO flightinfo (firstName, lastName) VALUES('"+var1+"', '"+var2+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void createTable() throws Exception{
		try{
			Connection con = getConnection();
			//once we call this method we're connected to db & ready to modify
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS flightinfo(id int NOT NULL AUTO_INCREMENT, firstName varchar(255), lastName varchar(244), PRIMARY KEY(id))"); 
					//for arg put in actual SQL statement
			//tablename (flightinfo) should be all lowercase. If this table doesn't exist; go ahead and create it
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
			String url = "jdbc:mysql://localhost:3306/AirlineProject";
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
