package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.ICategoryService;
import com.etiya.ecommercedemo4.business.abstracts.IProductCategoriesService;
import com.etiya.ecommercedemo4.business.abstracts.IProductService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.productCategories.AddProductCategoriesRequest;
import com.etiya.ecommercedemo4.business.dtos.response.productCategories.AddProductCategoriesResponse;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.ProductCategories;
import com.etiya.ecommercedemo4.repository.IProductCategoriesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductCategoriesManager implements IProductCategoriesService {
    private IProductCategoriesRepository productCategoriesRepository;
    private ICategoryService categoryService;
    private IProductService productService;
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<List<ProductCategories>> getAll() {
        List<ProductCategories> response = this.productCategoriesRepository.findAll();
        return new SuccessDataResult<List<ProductCategories>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<ProductCategories> getById(int id) {
        ProductCategories response = this.productCategoriesRepository.findById(id).orElseThrow();
        return new SuccessDataResult<ProductCategories>(response,Messages.SuccessMessages.ListById);
    }

    @Override
    public Result add(AddProductCategoriesRequest addProductCategoriesRequest) {

        ProductCategories productCategories = this.modelMapperService.forRequest().map(addProductCategoriesRequest,ProductCategories.class);
        productCategories.setId(0);
        this.productCategoriesRepository.save(productCategories);

        return new SuccessResult(Messages.SuccessMessages.Add);

    }
}
