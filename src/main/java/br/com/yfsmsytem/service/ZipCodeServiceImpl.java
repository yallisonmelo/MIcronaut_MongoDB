package br.com.yfsmsytem.service;

import br.com.yfsmsytem.client.ViaCepClient;
import br.com.yfsmsytem.records.ViaCepRecord;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class ZipCodeServiceImpl implements ZipCodeService  {

    private final ViaCepClient viaCepClient;
    @Override
    public ViaCepRecord getZipCodeBrazil(String zipCode) {
       return viaCepClient.getZipCodeBrazil(zipCode);
    }
}
