package com.phatcao.elasticsearch.b2b.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity extends CommonEntity implements Serializable
{
	private static final long serialVersionUID = 7562705375026933819L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_code")
	private int productCode;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_price")
	private Double productPrice;

	@Column(name = "product_description")
	private String productDescription;

	@Column(name = "product_image")
	private String productImageUrl;

	@Column(name = "product_sku")
	private String sku;

	@Column(name = "product_categories")
	private String categories;

	@Column(name = "product_cost")
	private Double cost;

	@Column(name = "product_base_id")
	private String productBaseId;

	@Column(name = "product_type")
	private int productType;

	@Column(name = "product_period")
	private Integer productPeriod;

	@Column(name = "is_base_product")
	private boolean isBaseProduct;

	@Column(updatable = false, name = "product_discount")
	private Integer discount;

	@Column(updatable = false, name = "product_fixed_price")
	private Double fixedPrice;

	@Column(name = "product_variation_option_id")
	private String productVariationOptionId;

	@Column(name = "is_upgrade")
	private int isUpgrade;

	@Column(name = "product_uuid")
	private String productUuid;

	@Column(name = "slug")
	private String slug;

	@Column(name = "manager_stock")
	private boolean managerStock;
}
