
/**
 * 
 */

/**
 * @author singh
 *
 */
import java.sql.*;

public class comm {
	Connection c;
	Statement s;

	public comm() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("initializing driver");
			c = DriverManager.getConnection("jdbc:mysql:///project2", "root", "");
			s = c.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
