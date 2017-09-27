package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class TestJDBC {

	public static void main(String[] args) {
		Statement statement = null;
		Connection con = null;
		// TODO Auto-generated method stub
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SCOTT","tiger");
			System.out.println("Connection Established successfully");
			statement = con.createStatement();
			one(statement);
		} catch (SQLException e) {
			System.out.println("Connection could not be established ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void one(Statement statement) throws SQLException{
		String sql = "SELECT EMPNO, ENAME from emp";
		ResultSet rs = statement.executeQuery(sql);
		 while(rs.next()){
	         int empno  = rs.getInt("EMPNO");
	         System.out.println("1");
	         String ename = rs.getString("ENAME");
	         System.out.println("2");
	         System.out.print("ID: " + empno);
	         System.out.println(", Age: " + ename);
	      }
		 
	      rs.close();
	}

	public static void two(Statement statement) throws SQLException{
		String sql = "SELECT ename, job, sal, comm from emp where sal > 1000 and sal < 2000";
		ResultSet rs = statement.executeQuery(sql);
		 while(rs.next()){
	        
	         String ename = rs.getString("ename");
	         String job = rs.getString("job");
	         int sal  = rs.getInt("sal");
	         int com = rs.getInt("comm");
	         System.out.print("ename: " + ename);
	         System.out.println(", job: " + job);
	         System.out.println(", salary: " + sal);
	         System.out.println(", comm: " + com);
	         
	      }
		 
	      rs.close();
	}
	public static void three(Statement statement) throws SQLException{
		String sql = "INSERT INTO emp "+ "VALUES ( ";
		ResultSet rs = statement.executeQuery(sql);
		
		
		 while(rs.next()){
	        
	         String ename = rs.getString("ename");
	         String job = rs.getString("job");
	         int sal  = rs.getInt("sal");
	         int com = rs.getInt("comm");
	         System.out.print("ename: " + ename);
	         System.out.println(", job: " + job);
	         System.out.println(", salary: " + sal);
	         System.out.println(", comm: " + com);
	         
	      }
		 
	      rs.close();
	}
}