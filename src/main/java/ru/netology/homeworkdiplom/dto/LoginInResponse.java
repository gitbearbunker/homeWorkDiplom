package ru.netology.homeworkdiplom.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class LoginInResponse {
    private String authToken;

    @JsonGetter("auth-token")
    public String getAuthToken() {
        return authToken;
    }
}