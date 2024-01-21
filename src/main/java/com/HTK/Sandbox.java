package main.java.com.HTK;

import main.java.com.HTK.model.StudentAdvanced;

import java.util.Arrays;
import java.util.Comparator;

public class Sandbox {
    public static void main(String[] args) {
        StudentAdvanced[] advacedStudents = {
                new StudentAdvanced(StudentAdvanced.Speaking.C1),
                new StudentAdvanced(StudentAdvanced.Speaking.C2),
                new StudentAdvanced(StudentAdvanced.Speaking.C1_american),
                new StudentAdvanced(StudentAdvanced.Speaking.C1_australian),
                new StudentAdvanced(StudentAdvanced.Speaking.C1_british),
                new StudentAdvanced(StudentAdvanced.Speaking.C1_hindu),
                new StudentAdvanced(StudentAdvanced.Speaking.C2_american),
                new StudentAdvanced(StudentAdvanced.Speaking.C2_australian),
                new StudentAdvanced(StudentAdvanced.Speaking.C2_british),
                new StudentAdvanced(StudentAdvanced.Speaking.C2_hindu),
        };
        Arrays.sort(advacedStudents, new Comparator<StudentAdvanced>() {
            @Override
            public int compare(StudentAdvanced o1, StudentAdvanced o2) {
                return o1.getSpeaking().getValue() - o2.getSpeaking().getValue();
            }
        });
        for (StudentAdvanced studentAdvanced:advacedStudents){
            System.out.println(studentAdvanced.getSpeaking());
        }
    }
}
