package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.IDistrictService;
import com.etiya.ecommercedemo4.business.abstracts.ITownService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.district.AddDistrictRequest;
import com.etiya.ecommercedemo4.business.dtos.response.district.AddDistrictResponse;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.District;
import com.etiya.ecommercedemo4.repository.IDistrictRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DistrictManager implements IDistrictService {

    private IDistrictRepository districtRepository;
    private ITownService townService;
    private ModelMapperService modelMapperService;



    @Override
    public DataResult<List<District>> getAll() {
        List<District> response = this.districtRepository.findAll();
        return new SuccessDataResult<List<District>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<District> getById(int id) {
        District response = this.districtRepository.findById(id).orElseThrow();
        return new SuccessDataResult<District>(response,Messages.SuccessMessages.ListById);
    }

    @Override
    public Result add(AddDistrictRequest addDistrictRequest) {

        District district = this.modelMapperService.forRequest().map(addDistrictRequest,District.class);

        district.setId(0);
        this.districtRepository.save(district);


        return new SuccessResult(Messages.SuccessMessages.Add);

    }
}
