package com.phatcao.elasticsearch.b2b.dao.repository;

import com.phatcao.elasticsearch.b2b.dao.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, String>
{
	List<CategoryEntity> findAllByIsDeleted(boolean isDeleted);
}
