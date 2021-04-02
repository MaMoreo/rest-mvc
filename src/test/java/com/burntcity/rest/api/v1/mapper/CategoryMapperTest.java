package com.burntcity.rest.api.v1.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.burntcity.rest.api.v1.model.CategoryDTO;
import com.burntcity.rest.domain.Category;

class CategoryMapperTest {

	private static final long ID = 1L;
	private static final String NAME = "Joe";
	CategoryMapper cagetoryMapper = CategoryMapper.INSTANCE;
	
	@Test
	void testCategoryToCategoryDTO() {
		//given 
		Category category = new Category();
		category.setName(NAME);
		category.setId(ID);
		
		//when
		CategoryDTO categoryDTO = cagetoryMapper.categoryToCategoryDTO(category);
		
		//then
		assertEquals(Long.valueOf(1L),categoryDTO.getId());
		assertEquals(NAME, categoryDTO.getName());
	}
}
