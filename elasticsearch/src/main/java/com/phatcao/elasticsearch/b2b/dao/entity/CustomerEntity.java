package com.phatcao.elasticsearch.b2b.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "user")
public class CustomerEntity extends CommonEntity implements Serializable
{

	private static final long serialVersionUID = 1005722616789806528L;

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "company")
	private String company;

	@Column(name = "phone")
	private String phone;

	@Column(name = "is_admin")
	private boolean isAdmin;

	@Column(name = "is_default")
	private boolean isDefault;

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "category_ids")
	private String categoryIds;

	@Column(name = "is_enabled")
	private boolean isEnabled;

	@Column(name = "is_buyer")
	private boolean isBuyer;

	@Column(name = "group_id")
	private int customerGroupId;

	@Column(name = "list_price")
	private int listPrice;

	@Column(name = "notes")
	private String notes;

	@Column(name = "address_ids")
	private String addressIds;

	@Column(name = "group_name")
	private String groupName;

	@Column(name = "budget_id")
	private int budgetId;

	@Column(name = "order_weekly_remaining_budget")
	private double orderWeeklyRemainingBudget;

	@Column(name = "order_monthly_remaining_budget")
	private double orderMonthlyRemainingBudget;

	@Column(name = "order_quarterly_remaining_budget")
	private double orderQuarterlyRemainingBudget;

	@Column(name = "order_yearly_remaining_budget")
	private double orderYearlyRemainingBudget;

	@Column(name = "group_label_id")
	private int groupLabelId;

	@Column(name = "quote_weekly_remaining_budget")
	private double quoteWeeklyRemainingBudget;

	@Column(name = "quote_monthly_remaining_budget")
	private double quoteMonthlyRemainingBudget;

	@Column(name = "quote_quarterly_remaining_budget")
	private double quoteQuarterlyRemainingBudget;

	@Column(name = "quote_yearly_remaining_budget")
	private double quoteYearlyRemainingBudget;

	@Column(name = "quote_budget_id")
	private int quoteBudgetId;

	@Column(name = "default_payment", columnDefinition = "default 0")
	private int defaultPayment;

	@Column(name = "default_shipping_method", columnDefinition = "default 0")
	private int defaultShippingMethod;

	@Column(name = "external_sales_force_quote_id")
	private String salesforceQuoteId;
}
