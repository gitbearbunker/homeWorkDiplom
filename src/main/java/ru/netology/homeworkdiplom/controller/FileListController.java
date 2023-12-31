package ru.netology.homeworkdiplom.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import ru.netology.homeworkdiplom.dto.FileDescriptionInResponse;
import ru.netology.homeworkdiplom.service.AuthorizationService;
import ru.netology.homeworkdiplom.service.FileService;

import javax.validation.constraints.*;
import java.util.List;

@RestController
@RequestMapping("/list")
@Validated
public class FileListController {
    private final FileService fileService;
    private final AuthorizationService authorizationService;

    public FileListController(FileService fileService, AuthorizationService authorizationService) {
        this.fileService = fileService;
        this.authorizationService = authorizationService;
    }

    @GetMapping
    public List<FileDescriptionInResponse> getFileList(@RequestHeader("auth-token")
                                                       @NotBlank String authToken, @Min(1) int limit) {
        authorizationService.checkToken(authToken);
        return fileService.getFileList(limit);
    }
}