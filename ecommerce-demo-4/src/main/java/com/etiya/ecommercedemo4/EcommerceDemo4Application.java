package com.etiya.ecommercedemo4;

import com.etiya.ecommercedemo4.core.util.excepotions.BusinessException;
import com.etiya.ecommercedemo4.core.util.results.ErrorDataResult;
import com.etiya.ecommercedemo4.core.util.results.ErrorResult;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@SpringBootApplication
@RestControllerAdvice
public class EcommerceDemo4Application {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceDemo4Application.class, args);
	}

	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}


	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exception){

		Map<String,String> errors=new HashMap<>();

		for(FieldError fieldError:exception.getBindingResult().getFieldErrors()){
			errors.put(fieldError.getField(),fieldError.getDefaultMessage());
		}

		return new ErrorDataResult<Object>(errors,"VALIDATION_EXCEPTION");
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleBusinessException(BusinessException exception){
		return new ErrorDataResult<Object>(exception.getMessage(),"BUSINNESS_EXCEPTION");
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorDataResult<Object> handleNoSuchElementException(NoSuchElementException exception){
		return new ErrorDataResult<>(exception.getMessage(),"NO_SUCH_ELEMENT_EXCEPTION");
	}

}
