package com.nakeer.productservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nakeer.productservice.dto.ProductRequest;
import com.nakeer.productservice.dto.ProductResponse;
import com.nakeer.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
		
		private final ProductService productService;
		
		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public void  createProduct(@RequestBody ProductRequest request) {
			productService.createProduct(request);
		}
		
		@GetMapping
		@ResponseStatus(HttpStatus.OK)
		public List<ProductResponse> getAllProducts() {
			return productService.getAllProducts();
		}
	
}
