package dev.JpDev17.StudentRegister.mapper;

import dev.JpDev17.StudentRegister.dto.StudentDTO;
import dev.JpDev17.StudentRegister.entity.StudentEntity;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentEntity map(StudentDTO studentDTO) {

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDTO.getId());
        studentEntity.setStudentName(studentDTO.getStudentName());
        studentEntity.setStudentRegistration(studentDTO.getStudentRegistration());
        studentEntity.setStudentMajor(studentDTO.getStudentMajor());
        studentEntity.setStudentGrade(studentDTO.getStudentGrade());

        return studentEntity;
    }

    public StudentDTO map(StudentEntity studentEntity) {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(studentEntity.getId());
        studentDTO.setStudentName(studentEntity.getStudentName());
        studentDTO.setStudentRegistration(studentEntity.getStudentRegistration());
        studentDTO.setStudentMajor(studentEntity.getStudentMajor());
        studentDTO.setStudentGrade(studentEntity.getStudentGrade());

        return studentDTO;
    }
}
