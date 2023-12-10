package tester;
import java.sql.*;

import UtilsPackage.DButils;

public class TestDBCOnnection {

	public static void main(String[] args) {
		try(Connection connection = DButils.openConnection())
		{
			System.out.println("Connected to Database"+connection);//com.mysql.cj.jdbc.Connection			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
