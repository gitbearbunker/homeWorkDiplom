package ru.netology.homeworkdiplom.dto;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class LoginInRequest {
    @NotBlank
    private String login;
    @NotBlank
    private String password;
}