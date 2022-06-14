package com.example.simple.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Builder
public class UserModelViewDTO implements Serializable {
    private UUID id;
    private String name;
    private String email;
    private String telephone;
}
