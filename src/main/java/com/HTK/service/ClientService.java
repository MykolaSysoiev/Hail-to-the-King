package main.java.com.HTK.service;

import main.java.com.HTK.Main;
import main.java.com.HTK.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientService {
    private static final String emailPattern = "^\\S+@\\S+\\.\\S+$";

    public Client registerNewClient() {
        Client client = null;
        System.out.println("Please provide client details.");
        System.out.print("E-mail: ");
        String email = Main.Scanner.nextLine();
        if (isEmailValid(email)) {
            client = buildClient(email);
            System.out.println("New client: "+client.getFirstName() +" "
                    +client.getLastName()+" ("
                    +client.getEmail()+")");
        } else {
            System.out.println("Provided email is not valid");
        }
        return client;
    }
    static Client buildClient(String email) {
        Client client = new Client();
        client.setEmail(email);
        System.out.println("First name: ");
        client.setFirstName(Main.Scanner.nextLine());
        System.out.println("Last name: ");
        client.setLastName(Main.Scanner.nextLine());
        System.out.println("Location: ");
        String location = Main.Scanner.nextLine();
        client.setLocation(Client.Location.valueOf(location));
        return client;
    }

    static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
