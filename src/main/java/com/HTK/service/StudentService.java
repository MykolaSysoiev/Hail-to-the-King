package main.java.com.HTK.service;

import main.java.com.HTK.Main;
import main.java.com.HTK.model.Student;
import main.java.com.HTK.model.StudentAdvanced;
import main.java.com.HTK.model.StudentIntermediate;

public class StudentService {
    private static final String advancedType = "Advanced";
    private static final String intermediateType = "Intermediate";
    public Student registerNewStudent(){
        Student student =null;

        System.out.print("Student`s level of English: ");
        String englishLevel = Main.Scanner.nextLine();
        if (advancedType.equals(englishLevel)|| intermediateType.equals(englishLevel)) {
            student = buildStudent(englishLevel);
        } else {
            System.out.println("Sorry, we don`t have courses for "+englishLevel+" level");;

        }
        return student;
    }

    private Student buildStudent(String englishLevel) {
        Student student = englishLevel.equals(intermediateType) ? new StudentIntermediate() : new StudentAdvanced();
        student.setEnglishLevel(englishLevel);

        System.out.print("Reading: ");
        student.setReading(Main.Scanner.nextLine());

        System.out.print("Listening: ");
        student.setListening(Main.Scanner.nextLine());

        System.out.print("Vocabulary: ");
        student.setVocabulary(Main.Scanner.nextLine());

        System.out.print("Grammar: ");
        student.setGrammar(Main.Scanner.nextLine());

        System.out.print("Writing: ");
        student.setWriting(Main.Scanner.nextLine());
        if (englishLevel.equals(advancedType)) {
            System.out.print("Speaking: C1,C2 (including accents)");
            String speaking = Main.Scanner.nextLine();
            ((StudentAdvanced)student).setSpeaking(StudentAdvanced.Speaking.valueOf(speaking));
        }

        return student;
    }
}
