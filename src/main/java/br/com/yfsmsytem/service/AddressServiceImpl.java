package br.com.yfsmsytem.service;

import br.com.yfsmsytem.converters.AddressConverter;
import br.com.yfsmsytem.entity.Address;
import br.com.yfsmsytem.repository.AddressRepository;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Singleton
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final ZipCodeService zipCodeService;
    private final AddressRepository addressRepository;

    public Address saveAddress(String zipCode) {
        var zipCodeDb = this.getAddresByZipCode(zipCode);
        return zipCodeDb.orElseGet(() -> addressRepository.save(
                AddressConverter
                        .convertZipCodeToAddress(zipCodeService
                                .getZipCodeBrazil(zipCode))));

    }

    @Override
    public Optional<Address> getAddresByZipCode(String zipCode) {
        return addressRepository.findByZipCode(zipCode);
    }

}
