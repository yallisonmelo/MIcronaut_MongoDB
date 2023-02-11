package br.com.yfsmsytem.client;

import br.com.yfsmsytem.records.ViaCepRecord;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@Client
public interface ViaCepClient {

    @Get("https://viacep.com.br/ws/{zipcode}/json")
    ViaCepRecord getZipCodeBrazil(@PathVariable("zipcode") String zipcode);
}
