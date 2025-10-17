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

    @Column(name = "age")
    private Integer studentAge;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private StudentGender studentGender;

    @Column(name = "email", unique = true)
    private String studentEmail;

    @Column(name = "registration", unique = true)
    private Integer studentRegistration;

    @Column(name = "major")
    private String studentMajor;

    @Column(name = "grade")
    private Float studentGrade;

    @Column(name = "photo")
    private String studentPhoto;

    public StudentEntity() {
    }

    public StudentEntity(Integer id, String studentName, Integer studentAge, StudentGender studentGender, String studentEmail, Integer studentRegistration, String studentMajor, Float studentGrade, String studentPhoto) {
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
        return "StudentEntity{" +
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

