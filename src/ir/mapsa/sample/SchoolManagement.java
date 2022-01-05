package ir.mapsa.sample;

import ir.mapsa.sample.database.SchoolDatabase;
import ir.mapsa.sample.model.Teacher;

import java.util.Scanner;

public class SchoolManagement {

    private final SchoolDatabase schoolDatabase;

    public SchoolManagement() {
        this.schoolDatabase = new SchoolDatabase();
    }

    public Teacher getTeacherByNumber() {
        System.out.println("please Enter number :");
        Scanner scanner = new Scanner(System.in);
        return schoolDatabase.findTeacherByNumber(scanner.nextLong());
    }

    public void findAllStudents() {
        schoolDatabase.getStudents().forEach(System.out::println);
    }

    public void findAllTeachers() {
        schoolDatabase.getTeachers().forEach(System.out::println);
    }

    public void findAllCourses() {
        schoolDatabase.getCourses().forEach(System.out::println);
    }
}
