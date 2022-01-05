package ir.mapsa.sample.database;

import ir.mapsa.sample.model.Course;
import ir.mapsa.sample.model.FullName;
import ir.mapsa.sample.model.Student;
import ir.mapsa.sample.model.Teacher;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class SchoolDatabase {
    private List<Course> courses;

    private List<Teacher> teachers;

    private List<Student> students;

    public SchoolDatabase() {
        Teacher teacher1 = new Teacher(new FullName("mohammad", "mohammadi"), 97557182L);
        Teacher teacher2 = new Teacher(new FullName("mahdi", "maneshi"), 96787182L);
        teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        this.courses = new ArrayList<>();
        courses.add(new Course("riazi", 3, 451, teacher1));
        courses.add(new Course("fizik", 3, 341, teacher1));
        courses.add(new Course("barnamenevisi", 3, 890, teacher2));


        teacher1.getCourseList().add(courses.get(0));
        teacher1.getCourseList().add(courses.get(1));
        teacher2.getCourseList().add(courses.get(2));

        this.students = new ArrayList<>();
        Student student = new Student(new FullName("reza", "miri"),
                new GregorianCalendar(1998, Calendar.DECEMBER, 15).getTime()
                , courses);
        students.add(student);
    }

    public Teacher findTeacherByNumber(Long teacherNumber) {
        Teacher foundedTeacher = null;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherNumber().equals(teacherNumber)) {
                foundedTeacher = teacher;
                break;
            }
        }
        return foundedTeacher;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }
}
