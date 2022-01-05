package ir.mapsa.sample.model;

import ir.mapsa.sample.exception.InvalidInputException;

public class FullName {
    private String firstName;

    private String lastName;

    public FullName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new InvalidInputException();
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new InvalidInputException();
        }
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
