package hospita_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class server {
	void searchDoc(String name) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swasthya","root","");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from doctor where fullName='"+name+"'");  
			while(rs.next())  
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
			System.out.println("Success");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	void searchPatient(String name) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_name","root","");
			Statement stmt=con.createStatement();
			ResultSet rs;
			if(name!=" ")
			    rs=stmt.executeQuery("select * from doctors where firstName='"+name+"'");  
			else {
				rs=stmt.executeQuery("select * from doctors");
			}
			while(rs.next())  
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
			System.out.println("Success");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	void searchResource(String name) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_name","root","");
			Statement stmt=con.createStatement();  
			ResultSet rs;
			if(name!=" ")
			    rs=stmt.executeQuery("select * from resources where name='"+name+"'");  
			else {
				rs=stmt.executeQuery("select * from resources");
			}  
			while(rs.next())  
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
			System.out.println("Success");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	void review(String name) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_name","root","");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from doctors where list='"+name+"' and checkout=NULL");  
			while(rs.next())  
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
			System.out.println("Success");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	void newPatient(String name,int aadhar_no,String in_date,String dat) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_name","root","");
			Statement stmt=con.createStatement();
			if(name==" "||aadhar_no=='\0'||in_date==" "||dat==" ") {
				infoBox("Please fill all the fields", "error!");
				return;
			}
			int rowsAffected=stmt.executeUpdate("insert into patients(aadhar_no,firstName,lastName,checkin) values('"+aadhar_no+"','"+name+"','','"+in_date+"')");  
			if(rowsAffected > 0) {
				   JOptionPane.showMessageDialog(null, "successfully added!");
				}
				else{
				    JOptionPane.showMessageDialog(null, "could not add", "notAdded", JOptionPane.ERROR_MESSAGE);
				}
			System.out.println("Success");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	void addDoctor(String name,String day,String start_time,String end_time) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_name","root","");
			Statement stmt=con.createStatement();
			if(name==" "||day==" "||start_time==" "||end_time==" ") {
				infoBox("Please fill all the fields", "error!");
				return;
			}
			int rowsAffected=stmt.executeUpdate("insert into timetable(name,day,start_time,end_time) values('"+name+"','"+day+"','"+start_time+"','"+end_time+"')");  
			if(rowsAffected > 0) {
				   JOptionPane.showMessageDialog(null, "successfully added!");
				}
				else{
				    JOptionPane.showMessageDialog(null, "could not add", "notAdded", JOptionPane.ERROR_MESSAGE);
				}
			System.out.println("Success");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	void addResource(String id,String name,String time) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_name","root","");
			Statement stmt=con.createStatement();  
			if(name==" "||id==" "||time==" ") {
				infoBox("Please fill all the fields", "error!");
				return;
			}
			int rowsAffected=stmt.executeUpdate("insert into resources(id,name,quant) values('"+id+"','"+name+"','"+time+"')");  
			if(rowsAffected > 0) {
				   JOptionPane.showMessageDialog(null, "successfully added!");
				}
				else{
				    JOptionPane.showMessageDialog(null, "could not add", "notAdded", JOptionPane.ERROR_MESSAGE);
				}
			System.out.println("Success");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	  public static void infoBox(String infoMessage, String titleBar)
	    {
	        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	    }
}

