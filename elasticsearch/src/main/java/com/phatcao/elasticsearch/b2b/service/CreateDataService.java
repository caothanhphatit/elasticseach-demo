package com.phatcao.elasticsearch.b2b.service;

import com.phatcao.elasticsearch.b2b.dto.response.ResponseData;


public interface CreateDataService
{
	/**
	 * collect data and convert data to ES data type
	 * @return ResponseData<Boolean>
	 */
	ResponseData createProductData();
}
