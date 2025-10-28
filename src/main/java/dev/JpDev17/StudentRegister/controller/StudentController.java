package dev.JpDev17.StudentRegister.controller;

import dev.JpDev17.StudentRegister.dto.StudentDTO;
import dev.JpDev17.StudentRegister.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
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
    @Operation(summary = "Creates a new student registration", description = "Creates a new student record and stores it in the database.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Student successfully created",
            content = @Content(mediaType = "application/json",
            schema = @Schema(implementation = StudentDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request data")
    })
    public ResponseEntity<?> studentCreate(@Valid @RequestBody StudentDTO student) {
        StudentDTO studentCreated = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Student created: " + studentCreated.getStudentName() + " (ID): " + studentCreated.getId());
    }

    @GetMapping("/get")
    @Operation(summary = "Gets all students registrations", description = "Retrieves all student records from the database.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful request",
            content = @Content(mediaType = "application/json",
            schema = @Schema(implementation = StudentDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request data")
    })
    public ResponseEntity<List<?>> studentRequest() {
        List<StudentDTO> studentRequest = studentService.getAllStudents();
        return ResponseEntity.ok(studentRequest);
    }

    @GetMapping("/get/{id}")
    @Operation(summary = "Gets a student by ID", description = "Retrieves a single student record by ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful request",
            content = @Content(mediaType = "application/json",
            schema = @Schema(implementation = StudentDTO.class))),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public ResponseEntity<?> studentRequestById(
            @Parameter(description = "ID of the student to retrieve")
            @PathVariable Integer id) {
        StudentDTO studentRequestById = studentService.getStudentById(id);
        return ResponseEntity.ok(studentRequestById);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Updates a student record", description = "Updates an existing student record by ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Student successfully updated",
            content = @Content(mediaType = "application/json",
            schema = @Schema(implementation = StudentDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request data"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public ResponseEntity<?> studentUpdateById(
            @Parameter(description = "Id of the student to update")
            @PathVariable Integer id,
            @Valid @RequestBody StudentDTO student) {
        StudentDTO studentUpdateById = studentService.updateStudentById(id, student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete a student record", description = "Deletes a student record by ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Student successfully deleted"),
            @ApiResponse(responseCode = "400", description = "Invalid request data"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public ResponseEntity<?> studentDeleteById(
            @Parameter(description = "ID of the student to delete")
            @PathVariable Integer id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.ok("Student with ID " + id + " has been deleted successfully!");
    }
}
