package main.java.com.HTK.model;

public class StudentAdvanced extends Student {
    public static final String C1 = "C1";
    public static final String C2 = "C2";
    private String speaking; //Only for advanced students
    public StudentAdvanced(){

    }
    public StudentAdvanced(String speaking) {
        this.speaking=speaking;
    }

    public void setSpeaking(String speaking) {
        this.speaking = speaking;
    }

    public String getSpeaking() {
        return speaking;
    }
}
