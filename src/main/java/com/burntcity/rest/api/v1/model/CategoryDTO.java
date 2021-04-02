package com.burntcity.rest.api.v1.model;

import lombok.Data;

/**
 * We are going to expose CategoryDTO through our REST controller
 *
 */
@Data
public class CategoryDTO {
	
	private Long Id;
	private String name;
}
