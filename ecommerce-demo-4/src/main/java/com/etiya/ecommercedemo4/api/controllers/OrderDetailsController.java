package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.IOrderDetailService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.entities.concretes.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix +"orderDetails")
public class OrderDetailsController {

    private IOrderDetailService orderDetailService;

    @Autowired
    public OrderDetailsController(IOrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }

    @GetMapping("/getAll")
    public DataResult<List<OrderDetail>> getAll(){
        return this.orderDetailService.getAll();
    }

    @GetMapping("{id}")
    public DataResult<OrderDetail> getById(@PathVariable int id){
        return this.orderDetailService.getById(id);
    }

}
