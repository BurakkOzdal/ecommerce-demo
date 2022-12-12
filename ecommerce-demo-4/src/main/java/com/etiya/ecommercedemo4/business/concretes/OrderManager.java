package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.IOrderService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.entities.concretes.Order;
import com.etiya.ecommercedemo4.repository.IOrderRepository;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderManager implements IOrderService {

    private IOrderRepository orderRepository;
    private ModelMapperService modelMapperService;

    //TODO : ADD
    @Override
    public DataResult<List<Order>> getAll() {
        List<Order> response = this.orderRepository.findAll();
        return new SuccessDataResult<List<Order>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<Order> getById(int id) {
        Order response = this.orderRepository.findById(id).orElseThrow();
        return new SuccessDataResult<Order>(response,Messages.SuccessMessages.ListById);
    }
}
