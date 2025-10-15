package dev.JpDev17.StudentRegister.repository;

import dev.JpDev17.StudentRegister.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
