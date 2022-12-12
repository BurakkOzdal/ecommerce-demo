package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.ISupplierService;
import com.etiya.ecommercedemo4.business.abstracts.IUserService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.supplier.AddSupplierRequest;
import com.etiya.ecommercedemo4.business.dtos.response.supplier.AddSupplierResponse;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.Supplier;
import com.etiya.ecommercedemo4.repository.ISupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SupplierManager implements ISupplierService {

    private ISupplierRepository supplierRepository;
    private ModelMapperService modelMapperService;
    private IUserService userService;



    @Override
    public DataResult<List<Supplier>> getAll() {
        List<Supplier> response = this.supplierRepository.findAll();
        return new SuccessDataResult<List<Supplier>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public Result add(AddSupplierRequest addSupplierRequest) {
        Supplier supplier = this.modelMapperService.forRequest().map(addSupplierRequest,Supplier.class);
        supplier.setId(0);

        this.supplierRepository.save(supplier);

        return new SuccessResult(Messages.SuccessMessages.Add);
    }
}
