package main.java.com.HTK;

import java.util.Scanner;

public class Main {
    static String PASSWORD = "default";
    static Scanner passwordScanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }
    static void run (){
        boolean passwordAccepted = false;
        for (byte i=0; i<3; i++){
            System.out.println("Write your password below:");
            String input = passwordScanner.nextLine();
            if (PASSWORD.equals(input)) {
                passwordAccepted = true;
                break;
            }else{
                System.out.println("Access denied. You have "+ (2-i) + " attempts left.");
            }
        }
        System.out.println(passwordAccepted ? "You are welcome in English school 'Hail to the King!'" :
                "You have exceeded the number of attempts! Application has been Blocked");
    }
}