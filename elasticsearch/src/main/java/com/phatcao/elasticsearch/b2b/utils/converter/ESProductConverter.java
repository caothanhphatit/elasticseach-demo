package com.phatcao.elasticsearch.b2b.utils.converter;

import com.phatcao.elasticsearch.b2b.dao.entity.CategoryEntity;
import com.phatcao.elasticsearch.b2b.dao.entity.CustomerEntity;
import com.phatcao.elasticsearch.b2b.dao.entity.ProductEntity;
import com.phatcao.elasticsearch.elasticsearch.dao.document.ESProductEntity;
import com.phatcao.elasticsearch.elasticsearch.dto.indexing.ESProduct;

import java.util.List;


public interface ESProductConverter
{
	/**
	 * convert to elasticsearch data for create
	 * @param productEntities
	 * @param categoryEntities
	 * @param customerEntities
	 * @return ESProductEntity
	 */
	List<ESProductEntity>  convertToESProduct (List<ProductEntity> productEntities, List<CategoryEntity>categoryEntities, List<CustomerEntity>customerEntities );
}
