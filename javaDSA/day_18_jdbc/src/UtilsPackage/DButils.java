package UtilsPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {

 private static Connection conn;
 //addng static method tp rturn db connection
 
 public static Connection openConnection() throws ClassNotFoundException, SQLException 
 {
//1.optional step load jdbc driver
	 //Class.forName("com.mysql.cj.jdbc.Driver");
//2.Compulsory step to establish connection with db
	 //java.sql.DriverManager:class
	 //APiI: public static Connection getConnection(String dbUrl,String userName,String pwd)throws SQLException
	 
	 String dbURL = "jdbc:mysql://localhost:3306/advjava?useSSL=false&allowPublicKeyRetrieval=true";
	 
	 return DriverManager.getConnection(dbURL, "root", "kshitij123");
	 
}
 
}
