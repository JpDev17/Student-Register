package dev.JpDev17.StudentRegister.controller;

import dev.JpDev17.StudentRegister.dto.StudentDTO;
import dev.JpDev17.StudentRegister.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student/ui")
public class StudentControllerUi {

    private StudentService studentService;

    public StudentControllerUi(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get")
    public String studentRequest(Model model) {
        List<StudentDTO> studentRequest = studentService.getAllStudents();
        model.addAttribute("students", studentRequest);
        return "studentRequest";
    }

    @GetMapping("/delete/{id}")
    public String studentDeleteById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
        return "redirect:/student/ui/get";
    }

    @GetMapping("/get/{id}")
    public String studentRequestById(@PathVariable Integer id, Model model) {
        StudentDTO studentRequestById = studentService.getStudentById(id);
        if (studentRequestById != null) {
            model.addAttribute("students", studentRequestById);
            return "studentRequestById";
        }
        else {
            model.addAttribute("message", "ID student not found!");
            return "studentRequest";
        }
    }

    @GetMapping("/create")
    public String studentCreateForm(Model model) {
        model.addAttribute("student", new StudentDTO());
        return "studentForm";
    }

    @PostMapping("/create")
    public String studentCreate(@ModelAttribute("student") StudentDTO student, Model model) {
        studentService.createStudent(student);
        return "redirect:/student/ui/get";
    }
}
