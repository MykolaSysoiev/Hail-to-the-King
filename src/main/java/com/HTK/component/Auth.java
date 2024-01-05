package main.java.com.HTK.component;

import main.java.com.HTK.Main;

public class Auth {
    private  static final String PASSWORD = "d";
    public static boolean auth() {
        boolean passwordAccepted = false;
        for (byte i=0; i<3; i++){
            System.out.println("Write your password below:");
            String input = Main.Scanner.nextLine();
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
}
