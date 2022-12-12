package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.ICountryService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.country.AddCountryRequest;
import com.etiya.ecommercedemo4.business.dtos.response.country.AddCountryResponse;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.Country;
import com.etiya.ecommercedemo4.repository.ICountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CountryManager implements ICountryService {

    private ICountryRepository countryRepository;
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<List<Country>> getAll() {
        List<Country> response = this.countryRepository.findAll();
        return new SuccessDataResult<List<Country>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<Country> getById(int id) {
        Country response = this.countryRepository.findById(id).orElseThrow();
        return new SuccessDataResult<Country>(response, Messages.SuccessMessages.ListById);
    }

    @Override
    public DataResult<Country> getByName(String name) {
        Country response =  this.countryRepository.findByName(name);
        return new SuccessDataResult<Country>(response, Messages.SuccessMessages.ListByName);
    }

    @Override
    public DataResult<List<Country>> getAllCountriesOrdered() {
        List<Country> response = this.countryRepository.findAllCountriesOrderByName();
        return new SuccessDataResult<List<Country>>(response, Messages.SuccessMessages.Succeeded);
    }

    @Override
    public Result add(AddCountryRequest addCountryRequest) {

        Country country = this.modelMapperService.forRequest().map(addCountryRequest,Country.class);
        this.countryRepository.save(country);

        return new SuccessResult(Messages.SuccessMessages.Add);

    }
}
