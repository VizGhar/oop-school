package sk.ssnd;

public class Person {

    int dateOfBirth;
    String firstName;
    String lastName;

    String getFullName() {
        return firstName + " " + lastName;
    }

}
