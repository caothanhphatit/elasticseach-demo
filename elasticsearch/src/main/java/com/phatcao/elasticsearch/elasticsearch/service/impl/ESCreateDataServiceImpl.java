package com.phatcao.elasticsearch.elasticsearch.service.impl;

import com.phatcao.elasticsearch.elasticsearch.dto.indexing.ESProduct;
import com.phatcao.elasticsearch.elasticsearch.service.ESCreateDataService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ESCreateDataServiceImpl implements ESCreateDataService
{
	@Override
	public boolean createData(final List<ESProduct> products)
	{
		return false;
	}
}
