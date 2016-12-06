import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersController {
	
	public void register(User user) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline?user=root&password=root123!");
			Statement statement = conn.createStatement();
			String username = user.getUsername();
			String password = user.getPassword();
			String stmtString = "insert into `airline`.`users` "
					+ "(`username`, `password`)"
					+ "values ('" + username + "', '" + password + "');";
			statement.execute(stmtString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public User login(String username, String password) {
		Connection conn = null;
		User loginUser = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline?user=root&password=root123!");
			Statement query = conn.createStatement();
			String queryString = "select * from `users`"
					+ "where `username` = '" + username + "' and "
							+ "`password` = '" + password + "';";
			ResultSet result = query.executeQuery(queryString);
			boolean exists = result.first();
			if (exists) {
				loginUser = new User();
				loginUser.setUsername(result.getString("username"));
				loginUser.setPassword(result.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return loginUser;
	}
}
