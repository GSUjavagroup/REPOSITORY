
public class Driver {
	public static void main(String[] args) {
		User currentUser = null;
		Tui tui = new Tui(currentUser);
		tui.run();
	}
}
