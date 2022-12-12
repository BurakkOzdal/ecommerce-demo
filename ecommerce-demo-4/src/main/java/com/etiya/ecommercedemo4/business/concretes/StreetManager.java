package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.IDistrictService;
import com.etiya.ecommercedemo4.business.abstracts.IStreetService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.street.AddStreetRequest;
import com.etiya.ecommercedemo4.business.dtos.response.street.AddStreetResponse;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.Street;
import com.etiya.ecommercedemo4.repository.IStreetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StreetManager implements IStreetService {

    private IStreetRepository streetRepository;
    private IDistrictService districtService;
    private ModelMapperService modelMapperService;



    @Override
    public DataResult<List<Street>> getAll() {
        List<Street> response = this.streetRepository.findAll();
        return new SuccessDataResult<List<Street>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public Result add(AddStreetRequest addStreetRequest) {


        Street street = this.modelMapperService.forRequest().map(addStreetRequest,Street.class);
        street.setId(0);
        this.streetRepository.save(street);


        return new SuccessResult(Messages.SuccessMessages.Add);

    }

    @Override
    public DataResult<Street> getById(int id) {
        Street response =this.streetRepository.findById(id).orElseThrow();
        return new SuccessDataResult<Street>(response,Messages.SuccessMessages.ListById);
    }
}
