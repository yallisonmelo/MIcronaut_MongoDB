package br.com.yfsmsytem.service;

import br.com.yfsmsytem.entity.Address;

import java.util.Optional;

public interface AddressService {

    Address saveAddress(String zipCode);

    Optional<Address> getAddresByZipCode(String zipCode);

}
