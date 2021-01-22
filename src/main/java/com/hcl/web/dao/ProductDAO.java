package com.hcl.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.hcl.web.model.Product;

public class ProductDAO {
	
	public Product getDetails(int id) {
		
		Product p = new Product();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3302/products","root","root");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from product_details where id =" + id);
			if(rs.next()) {
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDetails(rs.getString("details"));
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		return p;
	}

}
