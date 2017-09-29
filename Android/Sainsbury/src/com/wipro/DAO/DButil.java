package com.wipro.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.wipro.bean.Customer;
import com.wipro.DAO.CustomerDAO;
import com.wipro.util.Service;

public class DButil {
	
	
public static void main(String[] args) {
	getConnection();
}
public static Connection getConnection(){
	
	//Establish Connection
	Connection con=null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl1";
	String uname="scott";
	String pwd="tiger";
	try {
		con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("Connected");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}


}
