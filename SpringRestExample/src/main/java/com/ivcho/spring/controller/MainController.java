package com.ivcho.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ivcho.spring.model.Office;
import com.ivcho.spring.model.Product;
import com.ivcho.spring.model.ProductType;
import com.ivcho.spring.service.MainService;

@RestController
public class MainController {
	private final MainService mainService;
	
	@Autowired
	public MainController(MainService mainService) {
        this.mainService = mainService;
    }
	
	@RequestMapping(value = URIConstants.GET_ALL_PROD, method = RequestMethod.GET)
	public @ResponseBody List<Product> getAllProducts() {
		return mainService.getAllProducts();
	}
	
	@RequestMapping(value = URIConstants.GET_OFF_BY_COM, method = RequestMethod.GET)
	public @ResponseBody List<Office> getAllOfficesByCompanyName(@PathVariable("name") String name) {
		return mainService.getAllOfficesByCompanyName(name);
	}
	
	@RequestMapping(value = URIConstants.ADD_PROD_TYPE, method = RequestMethod.POST)
	public @ResponseBody ProductType createProduct(@PathVariable("name") String name) {
		return mainService.addProductType(name);
	}
	
	@RequestMapping(value = URIConstants.DELETE_PROD_TYPE, method = RequestMethod.DELETE)
	public @ResponseBody void deleteProduct(@PathVariable("id") short productId) {
		mainService.deleteProductType(productId);
	}
	
}
