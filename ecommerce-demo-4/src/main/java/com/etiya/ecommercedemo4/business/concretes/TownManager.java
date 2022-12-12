package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.ICityService;
import com.etiya.ecommercedemo4.business.abstracts.ITownService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.town.AddTownRequest;
import com.etiya.ecommercedemo4.business.dtos.response.town.AddTownResponse;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.Town;
import com.etiya.ecommercedemo4.repository.ITownRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TownManager implements ITownService {

    private ITownRepository townRepository;
    private ICityService cityService;
    private ModelMapperService modelMapperService;



    @Override
    public DataResult<List<Town>> getAll() {
        List<Town> response = this.townRepository.findAll();
        return new SuccessDataResult<List<Town>>(response , Messages.SuccessMessages.ListAll);
    }

    @Override
    public Result add(AddTownRequest addTownRequest) {

        /*
        TypeMap<AddTownRequest, Town> propertyMapper = this.modelMapperService.
                getMappingStandard().createTypeMap(AddTownRequest.class, Town.class);
        propertyMapper.addMappings(mapper -> mapper.skip(Town::setId));
         */

        Town town = this.modelMapperService.forRequest().map(addTownRequest,Town.class);

        town.setId(0);
        this.townRepository.save(town);

        return new SuccessResult(Messages.SuccessMessages.Add);

    }

    @Override
    public DataResult<Town> getById(int id) {
        Town response = this.townRepository.findById(id).orElseThrow();
        return new SuccessDataResult<Town>(response,Messages.SuccessMessages.ListById);
    }
}
