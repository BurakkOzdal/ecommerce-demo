package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.ICustomerService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.entities.concretes.Customer;
import com.etiya.ecommercedemo4.repository.ICustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class CustomerManager implements ICustomerService {

    private ICustomerRepository customerRepository;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<Customer>> getAll() {
        List<Customer> response = this.customerRepository.findAll();
        return new SuccessDataResult<List<Customer>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<Customer> getById(int id) {
        Customer response = this.customerRepository.findById(id).orElseThrow();
        return new SuccessDataResult<Customer>(response,Messages.SuccessMessages.ListById);
    }

    @Override
    public DataResult<List<Customer>> getAllCustomersWithBirthDate(Date start, Date end) {
        List<Customer> response = this.customerRepository.findAllCustomersWithBirthDate(start,end);
        return new SuccessDataResult<List<Customer>>(response,Messages.SuccessMessages.Succeeded);
    }

    @Override
    public DataResult<List<Customer>> getAllCustomersLike(String customerNumber) {
        List<Customer> response = this.customerRepository.findAllCustomersLike(customerNumber);
        return new SuccessDataResult<List<Customer>>(response,Messages.SuccessMessages.Succeeded);
    }

    @Override
    public DataResult<Customer> getByCustomerNumber(String customerNumber) {
        Customer response = this.customerRepository.findByCustomerNumber(customerNumber);
        return new SuccessDataResult<Customer>(response,Messages.SuccessMessages.Succeeded);
    }



}
