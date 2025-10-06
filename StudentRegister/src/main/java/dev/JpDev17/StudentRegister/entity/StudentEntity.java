package dev.JpDev17.StudentRegister.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_student_register")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String studentName;

    @Column(name = "registration")
    private Integer studentRegistration;

    @Column(name = "major")
    private String studentMajor;

    @Column(name = "grade")
    private Float studentGrade;

    public StudentEntity() {
    }

    public StudentEntity(Integer id, String studentName, Integer studentRegistration, String studentMajor, Float studentGrade) {
        this.id = id;
        this.studentName = studentName;
        this.studentRegistration = studentRegistration;
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
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

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentRegistration=" + studentRegistration +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentGrade=" + studentGrade +
                '}';
    }
}
