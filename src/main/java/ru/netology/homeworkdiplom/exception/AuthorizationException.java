package ru.netology.homeworkdiplom.exception;

public class AuthorizationException extends RuntimeException {
    public AuthorizationException() {
        super("User is not authorized");
    }
}