package br.com.yfsmsytem.converters;

import br.com.yfsmsytem.entity.Customer;
import br.com.yfsmsytem.records.CustomerRecord;

public class CustomerConverter {


    public static Customer convertToEntity(CustomerRecord customerRecord) {
        return Customer.builder()
                .name(customerRecord.name())
                .mail(customerRecord.mail())
                .socialID(customerRecord.socialID())
                .idAddres(customerRecord.zipCode()).build();
    }
}
