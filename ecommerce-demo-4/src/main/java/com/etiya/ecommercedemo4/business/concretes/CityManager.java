package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.ICityService;
import com.etiya.ecommercedemo4.business.abstracts.ICountryService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.city.AddCityRequest;
import com.etiya.ecommercedemo4.business.dtos.response.city.GetAllCitiesResponse;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.City;
import com.etiya.ecommercedemo4.repository.ICityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CityManager implements ICityService {

    private ICityRepository cityRepository;
    private ICountryService countryService;
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<List<City>> getAll() {
        List<City> response = this.cityRepository.findAll();
        return new SuccessDataResult<List<City>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<City> getById(int id) {
        City response = this.cityRepository.findById(id).orElseThrow();
        return new SuccessDataResult<City>(response, Messages.SuccessMessages.ListById);
    }

    @Override
    public Result add(AddCityRequest addCityRequest) {

        City city = this.modelMapperService.forRequest().map(addCityRequest,City.class);

        city.setId(0);
        this.cityRepository.save(city);

        return new SuccessResult(Messages.SuccessMessages.Add);


    }

    @Override
    public DataResult<List<GetAllCitiesResponse>> getAllResponsePattern() {
        List<City> cities = this.cityRepository.findAll();
        List<GetAllCitiesResponse> responseList = new ArrayList<>();

        for(City city:cities){
            GetAllCitiesResponse response = new GetAllCitiesResponse();
            response.setName(city.getName());
            response.setId(city.getId());
            response.setCountryName(city.getCountry().getName());
            responseList.add(response);
        }

        return new SuccessDataResult<List<GetAllCitiesResponse>>(responseList, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<List<GetAllCitiesResponse>> getAllDto() {
        List<GetAllCitiesResponse> response = this.cityRepository.getAllDto();
        return new SuccessDataResult<List<GetAllCitiesResponse>>(response,Messages.SuccessMessages.Succeeded);
    }
}
