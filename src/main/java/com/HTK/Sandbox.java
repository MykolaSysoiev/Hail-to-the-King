package main.java.com.HTK;

import main.java.com.HTK.comparator.StudentSpeakingLevel;
import main.java.com.HTK.model.StudentAdvanced;

import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {
        StudentAdvanced[] advacedStudents = {
                new StudentAdvanced(StudentAdvanced.C1),
                new StudentAdvanced(StudentAdvanced.C2),
                new StudentAdvanced(StudentAdvanced.C1),
                new StudentAdvanced(StudentAdvanced.C2),
                new StudentAdvanced(StudentAdvanced.C1),
                new StudentAdvanced(StudentAdvanced.C1),
        };
        Arrays.sort(advacedStudents, new StudentSpeakingLevel());
        for (StudentAdvanced studentAdvanced:advacedStudents){
            System.out.println(studentAdvanced.getSpeaking());
        }
    }
}
