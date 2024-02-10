package main.java.com.HTK.component;

public class ApplicationRunner {
    private final EntityRegister register = new EntityRegister();
    public void run () {
        if (Auth.auth()) {
            register.registerClients();
        }
    }
}
