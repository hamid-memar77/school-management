package ir.mapsa.sample.model;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class Student {

    private Long studentNumber;

    private FullName fullName;

    private Date birthDate;

    private List<Course> courseList;


    public Student(FullName fullName, Date birthDate, List<Course> courseList) {
        this.studentNumber = generateRandomStudentNumber();
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.courseList = courseList;
    }

    public Long generateRandomStudentNumber() {
        return new Random().nextLong();
    }

    public Long getStudentNumber() {
        return studentNumber;
    }


    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }


    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", fullName=" + fullName +
                ", birthDate=" + birthDate +
                '}';
    }
}
