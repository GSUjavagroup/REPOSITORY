import java.util.Scanner;

public class Tui {
	private UsersController usersController;
	private Scanner scanner;
	private User currentUser;
	
	public Tui(User _currentUser) {
		this.currentUser = _currentUser;
		this.scanner = new Scanner(System.in);
		this.usersController = new UsersController();
	}
	
	public void run() {
		if (this.currentUser == null) {
			System.out.println("1. Register");
			System.out.println("2. Login");
			
			int choice = this.getNumberFromUser("Would you like to register or login?");
			
			if (choice == 1) {
				System.out.println("You've chosen to register.");
				String username = this.getStringFromUser("Please enter a username: ");
				String password = this.getStringFromUser("Please enter a password: ");
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				// set other properties here
				
				this.usersController.register(user);
			} else if (choice == 2) {
				System.out.println("You've chosen to login.");
				String username = this.getStringFromUser("Please enter a username: ");
				String password = this.getStringFromUser("Please enter a password: ");
				User loginUser = this.usersController.login(username, password);
				if (loginUser == null) {
					System.out.println("There was a problem with the username or password.");
				} else {
					this.currentUser = loginUser;
					System.out.println("Welcome " + loginUser.getUsername());
				}
			}
		} else {
			System.out.println("Welcome " + this.currentUser.getUsername());
		}
	}
	
	private int getNumberFromUser(String message) {
		System.out.print(message + "\t");
		String option = this.scanner.nextLine();
		int choice = Integer.parseInt(option);
		return choice;
	}
	
	private String getStringFromUser(String message) {
		System.out.print(message + "\t");
		String input = this.scanner.nextLine();
		return input;
	}
}