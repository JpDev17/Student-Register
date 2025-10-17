package dev.JpDev17.StudentRegister.dto;

import dev.JpDev17.StudentRegister.entity.StudentGender;
import jakarta.persistence.Column;

public class StudentDTO {

    private Integer id;
    private String studentName;
    private Integer studentAge;
    private StudentGender studentGender;
    private String studentEmail;
    private Integer studentRegistration;
    private String studentMajor;
    private Float studentGrade;
    private String studentPhoto;

    public StudentDTO() {
    }

    public StudentDTO(Integer id, String studentName, Integer studentAge, StudentGender studentGender, String studentEmail, Integer studentRegistration, String studentMajor, Float studentGrade, String studentPhoto) {
        this.id = id;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentEmail = studentEmail;
        this.studentRegistration = studentRegistration;
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentPhoto = studentPhoto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public StudentGender getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(StudentGender studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Integer getStudentRegistration() {
        return studentRegistration;
    }

    public void setStudentRegistration(Integer studentRegistration) {
        this.studentRegistration = studentRegistration;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public Float getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(Float studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(String studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentGender=" + studentGender +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentRegistration=" + studentRegistration +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentGrade=" + studentGrade +
                ", studentPhoto='" + studentPhoto + '\'' +
                '}';
    }
}
