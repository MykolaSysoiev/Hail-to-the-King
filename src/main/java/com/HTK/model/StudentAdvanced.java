package main.java.com.HTK.model;

public class StudentAdvanced extends Student {
    private String speaking; //Only for advanced students

    public void setSpeaking(String speaking) {
        this.speaking = speaking;
    }

    public String getSpeaking() {
        return speaking;
    }
}
