package com.wipro.bean;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.wipro.DAO.DButil;
import com.wipro.DAO.*;



public class Customer {	
	private int CID;
	private String name;
	private String oneLineAddress;
	private String town;
	private String postcode;
	private String number;
	
	public Customer(){}
	
	public Customer(int cID, String name, String oneLineAddress, String town,
			String postcode, String number) {
		super();
		CID = cID;
		this.name = name;
		this.oneLineAddress = oneLineAddress;
		this.town = town;
		this.postcode = postcode;
		this.number = number;
	}
	
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOneLineAddress() {
		return oneLineAddress;
	}
	public void setOneLineAddress(String oneLineAddress) {
		this.oneLineAddress = oneLineAddress;
	}
	public String town() {
		return town;
	}
	public void town(String town) {
		this.town = town;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public static void addCustomer() {
		// Read values from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter first line address");
		String add = sc.next();
		System.out.println("enter town");
		String town = sc.next();
		System.out.println("enter postcode");
		String pcode = sc.next();
		System.out.println("enter number");
		String number = sc.next();

		// create a bean
		Customer bean = new Customer();
		//bean.setCID(id);
		bean.setName(name);
		bean.setOneLineAddress(add);
		bean.town(town);
		bean.setPostcode(pcode);
		bean.setNumber(number);

		// invoke the DAO method
		CustomerDAO cust = new CustomerDAO();
		if (cust.insertEmp(bean))
			System.out.println("Record Inserted");
		else
			System.out.println("Record not Inserted");

	}
	
	public void addCustomers() throws SQLException {
		// Read values from user
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter id");
		//int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter first line address");
		String add = sc.nextLine();
		System.out.println("enter town");
		String town = sc.nextLine();
		System.out.println("enter postcode");
		String pcode = sc.nextLine();
		System.out.println("enter number");
		String number = sc.nextLine();

		// create a bean
		Customer bean = new Customer();
		bean.setCID(getID());
		//System.out.println(getID());
		bean.setName(name);
		bean.setOneLineAddress(add);
		bean.town(town);
		bean.setPostcode(pcode);
		bean.setNumber(number);
		
		
		// invoke the DAO method
		CustomerDAO cust = new CustomerDAO();
		if (cust.insertEmp(bean))
			System.out.println("Record Inserted");
		else
			System.out.println("Record not Inserted");

	}
	public static int getID() throws SQLException{
		int id = 0;
		Connection con= DButil.getConnection();
		PreparedStatement statement1 = con.prepareStatement("select cust_seq.nextval from dual");
		ResultSet rs=statement1.executeQuery();
		
		//ResultSet rs = statement1.executeQuery("select test_seq.nextval from dual /");
		
		while(rs.next()){
			id = rs.getInt(1); 
		}
		rs.close();
		return id;
	}
	
	
	public void deleteCustomer(){
		try {
			Connection con= DButil.getConnection();
			java.sql.Statement st=con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter cid to be deleted");
			int id=sc.nextInt();
			
			String sql="delete from customer where CID=" + id;
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
	
	public void Retrieve() {
        
        //Create a Statement Object
        try {
        	Connection con1= DButil.getConnection();
			java.sql.Statement st=con1.createStatement();
              Scanner scan=new Scanner(System.in);
              System.out.println("Enter ID to be viewed");
              int cid = scan.nextInt();
              //String name = scan.nextLine().toLowerCase();
              
              String sql="select * from customer where CID="+cid;
              System.out.println(sql);
              ResultSet rs=st.executeQuery(sql);
              boolean flag=false;
              while (rs.next())
              {
                    flag=true;
                    System.out.println("name="+rs.getString("name"));
                    System.out.println("cid="+rs.getInt("cid"));
                    System.out.println("firstLineAddress="+rs.getString("firstLineAddress"));
                    System.out.println("town="+rs.getString("town"));
                    System.out.println("postCode="+rs.getString("postCode"));
                    System.out.println("contactNumber="+rs.getString("contactNumber"));
              }
              
              if (!flag)
              System.out.println("Record not found");
        } catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
        }
        
  }
	
	public void updateCustomer() throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.print("ID of customer you wish to edit: ");
        Connection con= DButil.getConnection();
        java.sql.Statement st=con.createStatement();
        ResultSet rs = null;

        do{
              int id=sc.nextInt();
              String sql = "SELECT NAME,FIRSTLINEADDRESS,TOWN,POSTCODE, CONTACTNUMBER from CUSTOMER where CID =" +id;
              rs = st.executeQuery(sql);
              if (rs.next()){
                    System.out.println("Enter Name to be updated");
                    String name=sc.next();
                    System.out.println("Enter Address to be updated");
                    String oneLineAddress=sc.next();
                    System.out.println("Enter Town to be updated");
                    String town=sc.next();
                    System.out.println("Enter Postcode to be updated");
                    String postcode=sc.next();         
                    System.out.println("Enter Number to be updated");
                    String number =sc.next();


                                PreparedStatement statement1;
                                      String sql1 = "UPDATE customer SET  NAME= ? ,FIRSTLINEADDRESS=?, TOWN = ? ,POSTCODE= ? , CONTACTNUMBER= ?" +" WHERE CID = " + id;
                                      statement1 = con.prepareStatement(sql1);
                                      statement1.setString(1, name);//name
                                      statement1.setString(2, oneLineAddress);//address
                                      statement1.setString(3, town);//town
                                      statement1.setString(4, postcode);//PC
                                      statement1.setString(5, number);
                                      System.out.println("Record has been updated");
                                      statement1.executeUpdate(); // This has to be empty for the SQL query to work
                                     
                                      System.out.println(id +" has been updated.");
                                } else {
                                      System.out.print("ID doesnt not exist, try again: ");
                                }
                                } while (!rs.next());
                          }

	
}


