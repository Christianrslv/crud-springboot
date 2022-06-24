package com.example.simple.controller;

import com.example.simple.dto.UserModelViewDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping
  public ResponseEntity<UserModelViewDTO> getUser() {
    return ResponseEntity.ok(UserModelViewDTO.builder()
        .id(UUID.randomUUID())
        .name("Alterado")
        .email("fulanous@anonimous.com")
        .telephone("00999810293")
        .build());
  }
}
