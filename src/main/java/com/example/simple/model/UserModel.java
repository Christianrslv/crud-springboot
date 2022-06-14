package com.example.simple.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class UserModel {
    private UUID id;
    private String name;
    private String email;
    private String telephone;
}
