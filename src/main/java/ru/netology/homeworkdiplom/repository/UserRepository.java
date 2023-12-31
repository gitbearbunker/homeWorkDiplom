package ru.netology.homeworkdiplom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.netology.homeworkdiplom.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
}