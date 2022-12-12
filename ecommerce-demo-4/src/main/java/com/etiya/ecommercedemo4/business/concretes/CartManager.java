package com.etiya.ecommercedemo4.business.concretes;

import com.etiya.ecommercedemo4.business.abstracts.ICartService;
import com.etiya.ecommercedemo4.business.constants.Messages;
import com.etiya.ecommercedemo4.business.dtos.request.cart.AddCartRequest;
import com.etiya.ecommercedemo4.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemo4.core.util.results.SuccessResult;
import com.etiya.ecommercedemo4.entities.concretes.Cart;
import com.etiya.ecommercedemo4.repository.ICartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CartManager implements ICartService {

    private ICartRepository cartRepository;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<Cart>> getAll() {
        List<Cart> response = this.cartRepository.findAll();
        return new SuccessDataResult<List<Cart>>(response, Messages.SuccessMessages.ListAll);
    }

    @Override
    public DataResult<Cart> getById(int id) {
        Cart response = this.cartRepository.findById(id).orElseThrow();
        return new SuccessDataResult<Cart>(response, Messages.SuccessMessages.ListById);
    }

    @Override
    public Result add(AddCartRequest addCartRequest) {
        Cart cart = this.modelMapperService.forRequest().map(addCartRequest,Cart.class);
        this.cartRepository.save(cart);
        return new SuccessResult(Messages.SuccessMessages.Add);
    }
}
