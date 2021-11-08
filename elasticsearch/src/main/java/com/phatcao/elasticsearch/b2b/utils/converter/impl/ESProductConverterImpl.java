package com.phatcao.elasticsearch.b2b.utils.converter.impl;

import com.phatcao.elasticsearch.b2b.dao.entity.CategoryEntity;
import com.phatcao.elasticsearch.b2b.dao.entity.CustomerEntity;
import com.phatcao.elasticsearch.b2b.dao.entity.ProductEntity;
import com.phatcao.elasticsearch.b2b.utils.converter.ESProductConverter;
import com.phatcao.elasticsearch.elasticsearch.dao.document.ESProductEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ESProductConverterImpl implements ESProductConverter
{
	@Override
	public List<ESProductEntity> convertToESProduct(final List<ProductEntity> productEntities,
			final List<CategoryEntity> categoryEntities, final List<CustomerEntity> customerEntities)
	{
		List<ESProductEntity> result = new ArrayList<>();

		productEntities.forEach(productEntity -> {

			ESProductEntity esProductEntity = convertToESProduct(productEntity);

			categoryEntities.forEach(categoryEntity -> {




			});





		});

		return result;
	}


	ESProductEntity convertToESProduct(ProductEntity productEntity){

			ESProductEntity esProductEntity = new ESProductEntity();

			esProductEntity.setProductUuid(productEntity.getProductUuid());
			esProductEntity.setDiscount (productEntity.getDiscount());
			esProductEntity.setProductName(productEntity.getProductName());
			esProductEntity.setProductPrice(productEntity.getProductPrice());
			esProductEntity.setProductDescription(productEntity.getProductDescription());
			esProductEntity.setProductImage(productEntity.getProductImageUrl());
			esProductEntity.setProductSKU(productEntity.getSku());
			esProductEntity.setBaseProduct(productEntity.isBaseProduct());
			esProductEntity.setBaseProductId(productEntity.getProductBaseId());
			esProductEntity.setProductType(productEntity.getProductType());
			esProductEntity.setBaseProductId(productEntity.getProductBaseId());

			return esProductEntity;

	}

}
