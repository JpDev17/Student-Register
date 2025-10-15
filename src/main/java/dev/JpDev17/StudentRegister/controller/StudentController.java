package dev.JpDev17.StudentRegister.controller;

import dev.JpDev17.StudentRegister.dto.StudentDTO;
import dev.JpDev17.StudentRegister.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> studentCreate(@RequestBody StudentDTO student) {
        StudentDTO studentCreated = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Student created: " + studentCreated.getStudentName() + " (ID): " + studentCreated.getId());
    }

    @GetMapping("/get")
    public ResponseEntity<List<?>> studentRequest() {
        List<StudentDTO> studentRequest = studentService.getAllStudents();
        return ResponseEntity.ok(studentRequest);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> studentRequestById(@PathVariable Integer id) {
        StudentDTO studentRequestById = studentService.getStudentById(id);
        return ResponseEntity.ok(studentRequestById);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> studentUpdateById(@PathVariable Integer id, @RequestBody StudentDTO student) {
        StudentDTO studentUpdateById = studentService.updateStudentById(id, student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> studentDeleteById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.ok("Student with ID " + id + " has been deleted successfully!");
    }
}
