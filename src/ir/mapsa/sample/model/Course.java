package ir.mapsa.sample.model;

import ir.mapsa.sample.exception.InvalidInputException;

public class Course {
    private String name;

    private Integer unit; //vahed

    private Integer code;

    private Teacher teacher;

    public Course(String name, Integer unit, Integer code, Teacher teacher) {
        this.name = name;
        this.unit = unit;
        this.code = code;
        this.teacher = teacher;
    }

    private void validateInput(Integer unit, String name) {
        if (unit < 1 || name.length() < 3) {
            throw new InvalidInputException();
        }
    }

    public String getName() {
        return name;
    }

    public Integer getUnit() {
        return unit;
    }

    public Integer getCode() {
        return code;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", unit=" + unit +
                ", code=" + code +
                ", teacher=" + teacher +
                '}';
    }
}
