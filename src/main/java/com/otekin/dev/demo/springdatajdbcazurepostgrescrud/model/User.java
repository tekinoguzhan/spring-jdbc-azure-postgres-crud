package com.otekin.dev.demo.springdatajdbcazurepostgrescrud.model;

public record User
        (Long id,
         String firstName,
         String lastName,
         String email) {
}
