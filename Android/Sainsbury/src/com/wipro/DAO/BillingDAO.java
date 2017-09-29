package com.wipro.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.IntPredicate;

import com.wipro.bean.Billing;
import com.wipro.util.Service;


public class BillingDAO {


	public void getBilling() throws SQLException{
		PreparedStatement statement = null;
		Connection con = null;
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SCOTT","tiger");
		System.out.println("Connection Established successfully");
		
		//System.out.println("bid" + getBid);
		System.out.print("Enter ID you wish to view: ");
		int getBid = Service.intInput();
		String sql = "SELECT BID,IID,ITEM,QUANTITY,PRICE,TOTALPRICE from BILLING_TABLE WHERE BID = ?";
		statement = con.prepareStatement(sql);
		statement.setInt(1, getBid);
		ResultSet rs = statement.executeQuery();
		
		
		//if (!rs.next()){
		//	System.out.println("No billing found.");
		//}
		//System.out.println("2");
		 while(rs.next()){
	         getBid  = rs.getInt("BID");
	         int iid  = rs.getInt("IID");;
	         String items  = rs.getString("ITEM");
	         int quantity  = rs.getInt("QUANTITY");
	         double prices  = rs.getDouble("PRICE");
	         double total  = rs.getDouble("TOTALPRICE");
	         System.out.print("BID: " + getBid);
	         System.out.print(",\n" +"IID: " + iid);
	         System.out.print(",\n" +"Items: " + items);
	         System.out.print(",\n" +"Quantity: " + quantity);
	         System.out.print(",\n" +"Prices: " + prices);
	         System.out.print(",\n" +"Total Price: " + total);
	      }
		 
	      rs.close();

	}
	public void delBill() throws SQLException{
		Statement statement = null;
		Connection con = null;
		
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SCOTT","tiger");
			System.out.println("Connection Established successfully");
			statement = con.createStatement();
		} catch (SQLException e) {
			System.out.println("Connection could not be established ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print("Enter ID you wish to view: ");
		int id = Service.intInput();
		String sql = "delete from BILLING_TABLE where bid = "+id ;
		ResultSet rs = statement.executeQuery(sql);
		 System.out.println(id +" has been deleted.");
	      rs.close();
	      //System.out.println("3");

	}
	public void updateBill() throws SQLException{
		Statement statement = null;
		Connection con = null;
		Scanner in = new Scanner(System.in);
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SCOTT","tiger");
			System.out.println("Connection Established successfully");
			statement = con.createStatement();
		//System.out.println("lol");
		ResultSet rs = null;
		System.out.print("Enter the ID of the bill you wish to update: ");
		int id = 0;
		boolean repeatAgain = true;
		do {
			id = Service.intInput();
			String sql = "SELECT ITEM,QUANTITY,PRICE,TOTALPRICE from BILLING_TABLE where bid = "+id ;
			rs = statement.executeQuery(sql);
			if (rs.next()){
				System.out.print("Updated items list: ");
				String item = in.nextLine();
			//	System.out.println(item);
				System.out.print("Updated quantity: ");
				int quant = Service.intInput();
				//System.out.println(quant);
				System.out.print("Updated Price: ");
				double price = Service.doubleInput();
				System.out.println("Updated Total price : ");
				double total =  quant*price;
				System.out.println("Total price: "+total);
				
				PreparedStatement statement1;
				String updateQuery = "UPDATE BILLING_TABLE SET ITEM = ?, QUANTITY = ?, PRICE = ?, TOTALPRICE = ?"
				        + " WHERE BID = " + id;
				statement1 = con.prepareStatement(updateQuery);
				statement1.setString(1, item);//item
				statement1.setInt(2, quant);//quantity
				statement1.setDouble(3, price);//price of item
				statement1.setDouble(4, total);//total price
				statement1.executeUpdate();
				repeatAgain = false;
				System.out.println(id +" has been updated.");
			} else { 
				System.out.print("ID Does not exist, try again: ");
				//repeatAgain = true;
				 
			}
		}while (repeatAgain);
		
	}
	public Billing createBill() throws SQLException{
		Statement statement = null;
		Connection con = null;
		Scanner in = new Scanner(System.in);
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SCOTT","tiger");
			System.out.println("Connection Established successfully");
			statement = con.createStatement();
		} catch (SQLException e) {
			System.out.println("Connection could not be established ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Add item name: ");
		String item = in.nextLine();
		//System.out.println(item);
		int getIID = 0;
		//PreparedStatement statement1;//dont need
		getIID = returnIID(item);
		//System.out.println("Id="+getIID);
		while (getIID == 0){
			System.out.print("Item not found, try again: ");
			item = in.nextLine();
			getIID = returnIID(item);
			//System.out.println(getIID);
		}
		
		//rs2.close();
		System.out.print("Add quantity");
		int quant = Service.intInput();
		//System.out.println(quant);
		System.out.print("Add price");
		double price = Service.doubleInput();
		//System.out.println(price);
		double total =  quant*price;
		System.out.println("Total price: " +total);
		PreparedStatement statement2 = con.prepareStatement("INSERT INTO BILLING_TABLE VALUES (?, ?, ?, ?, ?, ?)");
		
		Billing b = new Billing("name", 3, 3, 9);
		statement2.setInt(1, b.getBid());//uid
		statement2.setInt(2, getIID);//iid
		
		statement2.setString(3, item);//item
		statement2.setInt(4, quant);//quantity
		statement2.setDouble(5, price);//price of item
		statement2.setDouble(6, total);//total price
		statement2.execute();
		System.out.println("Bill was added to the database");
		return new Billing(item,quant,price,total);
	}
	
	public static int returnIID(String item){
		PreparedStatement statement = null;
		Connection con = null;
		int getIID=0;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SCOTT","tiger");
			//System.out.println("Connection Established successfully");
			String sql = "SELECT IID FROM item WHERE name = ?";
			statement = con.prepareStatement(sql);
			statement.setString(1, item);
			ResultSet rs = statement.executeQuery();
			
			
			if (rs.next()){
				 getIID = rs.getInt("iid");
				// System.out.println(getIID+"@@@@@@@@@@@@@@");
			 }
		} catch (SQLException e) {
			System.out.println("Connection could not be established ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		 return getIID ;
	}

//	public static void main(String[] args) throws SQLException {
//		Billing bean = new Billing(14, 12, "Beans", 1, 1, 1);
//		//getBilling(bean.getBid());
//		//getBilling(bean.getBid());
//		//createBill();
//		//delBill();
//		updateBill();
//	}

}