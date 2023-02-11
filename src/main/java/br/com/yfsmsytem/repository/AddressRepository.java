package br.com.yfsmsytem.repository;

import br.com.yfsmsytem.entity.Address;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.Optional;

@MongoRepository
public interface AddressRepository extends CrudRepository<Address, String> {

   Optional<Address> findByZipCode(String zipCode);
}
