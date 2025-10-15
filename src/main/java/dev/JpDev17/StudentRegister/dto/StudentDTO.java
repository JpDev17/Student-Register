package dev.JpDev17.StudentRegister.dto;

public class StudentDTO {

    private Integer id;
    private String studentName;
    private Integer studentRegistration;
    private String studentMajor;
    private Float studentGrade;

    public StudentDTO() {
    }

    public StudentDTO(Integer id, String studentName, Integer studentRegistration, String studentMajor, Float studentGrade) {
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
        return "StudentDTO{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentRegistration=" + studentRegistration +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentGrade=" + studentGrade +
                '}';
    }
}
