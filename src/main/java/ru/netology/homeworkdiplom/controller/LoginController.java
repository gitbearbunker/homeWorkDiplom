package ru.netology.homeworkdiplom.controller;

import org.springframework.web.bind.annotation.*;

import ru.netology.homeworkdiplom.dto.LoginInRequest;
import ru.netology.homeworkdiplom.dto.LoginInResponse;
import ru.netology.homeworkdiplom.service.AuthorizationService;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final AuthorizationService authorizationService;

    public LoginController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping
    public LoginInResponse login(@Valid @RequestBody LoginInRequest loginInRequest) {
        return authorizationService.login(loginInRequest);
    }
}