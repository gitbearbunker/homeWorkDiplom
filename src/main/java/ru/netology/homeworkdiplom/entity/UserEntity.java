package ru.netology.homeworkdiplom.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    private String login;
    private String password;
}