package com.hcl.web.dao;

import com.hcl.web.model.Product;

public class ProductDAO {
	
	public Product getDetails(int id) {
		Product p = new Product();
		p.setId(1);
		p.setName("me");
		p.setDetails("test details");
		
		return p;
	}

}
