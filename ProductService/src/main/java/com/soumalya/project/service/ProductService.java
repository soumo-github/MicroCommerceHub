package com.soumalya.project.service;

import com.soumalya.project.model.ProductRequest;
import com.soumalya.project.model.ProductResponse;

public interface ProductService {

	 long addProduct(ProductRequest productRequest);

	 ProductResponse getProductById(long productId);

     void reduceQuantity(long productId, long quantity);

}
