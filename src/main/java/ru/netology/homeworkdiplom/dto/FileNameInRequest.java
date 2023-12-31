package ru.netology.homeworkdiplom.dto;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class FileNameInRequest {
    @NotBlank
    private String filename;
}