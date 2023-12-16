package main.java.com.HTK;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String PASSWORD = "default";
    static Scanner Scanner = new Scanner(System.in);
    static String emailPattern = "^\\S+@\\S+\\.\\S+$";

    public static void main(String[] args) {
        run();
    }
    static void run (){
        if (auth()) {
            registerNewClient();
        }
    }
    static boolean auth() {
        boolean passwordAccepted = false;
        for (byte i=0; i<3; i++){
            System.out.println("Write your password below:");
            String input = Scanner.nextLine();
            if (PASSWORD.equals(input)) {
                passwordAccepted = true;
                break;
            }else{
                System.out.println("Access denied. You have "+ (2-i) + " attempts left.");
            }
        }
        System.out.println(passwordAccepted ? "Access accepted, You are welcome in English school 'Hail to the King!'" :
                "You have exceeded the number of attempts! Application has been Blocked");
        return passwordAccepted;
    }
    static void registerNewClient () {
        System.out.println("Please provide client details.");
        System.out.print("E-mail: ");
        String email = Scanner.nextLine();
        if (isEmailValid(email)) {
            Client client = buildClient(email);
            System.out.println("New client: "+client.firstName +" "+client.lastName+" ("+client.email+")");
        } else {
            System.out.println("Provided email is not valid");
        }

    }

    static Client buildClient(String email) {
        Client client = new Client();
        client.email = email;
        System.out.println("First name: ");
        client.firstName= Scanner.nextLine();
        System.out.println("Last name: ");
        client.lastName= Scanner.nextLine();
        return client;
    }

    static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}