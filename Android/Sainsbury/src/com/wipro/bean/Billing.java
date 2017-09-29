package com.wipro.bean;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.wipro.DAO.*;
import com.wipro.util.*;

public class Billing {
	private int bid;
	private int iid;
	private String itemNames;
	private int itemQuantities;
	private double itemPrices;
	private double totalPrice;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getItemNames() {
		return itemNames;
	}
	public void setItemNames(String itemNames) {
		this.itemNames = itemNames;
	}
	public int getItemQuantities() {
		return itemQuantities;
	}
	public void setItemQuantities(int itemQuantities) {
		this.itemQuantities = itemQuantities;
	}
	public double getItemPrices() {
		return itemPrices;
	}
	public void setItemPrices(double itemPrices) {
		this.itemPrices = itemPrices;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	//private Date date;
	public Billing(){
		
		
	}
	public Billing(int bid, int iid, String itemNames, int itemQuantities,
			double itemPrices, double totalPrice) {
		super();
		this.bid = bid;
		this.iid = iid;
		this.itemNames = itemNames;
		this.itemQuantities = itemQuantities;
		this.itemPrices = itemPrices;
		this.totalPrice = totalPrice;
		//this.date = date;
	}

	public Billing(String itemNames, int itemQuantities, double itemPrices,
			double totalPrice) {
		super();
		this.itemNames = itemNames;
		this.itemQuantities = itemQuantities;
		this.itemPrices = itemPrices;
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Billing [bid=" + bid + ", iid=" + iid + ", itemNames="
				+ itemNames + ", itemQuantities=" + itemQuantities
				+ ", itemPrices=" + itemPrices + ", totalPrice=" + totalPrice
				+"]";
	}
	/*public void getBill() throws SQLException{
		BillingSAO billy = new BillingSAO();
		//Scanner in = new Scanner(System.in);
		System.out.print("Enter the Bill ID you wish to view: ");
		int getBid = BillingSAO.intInput();
		billy.getBilling(getBid);
		
	}
	public void delBill() throws SQLException{
		BillingSAO billy = new BillingSAO();
		//Scanner in = new Scanner(System.in);
		System.out.print("Enter billing ID: ");
		int getBid = BillingSAO.intInput();
		billy.delBill(getBid);

	}
	public void updateBill() throws SQLException{
		BillingSAO billy = new BillingSAO();
		//Scanner in = new Scanner(System.in);
		System.out.print("Enter billing ID: ");
		int getBid = BillingSAO.intInput();
		billy.updateBill(getBid);

	}
	public void createBill() throws SQLException{
		BillingSAO billy = new BillingSAO();
		//Scanner in = new Scanner(System.in);
		System.out.print("Enter billing ID: ");
		int getBid = BillingSAO.intInput();
		billy.createBill();

	}*/

}