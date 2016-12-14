package database;

import java.util.ArrayList;
import java.util.Objects;

public class Validate<E> {
	
	selectData select = new selectData();
	
	public Validate(){
		//copy/ paste to test line: Validate val = new Validate();
		
	}
	
	public boolean Validate(String username, String password){
		//call our selectData method
		try {
			ArrayList< E > array = select.selectUser(username);
			System.out.println("row selected");
			
			String dbPass = (String) array.get(2);
			System.out.println(dbPass);
			
			//Internet says You almost always want to use Objects.equals()
			
			if (Objects.equals(password, dbPass)){
				System.out.println("they match!");
			}
			else 
				System.out.println("they do not match");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}

}
