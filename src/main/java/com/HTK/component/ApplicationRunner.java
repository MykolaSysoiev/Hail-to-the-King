package main.java.com.HTK.component;

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
                System.out.println("Adding a new student");
                Student student = studentService.registerNewStudent();
                if (student != null) {
                    client.setStudent(student);
                    student.setPayersName(client.getFirstName()+" "+ client.getLastName());
                    System.out.println("Student has been added.");}
                System.out.println(client);
            }
        }
    }
}
