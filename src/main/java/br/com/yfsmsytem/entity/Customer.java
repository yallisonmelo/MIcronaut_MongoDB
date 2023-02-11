package br.com.yfsmsytem.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@MappedEntity
@Builder
@Getter
public class Customer {
    @Id
    @GeneratedValue
    private String identity;

    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String mail;
    @NotNull
    @NotBlank
    private String socialID;

    @NotNull
    @NotBlank
    @Setter
    private String idAddres;

}
