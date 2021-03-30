package com.burntcity.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.burntcity.rest.domain.Category;

/**
 * JpaRepository implements Paging & Sorting
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
