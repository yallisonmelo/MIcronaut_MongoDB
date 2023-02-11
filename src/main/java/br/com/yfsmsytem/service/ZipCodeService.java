package br.com.yfsmsytem.service;

import br.com.yfsmsytem.records.ViaCepRecord;

public interface ZipCodeService {

    ViaCepRecord getZipCodeBrazil(String zipCode);
}
