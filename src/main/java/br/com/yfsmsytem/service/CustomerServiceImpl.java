package br.com.yfsmsytem.service;

import br.com.yfsmsytem.converters.CustomerConverter;
import br.com.yfsmsytem.records.CustomerRecord;
import br.com.yfsmsytem.repository.CustomerRepository;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final AddressService addressService;

    @Override
    public CustomerRecord createNewCustomer(CustomerRecord newCustomerRecord) {
        var cutomerForSave = CustomerConverter.convertToEntity(newCustomerRecord);
        var address = addressService.saveAddress(newCustomerRecord.zipCode());
        cutomerForSave.setIdAddres(address.getIdentity());
        customerRepository.save(cutomerForSave);
        return null;
    }

    @Override
    public void deleteCustomerByMail(CustomerRecord customerRecord) {
        var customerSelected = customerRepository.findByMail(customerRecord.mail());
        customerSelected.ifPresent(value -> customerRepository.deleteById(value.getIdentity()));
    }


}
