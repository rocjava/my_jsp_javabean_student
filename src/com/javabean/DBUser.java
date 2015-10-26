package com.javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

public class DBUser {

	private ServletContext application;
	
	public DBUser(ServletContext application){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(Exception e1){
			e1.printStackTrace();
		}
		this.application=application;
	}
	/**
	 * getStudents
	 * @return
	 */
	public List getStudents(){
		List list = new ArrayList();
		Student student = null;
		Connection con =null;
		try{
			String url="jdbc:mysql://127.0.0.1:3306/test";
			con = DriverManager.getConnection(url,"root","root");
			System.out.println("con="+con);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			int t=0;
			if(rs.next()){
				t++;
				student = new Student();
				student.setSsno(rs.getString("ssno"));
				student.setSsname(rs.getString("ssname"));
				student.setSssex(rs.getString("sssex"));
				student.setSsage(Integer.parseInt(rs.getString("ssage")));
				student.setSsmajor(rs.getString("ssmajor"));
				student.setSsfav(rs.getString("ssfav"));
				student.setSsaddress(rs.getString("ssaddress"));
				//Ìí¼Ó½ølist
				System.out.println("t="+t);
				list.add(student);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e1){
			e1.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
		
		return list;
	}
}
