package com.codeWithProjects.ecom.services.admin.category;

import com.codeWithProjects.ecom.dto.CategoryDto;
import com.codeWithProjects.ecom.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createcategory(CategoryDto categoryDto);

    List<Category> getAllCategories();
}
