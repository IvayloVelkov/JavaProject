package com.ivcho.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivcho.spring.dao.OfficeDAO;
import com.ivcho.spring.dao.ProductDAO;
import com.ivcho.spring.dao.ProductTypeDAO;
import com.ivcho.spring.model.Office;
import com.ivcho.spring.model.Product;
import com.ivcho.spring.model.ProductType;

@Service
public class MainService {
	@Autowired private ProductDAO productDAO;
	@Autowired private OfficeDAO officeDAO;
	@Autowired private ProductTypeDAO productTypeDAO;
	
    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }
    
    public List<Office> getAllOfficesByCompanyName(String name) {
        return officeDAO.findByCompanyName(name);
    }
    
    @Transactional
    public ProductType addProductType(String name) {
    	ProductType type = new ProductType();
    	type.setName(name);
        return productTypeDAO.saveOrUpdate(type);
    }
    
    @Transactional
    public void deleteProductType(short productId) {
        productTypeDAO.delete(productId);
    }
}
