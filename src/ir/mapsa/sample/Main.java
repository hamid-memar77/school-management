package ir.mapsa.sample;

public class Main {

    public static void main(String[] args) {
        SchoolManagement schoolManagement = new SchoolManagement();
        schoolManagement.findAllCourses();
        System.out.println("---------------------------------------------------");
        schoolManagement.findAllTeachers();
        System.out.println("---------------------------------------------------");
        System.out.println(schoolManagement.getTeacherByNumber());
    }
}
