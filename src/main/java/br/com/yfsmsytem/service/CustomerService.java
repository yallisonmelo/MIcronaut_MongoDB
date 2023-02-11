package br.com.yfsmsytem.service;

import br.com.yfsmsytem.records.CustomerRecord;

public interface CustomerService {


    CustomerRecord createNewCustomer(CustomerRecord newCustomerRecord);


    void deleteCustomerByMail(CustomerRecord customerRecord);
}
