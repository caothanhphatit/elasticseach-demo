package com.phatcao.elasticsearch.b2b.utils.converter.impl;

import com.phatcao.elasticsearch.b2b.dao.entity.CategoryEntity;
import com.phatcao.elasticsearch.b2b.dao.entity.CustomerEntity;
import com.phatcao.elasticsearch.b2b.dao.entity.ProductEntity;
import com.phatcao.elasticsearch.b2b.utils.converter.ESProductConverter;
import com.phatcao.elasticsearch.elasticsearch.dto.indexing.ESProduct;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ESProductConverterImpl implements ESProductConverter
{
	@Override
	public List<ESProduct> convertToESProduct(final List<ProductEntity> productEntities,
			final List<CategoryEntity> categoryEntities, final List<CustomerEntity> customerEntities)
	{
		return null;
	}
}
