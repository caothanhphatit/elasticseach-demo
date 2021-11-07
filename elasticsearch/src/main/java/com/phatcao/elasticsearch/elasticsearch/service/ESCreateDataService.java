package com.phatcao.elasticsearch.elasticsearch.service;

import com.phatcao.elasticsearch.elasticsearch.dto.indexing.ESProduct;

import java.util.List;


public interface ESCreateDataService
{
	/**
	 * create data in elasticsearch
	 * @param products
	 * @return
	 */
	boolean createData(List<ESProduct> products);
}
