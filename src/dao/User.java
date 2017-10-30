package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class User {
	final static Logger logger = Logger.getLogger(User.class);
	// method for create connection
		public static Connection getConnection() throws Exception {
			try {
				logger.debug("Successfully Conected to the database");
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection("jdbc:mysql://localhost:3306/db02", "tuxito", "toor");
			} catch (Exception e) {
				logger.debug("Sorry Cant Conect to the database");
				e.printStackTrace();
				return null;
			}
		}
		
		// method for save user data in database
		public int registerUser(String firstname, String surname, String username, String email, String passwd) throws Exception {
			int i = 0;
			try {
				String query = "INSERT INTO users VALUES (?,?,?,?,?)";
				PreparedStatement ps = getConnection().prepareStatement(query);
				ps.setString(1, firstname);
				ps.setString(2, surname);
				ps.setString(3, username);
				ps.setString(4, email);
				ps.setString(5, passwd);
				i = ps.executeUpdate();
				return i;
			} catch (Exception e) {
				e.printStackTrace();
				return i;
			} finally {
				if (getConnection() != null) {
					getConnection().close();
				}
			}
		}

		// method for fetch saved user data
		public ResultSet report() throws SQLException, Exception {
			ResultSet rs = null;
			try {
				String query = "SELECT firstname, surname, username, email, passwd FROM users";
				PreparedStatement ps = getConnection().prepareStatement(query);
				rs = ps.executeQuery();
				return rs;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} finally {
				if (getConnection() != null) {
					getConnection().close();
				}
			}
		}
}