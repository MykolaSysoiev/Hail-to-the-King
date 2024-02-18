package main.java.com.HTK.component;

import main.java.com.HTK.Main;
import main.java.com.HTK.model.Client;
import main.java.com.HTK.model.Student;
import main.java.com.HTK.service.ClientService;
import main.java.com.HTK.service.StudentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityRegister {
    private final ClientService clientservice = new ClientService();
    private final StudentService studentService = new StudentService();
    public void registerClients() {
        List<Client> clients = new ArrayList<>();
        String message = "Do you want to register more clients? (Y/N): ";
        do {
            Client client = addClient();
            if (client !=null) {
                clients.add(client);
            }
        } while (verifyRepeating(message));
        Map<Client.Location,List<Client>> clientsByLocation =groupClients(clients);
        printClients(clientsByLocation);
    }

    private void printClients(Map<Client.Location, List<Client>> clientsByLocation) {
        for (Map.Entry<Client.Location,List<Client>> clients:clientsByLocation.entrySet()) {
            String content ="\nLocation: " +clients.getKey()
                    +"\nClients (" + clients.getValue().size()+ "): "
                    +"\n\t"+ clients.getValue();
            System.out.println(content);
        }
    }

    private Map<Client.Location, List<Client>> groupClients(List<Client> clients) {
        List<Client> fromKyiv = new ArrayList<>();
        List<Client> fromOdesa = new ArrayList<>();
        List<Client> fromMykolaiv = new ArrayList<>();
        List<Client> unknownLocation = new ArrayList<>();
        for (Client client:clients){
            switch (client.getLocation()) {
                case Kyiv -> fromKyiv.add(client);
                case Odesa -> fromOdesa.add(client);
                case Mykolaiv -> fromMykolaiv.add(client);
                case UNKNOWN -> unknownLocation.add(client);
            }
        }
        Map<Client.Location,List<Client>> clientsByLocation =new HashMap<>();
        clientsByLocation.put(Client.Location.Kyiv, fromKyiv);
        clientsByLocation.put(Client.Location.Odesa, fromOdesa);
        clientsByLocation.put(Client.Location.Mykolaiv, fromMykolaiv);
        clientsByLocation.put(Client.Location.UNKNOWN, unknownLocation);
        return clientsByLocation;
    }

    private Client addClient() {
        Client client = clientservice.registerNewClient();
        if (client != null) {
            registerStudents(client);
            System.out.println(client);
        }
        return client;
    }

    private void registerStudents (Client client) {
        String message = "Do you want to add more students for the current client? (Y/N): ";
        do {
            addStudent(client);
        } while (verifyRepeating(message));
    }

    private void addStudent (Client client) {
        System.out.println("Adding a new student");
        Student student = studentService.registerNewStudent();
        if (student != null) {
            client.addStudent(student);
            student.setPayersName(client.getFirstName()+" "+ client.getLastName());
            System.out.println("Student has been added.");}
    }

    private boolean verifyRepeating (String message) {
        System.out.println(message);
        String answer = Main.Scanner.nextLine();
        if ("Y".equals(answer)) {
            return true;
        } else if ("N".equals(answer)) {
            return false;
        } else {
            System.out.println("Incorrect answer. Please try again. Options Y/N?");
            return verifyRepeating(message);
        }
    }
}
