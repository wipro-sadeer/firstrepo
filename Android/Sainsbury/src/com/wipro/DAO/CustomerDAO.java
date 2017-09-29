package com.wipro.DAO;

import java.beans.Statement;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.wipro.DAO.DButil;
import com.wipro.bean.Customer;

public class CustomerDAO {
	public boolean insertEmp(Customer cust){
		
		try {
			Connection con= DButil.getConnection();
			java.sql.Statement st=con.createStatement();
				String sql="insert into Customer values(?,?,?,?,?,?)";
				PreparedStatement pre=con.prepareStatement(sql);
				pre.setInt(1, cust.getCID());
				pre.setString(2,cust.getName());
				pre.setString(3, cust.getOneLineAddress());
				pre.setString(4, cust.town());
				pre.setString(5, cust.getPostcode());
				pre.setString(6, cust.getNumber());
				
				
				int count=pre.executeUpdate();
				
				if (count==1)
					return true;
				else
					return false;
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
	}
	
	
}

