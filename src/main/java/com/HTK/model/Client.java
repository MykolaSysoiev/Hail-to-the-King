package main.java.com.HTK.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String firstName;
    private String lastName;
    private String email;
    private List<Student> students = new ArrayList<>();
    @Override
    public String toString() {
        return "Client {"
                +"\n\tfirstName = " + firstName
                + ", lastName = " + lastName
                + ", email = "+ email
                + ", \n\tstudents = " + students
                +"\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName)
                && Objects.equals(email, client.email)
                && Objects.equals(students, client.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, students);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(List<Student> student) {
        this.students = student;
    }
    public void addStudent (Student student) {
        students.add(student);
    }
}
