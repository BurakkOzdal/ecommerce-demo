package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.business.dtos.response.category.GetCategoryByIdWithProductsResponse;
import com.etiya.ecommercedemo4.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {

    @Query("select new com.etiya.ecommercedemo4.business.dtos.response.category.GetCategoryByIdWithProductsResponse" +
            "(c.id, c.name, p.name) from Category c inner join " +
            "c.productCategories pc inner join pc.product p where c.id = :categoryId")
    List<GetCategoryByIdWithProductsResponse> getAllDto(int categoryId);

    boolean existsCategoryByNameIgnoreCase(String name);

}
