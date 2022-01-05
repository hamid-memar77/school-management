package ir.mapsa.sample.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private FullName fullName;

    private Long teacherNumber;

    private List<Course> courseList;

    public Teacher(FullName fullName, Long teacherNumber) {
        this.fullName = fullName;
        this.teacherNumber = teacherNumber;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Long getTeacherNumber() {
        return teacherNumber;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Course> getCourseList() {
        if (courseList == null) {
            courseList = new ArrayList<>();
        }
        return courseList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName=" + fullName +
                ", teacherNumber=" + teacherNumber +
                '}';
    }
}
