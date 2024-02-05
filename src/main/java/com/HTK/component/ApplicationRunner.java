package main.java.com.HTK.component;

import main.java.com.HTK.Main;
import main.java.com.HTK.model.Client;
import main.java.com.HTK.model.Student;
import main.java.com.HTK.service.ClientService;
import main.java.com.HTK.service.StudentService;

public class ApplicationRunner {
    private final ClientService clientservice = new ClientService();
    private final StudentService studentService = new StudentService();
    public void run () {
        if (Auth.auth()) {
            Client client = clientservice.registerNewClient();
            if (client != null) {
                registerStudents(client);
                System.out.println(client);
            }
        }
    }

    private void registerStudents (Client client) {
        boolean continueAddingStudents = true;
        while (continueAddingStudents) {
            addStudent(client);
            System.out.print("Do you want to add more students for the current client? (Y/N): ");
            String answer = Main.Scanner.nextLine();
            if ("N".equals(answer)) {
                continueAddingStudents = false;
            }
        }
    }

    private void addStudent (Client client) {
        System.out.println("Adding a new student");
        Student student = studentService.registerNewStudent();
        if (student != null) {
            client.addStudent(student);
            student.setPayersName(client.getFirstName()+" "+ client.getLastName());
            System.out.println("Student has been added.");}
    }
}
