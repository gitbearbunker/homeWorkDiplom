package ru.netology.homeworkdiplom.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import ru.netology.homeworkdiplom.service.AuthorizationService;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/logout")
@Validated
public class LogoutController {
    private final AuthorizationService authorizationService;

    public LogoutController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping
    public void logout(@RequestHeader("auth-token") @NotBlank String authToken) {
        authorizationService.logout(authToken);
    }
}