package com.org.net;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="root123";
		String sql="select id,name,mode,amount from users";
		
        Connection connection = DriverManager.getConnection(url, user, password);
        
        Statement statement=connection.createStatement();
        
        ResultSet rs=statement.executeQuery(sql);
        
        while(rs.next()) {
        	
        	Emp emp=new Emp();
        	emp.setId(rs.getInt("id"));
        	emp.setName(rs.getString("name"));
        	emp.setMode(rs.getString("mode"));
        	emp.setAmount(rs.getInt("amount"));
        	
        	System.out.println(emp);
        }
	}

}
