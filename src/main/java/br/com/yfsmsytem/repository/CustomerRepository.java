package br.com.yfsmsytem.repository;

import br.com.yfsmsytem.entity.Customer;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.Optional;

@MongoRepository
public interface CustomerRepository extends CrudRepository<Customer, String> {

    Optional<Customer> findByMail(String mail);
}
