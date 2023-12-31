package ru.netology.homeworkdiplom.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "tokens")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokenEntity {
    @Id
    private String token;
}