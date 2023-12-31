package ru.netology.homeworkdiplom.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class FileDescriptionInResponse {
    private final String filename;
    private final int size;
}