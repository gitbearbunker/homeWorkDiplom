package ru.netology.homeworkdiplom.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class ErrorInResponse {
    private final String message;
    private final int id;
}