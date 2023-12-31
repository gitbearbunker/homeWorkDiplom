package ru.netology.homeworkdiplom.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "files")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileEntity {
    @Id
    private String fileName;
    private byte[] fileContent;
}