package com.phatcao.elasticsearch.b2b.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;


@Data
@NoArgsConstructor
@Entity
@Table(name = "category")
public class CategoryEntity extends CommonEntity
{

	private static final long serialVersionUID = 3911935095202667185L;

	@Id
	@Column(name = "category_id")
	private String categoryId;

	@Column(name = "parent_id")
	private Integer categoryParentId;

	@Column(name = "name")
	private String categoryName;

	@Column(name = "description")
	private String categoryDescription;

	@Column(name = "custom_url")
	private String customUrl;

	@Column(name = "default_product_sort")
	private String defaultProductSort;

	@Column(name = "is_visible")
	private Boolean isVisible;

	@Column(name = "page_title")
	private String pageTitle;

	@Column(name = "sort_order")
	private Integer sortOrder;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "catalog_uuid")
	private String catalogUuid;

	@Column(name = "slug")
	private String slug;

	@Column(name = "status")
	private String status;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updated_at")
	private Timestamp updatedAt;
}
