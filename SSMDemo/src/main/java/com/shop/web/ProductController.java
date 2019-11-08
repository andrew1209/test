package com.shop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.domain.Product;
import com.shop.service.ProductService;

@Controller
public class ProductController{
	@Autowired
	private ProductService productservice;
	@RequestMapping(value="/product")
    public ModelAndView getList()
    {
	
        List<Product> list = productservice.getProductList();	
    
    	ModelAndView  mv = new ModelAndView();
    	mv.setViewName("productList");  // 閫昏緫瑙嗗浘(鍋囩殑)    鐗╃悊瑙嗗浘  锛�/WEB-INF/productList.jsp锛�
    
    	// addObject(String key,Object Value)  =>璇ョ敤娉曞拰request鐢ㄦ埛涓�鏍�
    	
    	mv.addObject("productList", list);
    	
    	return mv;
    

      //++
      
    }
}
