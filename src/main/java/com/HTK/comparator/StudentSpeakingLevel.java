package main.java.com.HTK.comparator;

import main.java.com.HTK.model.StudentAdvanced;

import java.util.Comparator;

public class StudentSpeakingLevel implements Comparator<StudentAdvanced> {
    @Override
    public int compare(StudentAdvanced student1, StudentAdvanced student2) {
        return convertLevel(student1.getSpeaking())-convertLevel(student2.getSpeaking());
    }

    private static int convertLevel (String speaking) {
        return switch (speaking) {
            case StudentAdvanced.C1 -> 1;
            case StudentAdvanced.C2 -> 2;
            default -> 0;
        };
    }
}
