package br.com.yfsmsytem.records;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record CustomerRecord(String name, String mail, String socialID, String zipCode) {
}
