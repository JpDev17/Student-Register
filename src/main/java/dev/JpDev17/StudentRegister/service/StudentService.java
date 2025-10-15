package dev.JpDev17.StudentRegister.service;

import dev.JpDev17.StudentRegister.dto.StudentDTO;
import dev.JpDev17.StudentRegister.entity.StudentEntity;
import dev.JpDev17.StudentRegister.mapper.StudentMapper;
import dev.JpDev17.StudentRegister.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public StudentDTO createStudent(StudentDTO studentDTO) {
        StudentEntity studentCreated = studentMapper.map(studentDTO);
        studentCreated = studentRepository.save(studentCreated);
        return studentMapper.map(studentCreated);
    }

    public List<StudentDTO> getAllStudents() {
        List<StudentEntity> studentRequest = studentRepository.findAll();
        return studentRequest.stream()
                .map(studentMapper::map)
                .collect(Collectors.toList());
    }

    public StudentDTO getStudentById(Integer id) {
        Optional<StudentEntity> studentRequestById = studentRepository.findById(id);
        return studentRequestById.map(studentMapper::map)
                .orElseThrow(() -> new EntityNotFoundException("Student not found with id: " + id));
    }

    public StudentDTO updateStudentById(Integer id, StudentDTO studentDTO) {
        StudentEntity student = studentMapper.map(studentDTO);
        studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student not found with id: " + id));
        student.setId(id);
        student = studentRepository.save(student);
        return studentMapper.map(student);
        }

        public void deleteStudentById(Integer id) {
        if (!studentRepository.existsById(id)) {
            throw new EntityNotFoundException("Student not found with id: " + id);
        }
        studentRepository.deleteById(id);
    }
}
