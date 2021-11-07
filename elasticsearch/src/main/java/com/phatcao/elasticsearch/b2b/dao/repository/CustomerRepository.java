package com.phatcao.elasticsearch.b2b.dao.repository;

import com.phatcao.elasticsearch.b2b.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer>
{
	 List<CustomerEntity> findAllByIsDeletedAndIsEnabled(boolean isDeleted, boolean isEnable);
}
