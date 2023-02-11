package br.com.yfsmsytem.converters;

import br.com.yfsmsytem.entity.Address;
import br.com.yfsmsytem.records.ViaCepRecord;

public class AddressConverter {

    public  static Address convertZipCodeToAddress(ViaCepRecord viaCepRecord){
         return  Address.builder()
                 .zipCode(viaCepRecord.cep().replace("-",""))
                 .city(viaCepRecord.localidade())
                 .state(viaCepRecord.uf())
                 .district(viaCepRecord.bairro())
                 .street(viaCepRecord.logradouro())
                 .additionalInfo(viaCepRecord.complemento())
                 .build();
    }
}
