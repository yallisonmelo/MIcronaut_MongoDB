package br.com.yfsmsytem.entity;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@MappedEntity
@Builder
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue
    private String identity;

    private String zipCode;
    @Nullable
    private String street;
    @Nullable
    private String additionalInfo;
    @Nullable
    private String district;
    private String city;
    private String state;
}
