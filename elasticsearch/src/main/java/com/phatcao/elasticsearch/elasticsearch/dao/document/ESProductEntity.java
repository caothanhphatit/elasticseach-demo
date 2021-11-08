package com.phatcao.elasticsearch.elasticsearch.dao.document;

import com.sun.source.doctree.SerialDataTree;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.hibernate.annotations.Filter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Document(indexName = "product")
public class ESProductEntity implements Serializable
{
	private static final long serialVersionUID = 3891037331246168122L;

	@Id
	@Field(name ="product_uuid")
	private String productUuid;

	@Field(name = "product_name")
	private String productName;

	@Field(name = "product_description")
	private String productDescription;

	@Field(name = "product_image")
	private String productImage;

	@Field(name = "product_sku")
	private String productSKU;

	@Field(name = "product_price")
	private double productPrice;

	@Field(name = "product_type")
	private int productType;

	@Field(name = "category_name")
	private String categoryName;

	@Field(name = "category_id")
	private String categoryId;

	@Field(name = "price_list_id")
	private int priceListId;

	@Field(name = "min_price")
	private double minPrice;

	@Field(name = "max_price")
	private double maxPrice;

	@Field(name = "price_value")
	private double priceValue;

	@Field(name = "suggest_name")
	private String suggestName;

	@Field (name = "discount")
	private double discount;

	@Field (name = "is_base_product")
	private boolean isBaseProduct;

	@Field (name = "base_product_id")
	private String baseProductId;

	@Field (name = "acls")
	private int acls;

}

