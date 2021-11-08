package com.phatcao.elasticsearch.elasticsearch.configuration;

import com.phatcao.elasticsearch.elasticsearch.dao.document.ESProductEntity;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

@Configuration
public class RestClientConfig extends AbstractElasticsearchConfiguration

{
	@Override
	public RestHighLevelClient elasticsearchClient()
	{
		return null;
	}
}
