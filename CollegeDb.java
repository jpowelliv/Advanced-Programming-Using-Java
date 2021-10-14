import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Joseph Powell IV
 * Use phpMyAdmin to create the "college" database 
 * using the ddl.sql file in the Week 15 Module
 * 
 * 202004226 CIS 315
 * @author jpowelliv
 */

public class CollegeDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// No longer works (driver was part of JDK 7)
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		// Go to http://ucanaccess.sourceforge.net and download the latest binaries
		// This is actually not needed due to the driver discovery support in JDK 6+
		//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		
		
		//Connection conn = DriverManager.getConnection("jdbc:ucanaccess://c:/pippo.mdb;memory=true");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/college?user=root&password=");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from person");
		while (rs.next()) {
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("last_name"));
			System.out.println(rs.getString("first_name"));
			System.out.println(rs.getString("sex"));
			System.out.println(rs.getString("major"));
	}
}
}