package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.IOrderDetailService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.entities.concretes.OrderDetail;
import com.etiya.ecommercedemo4.repository.IOrderDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderDetailManager implements IOrderDetailService {

    private IOrderDetailRepository orderDetailRepository;
    private ModelMapperService modelMapperService;


    //TODO : ADD
    @Override
    public DataResult<List<OrderDetail>> getAll() {
        List<OrderDetail> response = this.orderDetailRepository.findAll();
        return new SuccessDataResult<List<OrderDetail>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<OrderDetail> getById(int id) {
        OrderDetail response = this.orderDetailRepository.findById(id).orElseThrow();
        return new SuccessDataResult<OrderDetail>(response,Messages.SuccessMessages.ListById);
    }
}
