package com.phatcao.elasticsearch.b2b.controller;

import com.phatcao.elasticsearch.b2b.dto.response.ResponseData;
import com.phatcao.elasticsearch.b2b.service.CreateDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CreateData
{

	@Autowired
	CreateDataService createDataService;

	@GetMapping(value="/products")
	public ResponseData getProduct()
	{
		return createDataService.createProductData();
	}
}
