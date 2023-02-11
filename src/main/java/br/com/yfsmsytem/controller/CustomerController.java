package br.com.yfsmsytem.controller;

import br.com.yfsmsytem.records.CustomerRecord;
import br.com.yfsmsytem.service.CustomerService;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;
import lombok.RequiredArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Controller("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private  final CustomerService customerService;

    @Post
    @Status(HttpStatus.CREATED)
    public CustomerRecord saveNewCustomer(@NotNull @Valid CustomerRecord newCustomerRecord){
       return customerService.createNewCustomer(newCustomerRecord);
    }
}