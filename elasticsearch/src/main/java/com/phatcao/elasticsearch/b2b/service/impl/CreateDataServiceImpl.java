package com.phatcao.elasticsearch.b2b.service.impl;

import com.phatcao.elasticsearch.b2b.dao.entity.CategoryEntity;
import com.phatcao.elasticsearch.b2b.dao.entity.CustomerEntity;
import com.phatcao.elasticsearch.b2b.dao.entity.ProductEntity;
import com.phatcao.elasticsearch.b2b.dao.repository.CategoryRepository;
import com.phatcao.elasticsearch.b2b.dao.repository.CustomerRepository;
import com.phatcao.elasticsearch.b2b.dao.repository.ProductRepository;
import com.phatcao.elasticsearch.b2b.dto.response.ResponseData;
import com.phatcao.elasticsearch.b2b.service.CreateDataService;
import com.phatcao.elasticsearch.b2b.utils.converter.ESProductConverter;
import com.phatcao.elasticsearch.elasticsearch.dao.document.ESProductEntity;
import com.phatcao.elasticsearch.elasticsearch.dto.indexing.ESProduct;
import com.phatcao.elasticsearch.elasticsearch.service.ESCreateDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CreateDataServiceImpl implements CreateDataService
{
	@Autowired
	ProductRepository productRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ESProductConverter esProductConverter;

	@Autowired
	ESCreateDataService createDataService;

	@Override
	public ResponseData createProductData()
	{
		ResponseData<List<ProductEntity>> responseData = new ResponseData<>();

		List<ProductEntity> productEntities = productRepository.findAllByIsDeleted(false);

		List<CustomerEntity> customerEntities = customerRepository.findAllByIsDeletedAndIsEnabled(false, true);

		List<CategoryEntity> categoryEntities = categoryRepository.findAllByIsDeleted(false);

		final List<ESProductEntity> products = esProductConverter.convertToESProduct(productEntities, categoryEntities, customerEntities);

//		boolean success = createDataService.createData(products);


//		responseData.setData(productEntityList);

		return responseData;

	}
}
