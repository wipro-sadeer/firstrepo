package com.wipro.bean;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.wipro.DAO.DButil;

	public class Inventory {
		private int ItemID;
		private String ItemName;
		private String ItemDescription;
		private double ItemPrice;
		private int ItemQuantity;
		
		public Inventory(){
			super();
			
		}
		
		public int getItemID() {
			return ItemID;
		}
		public void setItemID(int itemID) {
			this.ItemID = itemID;
		}
		
		public String getItemName() {
			return ItemName;
		}
		public void setItemName(String itemName) {
			this.ItemName = itemName;
		}
		public String getItemDescription() {
			return ItemDescription;
		}
		public void setItemDescription(String itemDescription) {
			this.ItemDescription = itemDescription;
		}
		public double getItemPrice() {
			return ItemPrice;
		}
		public void setItemPrice(double itemPrice) {
			this.ItemPrice = itemPrice;
		}
		public int getItemQuantity() {
			return ItemQuantity;
		}
		public void setItemQuantity(int itemQuantity) {
			this.ItemQuantity = itemQuantity;
		}
				

		public Inventory addInventory() throws SQLException{
			Scanner scanner = new Scanner (System.in);

			Connection con= DButil.getConnection();
			java.sql.Statement st=con.createStatement();
			
			//System.out.println("Please enter the Item ID");
			//int ItemID = scanner.nextInt();
			int itemID = 0 ;
			System.out.println("enter item name");
			String ItemName = scanner.next();
			System.out.println("enter item desc");
			String ItemDescription = scanner.next();
			System.out.println("enter item price");
			double ItemPrice = scanner.nextDouble();
			System.out.println("enter item quantity");
			int ItemQuantity = scanner.nextInt();
			
			PreparedStatement statement1 = con.prepareStatement("INSERT into item values(?,?,?,?,?)");
			
			itemID = getID(); 
			statement1.setInt(1, itemID);
			statement1.setString(2, ItemName);
			statement1.setString(3, ItemDescription);
			statement1.setDouble(4, ItemPrice);
			statement1.setInt(5, ItemQuantity);
			
			statement1.execute();
			
			System.out.println("something has been added to the DB");
			
			return new Inventory();
		}
		

		public static int getID() throws SQLException{
			int id = 0;
			Connection con= DButil.getConnection();
			PreparedStatement statement1 = con.prepareStatement("select test_seq.nextval from dual");
			ResultSet rs=statement1.executeQuery();
			
			//ResultSet rs = statement1.executeQuery("select test_seq.nextval from dual /");
			
			while(rs.next()){
				id = rs.getInt(1); 
			}
			rs.close();
			return id;
		}
		public static void searchInventory() throws SQLException {
			Scanner scanner1 = new Scanner(System.in);
			Connection con= DButil.getConnection();
			java.sql.Statement st=con.createStatement();
			
			System.out.println("Search for an item by its ID..");
			int InventoryID = scanner1.nextInt();
			
		String sql = "SELECT * from item where IID = "+InventoryID;
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			int itemid = rs.getInt("IID");
			String itemname = rs.getString("NAME");
			String itemdescription = rs.getString("DESCRIPTION");
			int itemprice = rs.getInt("PRICE");
			int itemquantity = rs.getInt("QUANTITY");
			System.out.println("\n" + "ID: " + itemid);
			System.out.println("\n" + "NAME: " + itemname);
			System.out.println("\n" + "DESCR: " + itemdescription);
			System.out.println("\n" + "PRICE: " + itemprice);
			System.out.println("\n" + "QUANTITY: " + itemquantity);
		}
		rs.close();
		


		}
		
		// Delete Method
		public static void deleteItem() throws SQLException {

			try{
				Connection con= DButil.getConnection();
				java.sql.Statement st=con.createStatement();
				st =con.createStatement();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Item ID deleted Item");
			int id=scan.nextInt();
			String sql="delete from item where IID ="+ id;
			System.out.println(sql);
			int count=st.executeUpdate(sql);
			
			if (count==1)
				System.out.println("Record deleted");
			else
				System.out.println("Record not deleted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		
		public static void editItem()
				throws SQLException {
			
			try {
				Connection con= DButil.getConnection();
				java.sql.Statement st=con.createStatement();
				st =con.createStatement();
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter ITEM_ID to be updated");
				int id=Integer.parseInt(scan.nextLine());
				
				System.out.println("Enter ITEM Name to be updated");
				String name =scan.nextLine();
				
				System.out.println("Enter ITEM DESCRIPTION to be updated");
				String desc = scan.nextLine();
				
				System.out.println("Enter ITEM PRICE to be updated");
				double price= scan.nextDouble();
				
				System.out.println("Enter ITEM QUANTITY to be updated");
				int quantity= scan.nextInt();
				
				
				
				//String sql="update item SET NAME ='" + name + "' where IID = "+id ;
				
				String sql="UPDATE item SET NAME ='" + name + "', DESCRIPTION='"
						+ desc + "', PRICE=" + price + ", QUANTITY=" + quantity + " where IID="+id;
				
				System.out.println(sql);
				st.execute(sql);
			
				int count=st.executeUpdate(sql);
				
				if (count==1)
					System.out.println("Record Updated");
				else
					System.out.println("Record not Updated");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		}
		

		

		


