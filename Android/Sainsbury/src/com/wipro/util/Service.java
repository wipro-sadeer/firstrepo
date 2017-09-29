package com.wipro.util;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;


import java.sql.Connection;
import java.sql.DriverManager;

import com.wipro.bean.Billing;
import com.wipro.bean.Customer;
import com.wipro.bean.Inventory;
import com.wipro.DAO.BillingDAO;
import com.wipro.DAO.CustomerDAO;
import com.wipro.util.Service;

public class Service {
	public static void main(String[] args) throws SQLException {


	Customer c1 = new Customer();
	CustomerDAO cdao = new CustomerDAO();
	Service s1 = new Service();
	Inventory i1 = new Inventory();
	BillingDAO b1 = new BillingDAO();
	
		
		System.out.println("Enter option");
		System.out.println("1. Inventory Management");
		System.out.println(("2. Customer Management"));
		System.out.println("3. Billing");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
				
		
		switch(input){
		case 1:
			System.out.println("1. add item");
			System.out.println("2. delete item");
			System.out.println("3. retrieve item");
			System.out.println("4. update item");
			int input2 = sc.nextInt();
			if(input2 == 1){
				i1.addInventory();
			}
			else if(input2 == 2){
				i1.deleteItem();
			}
			else if (input2 == 3){
				i1.searchInventory();
			}
			else if( input2 == 4){
				i1.editItem();
			}
			break;
		case 2:
			System.out.println("1. add customer");
			System.out.println("2. delete customer");
			System.out.println("3. retrieve customer details");
			System.out.println("4. update customer details");
			int input1 = sc.nextInt();
			if(input1 ==1){
				c1.addCustomers();
			}
			else if(input1 == 2){
				c1.deleteCustomer();
			}
			else if(input1 == 3){
				c1.Retrieve();
			}
			else if( input1 == 4){
				c1.updateCustomer();
			}
			break;
		case 3:
			System.out.println("1. add bill");
			System.out.println("2. delete bill");
			System.out.println("3. retrieve bill");
			System.out.println("4. update bill");
			int input3 = sc.nextInt();
			if(input3 ==1){
				b1.createBill();
			}
			else if(input3 == 2){
				b1.delBill();
			}
			else if(input3 == 3){
				b1.getBilling();
			}
			else if( input3 == 4){
				b1.updateBill();
			}
		}


	}
	public static int intInput(){
		Scanner in = new Scanner(System.in);
		int x=0;
		do { 
			try{
				x=  in.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Invalid, try again: ");
				 in.next(); 
			}
		} while(x==0);
		return x;
	}

	public static Double doubleInput(){
		Scanner in = new Scanner(System.in);
		double x=0.00;
		do { 
			try{
				x=  in.nextDouble();
			} catch (InputMismatchException e) {
				System.out.print("Invalid, try again: ");
				 in.next(); 
			}
		} while(x==0.00);
		return x;
	}
	
}
