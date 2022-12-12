package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.IProductSuppliersService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.productSuppliers.AddProductSuppliersRequest;
import com.etiya.ecommercedemo4.business.dtos.response.productSuppliers.AddProductSuppliersResponse;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.ProductSuppliers;
import com.etiya.ecommercedemo4.repository.IProductSuppliersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductSuppliersManager implements IProductSuppliersService {

    private IProductSuppliersRepository productSuppliersRepository;
    private ModelMapperService modelMapperService;



    @Override
    public DataResult<List<ProductSuppliers>> getAll() {
        List<ProductSuppliers> response = this.productSuppliersRepository.findAll();

        return new SuccessDataResult<List<ProductSuppliers>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public Result add(AddProductSuppliersRequest addProductSuppliersRequest) {

        ProductSuppliers productSuppliers = this.modelMapperService.forRequest().map(addProductSuppliersRequest,ProductSuppliers.class);
        productSuppliers.setId(0);

        this.productSuppliersRepository.save(productSuppliers);
        return new SuccessResult(Messages.SuccessMessages.Add);

    }
}
