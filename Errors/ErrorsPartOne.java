package errorMessages;
//shahzad push

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.WindowEvent;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ErrorsPartOne extends JFrame implements ActionListener{
//file name should be errorspartone
	
	private int seatCounter = 0;
	    
	private JLabel userInstructions = new JLabel("Click the button" +
			" representing the seat you want " +
	        "to reserve the seat");
	private JButton[] buttonArray = new JButton[12];
	private JButton exitButton = new JButton("Click to Exit");
	private String authorization;
	private int[] bookedNumber = new int[12];
	private ArrayList<Boolean> seatList = new ArrayList<Boolean>(12);
	String fileName = "c:/temp/projectData.txt";
	 
	public ErrorsPartOne() {
	    super("SouthWest Airline Reservation System");
	    //addWindowListener(new WindowDestroyer( ));
	    Container contentPane = getContentPane( );
	    contentPane.setLayout(new BorderLayout( ));
	    JPanel InstructionsPanel = new JPanel( );
	    JPanel buttonPanel = new JPanel( );
		JPanel exitPanel = new JPanel( );

		//add listener to the exit button
		exitButton.addActionListener(this);


		InstructionsPanel.add(userInstructions);
		contentPane.add(InstructionsPanel, BorderLayout.NORTH);

		buttonPanel.setLayout(new GridLayout(4,3));

		for (int i=0;i<12;i++) {
			buttonArray[i] = new JButton("Seat " + (i+1));
			buttonArray[i].addActionListener(this);
			buttonPanel.add(buttonArray[i]);
			seatList.add(i, true);
		}

		contentPane.add(buttonPanel,BorderLayout.CENTER);
		exitPanel.add(exitButton);
		contentPane.add(exitPanel,BorderLayout.SOUTH);
		pack();


	}

	public void actionPerformed(ActionEvent e) {
	    String confirmExit = "Are you sure you want to exit?";
	    String confirm = "Are you sure you want to book this seat?";
	    for (int i = 0; i < 12; i++) {
	    	if (e.getActionCommand().equals("Seat " + (i + 1))) {
	    		int choice = JOptionPane.showConfirmDialog(null, confirm, "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
	    		if (choice == JOptionPane.YES_OPTION) {
	    		JOptionPane.showMessageDialog(null, "Your authorization number is 197", "", JOptionPane.INFORMATION_MESSAGE);
	    		buttonArray[i].setText("BOOKED");
	    		seatList.set(i, false);
	    		buttonArray[i].setToolTipText("Seat Occupied");
	    		buttonArray[i].setForeground(Color.red);
	    		buttonArray[i].setActionCommand("Booked");
	    		seatCounter++;
	    		if (seatCounter == 12) {
	    			JOptionPane.showMessageDialog(null, "Unfortunately the flight is booked. Please choose a different flight.", "", JOptionPane.INFORMATION_MESSAGE);
	    		}
	    	}
	    }
		
	    if (e.getActionCommand().equals("Booked")) {	
	    	JOptionPane.showMessageDialog(null, "This seat is booked. Enter the authorization code to " + "cancel the reservation", "", JOptionPane.INFORMATION_MESSAGE);
	    	authorization = JOptionPane.showInputDialog("Enter the authorization number");
	    	bookedNumber[i] = Integer.parseInt(authorization);
	    	if (bookedNumber[i] == 197) {
	    		buttonArray[i] = (JButton) e.getSource();
	    		JOptionPane.showMessageDialog(null, "Your reservation has been cancelled", "", JOptionPane.INFORMATION_MESSAGE);
	    		buttonArray[i].setText("Available");
	    		buttonArray[i].setForeground(Color.black);
	    		seatCounter--;
	    		return;
	    	}
	    	if (bookedNumber[i] != 197) {
	    		JOptionPane.showMessageDialog(null, "Incorrect authorization number. Please contact customer service " + "to cancel the reservation", "", JOptionPane.INFORMATION_MESSAGE);
	    		return;
	    	}
	    }
	    }
	
	    if (e.getActionCommand( ).equals("Click to Exit")){
	    	int choiceExit = JOptionPane.showConfirmDialog(null, confirmExit, "Confirm",
	    	JOptionPane.YES_NO_OPTION);
	    	if (choiceExit == JOptionPane.YES_OPTION){
	    		writeToFile();
	    		System.exit(0);
	    	}
	    }
	}
	    
	public void writeToFile(){
	    PrintWriter outputStream = null;
	    try{
	    	outputStream = new PrintWriter(fileName);
	    }
	    catch(FileNotFoundException e){
	    	System.out.println("Error opening the file " + fileName);
	    	System.exit(0);
	    }
	    for (int count = 0; count <12; count++){
	    	outputStream.println(seatList.get(count)?1:0);
	    }
	    outputStream.close( );

	}
	    
	public void readFromFile(){
	    try{
	    	ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
	    	int anInteger = inputStream.readInt();
	    	while (anInteger >= 0){
	    		anInteger = inputStream.readInt();
	    	}
	    	System.out.println("End of reading from file");
	    	inputStream.close();
	    }
	    catch(FileNotFoundException e){
	    	System.out.println("Error opening the file " + fileName);
	    }
	    catch(EOFException e){
	    	System.out.println("Error reading the file " + fileName);
	    	System.out.println("Reached end of the file " + fileName);
	    }
	    catch(IOException e){
	    	System.out.println("Error reading the file " + fileName);
	    }
	}
	
	protected void processWindowEvent(WindowEvent e) {
	    if (e.getID() == WindowEvent.WINDOW_CLOSING){
	    	int exit = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?");
	    	if (exit == JOptionPane.YES_OPTION) {
	    		System.exit(0);
	    	}
	    	else{
	    		super.processWindowEvent(e);
	    	}
	    }

	}
}


