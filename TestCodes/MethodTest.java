package testCodes;

import java.util.ArrayList;

import database.Validate;
import database.ConfirmationTable;
import database.DeleteData;
import database.SelectData;
import database.SendData;

public class MethodTest {
	
	public static <E> void main(String[]args) throws Exception{
		
		SendData send = new SendData();
		Validate val = new Validate();
		SelectData select = new SelectData();
		DeleteData delete = new DeleteData();
		ConfirmationTable confirm = new ConfirmationTable();
		
		//val.FindUser("mail@mail.com");
		
		
		//boolean a;
		//a = val.Validate("bpants");
		//System.out.println(a);
		
		//testing creating data in the confirmation table
		//insertConfirm(ArrayList<String> array)
		//selectConfirm(String username, int flightID)
		
		//ArrayList<String> array = confirm.selectConfirm("lhornor", 2);
		//confirm.insertConfirm(array);
		
		//delete.deleteUser("mHealy");
		
		
		//(String username, String password, String firstName, String middleInitial, String lastName, String address, String city, int zip, String state, String email, int ssn, String secQ, String secA) throws IllegalArgumentException{
		
		//Customer bob = new Customer("username", "password", "Bob", "M", "Smith", "123 Road", "Athens", 30062, "GA", "bsmith@email.com", 123456789, "dog name?", "spot");
		//System.out.print(bob.getUserType() + " " + bob.getUsername() + " " + bob.getSecA());
		
		//try {
			//send.postCust(bob);
			//System.out.println("success!");
		//} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//System.out.println("catch");
		//}
		
		
		//send.postFlight(11, "A67", "Atlanta", "Orlando", 800, 900, 1, "B67", 100, 50);
		
		//val.Validate("lhornor", "password");
		
//		ArrayList<ArrayList<E>> allFlights = new ArrayList<ArrayList<E>>();
//		
//		ArrayList<E> one = select.selectFlight(1); // added () 
//		ArrayList<E> two = select.selectFlight(2);
//		ArrayList<E> three = select.selectFlight(3);
//		ArrayList<E> four = select.selectFlight(4);
//		ArrayList<E> five = select.selectFlight(5);
//		ArrayList<E> six = select.selectFlight(6);
//		ArrayList<E> seven = select.selectFlight(7);
//		ArrayList<E> eight = select.selectFlight(8);
//		ArrayList<E> nine = select.selectFlight(9);
//		ArrayList<E> ten = select.selectFlight(10);
//		ArrayList<E> eleven = select.selectFlight(11);
//		
//		
//		allFlights.add(one);
//		allFlights.add(two);
//		allFlights.add(three);
//		allFlights.add(four);
//		allFlights.add(five);
//		allFlights.add(six);
//		allFlights.add(seven);
//		allFlights.add(eight);
//		allFlights.add(nine);
//		allFlights.add(ten);
//		allFlights.add(eleven);
//		
//		
//		for (int i=0; i<allFlights.size(); i++){
//			System.out.println(allFlights.get(i));
//		}
//	
		    
	}

}
