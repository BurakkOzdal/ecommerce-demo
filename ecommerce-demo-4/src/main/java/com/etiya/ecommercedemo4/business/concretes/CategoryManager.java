package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.ICategoryService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.category.AddCategoryRequest;
import com.etiya.ecommercedemo4.business.dtos.response.category.GetCategoryByIdWithProductsResponse;
import com.etiya.ecommercedemo4.core.util.excepotions.BusinessException;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.Category;
import com.etiya.ecommercedemo4.repository.ICategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoryManager implements ICategoryService {

    private ICategoryRepository categoryRepository;
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<List<Category>> getAll() {
        List<Category> response = this.categoryRepository.findAll();
        return new SuccessDataResult<List<Category>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<Category> getById(int id) {
        Category response = this.categoryRepository.findById(id).orElseThrow();
        return new SuccessDataResult<Category>(response, Messages.SuccessMessages.ListById);
    }

    @Override
    public Result add(AddCategoryRequest addCategoryRequest) {
        checkIfCategoryNameExists(addCategoryRequest.getName());
        Category category = this.modelMapperService.forRequest().map(addCategoryRequest, Category.class);
        this.categoryRepository.save(category);

        return new SuccessResult(Messages.SuccessMessages.Add);

    }


    @Override
    public DataResult<List<GetCategoryByIdWithProductsResponse>> getAllDto(int id) {
        List<GetCategoryByIdWithProductsResponse> response = this.categoryRepository.getAllDto(id);
        return new SuccessDataResult<List<GetCategoryByIdWithProductsResponse>>(response, Messages.SuccessMessages.ListAll);
    }

    private void checkIfCategoryNameExists(String name){
        boolean isExists = this.categoryRepository.existsCategoryByNameIgnoreCase(name);
        if(isExists){
            throw new BusinessException(Messages.Category.CategoryExists);
        }
    }
}
