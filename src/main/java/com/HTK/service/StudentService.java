package main.java.com.HTK.service;

import main.java.com.HTK.Main;
import main.java.com.HTK.model.Student;
import main.java.com.HTK.model.StudentAdvanced;

public class StudentService {
    private static final String advancedType = "Advanced";
    public Student registerNewStudent(){
        Student student =new Student();

        System.out.print("Student`s level of English: ");
        String englishLevel = Main.Scanner.nextLine();
        if (advancedType.equals(englishLevel)) {
            student = buildStudentAdvanced();
        } else {
            student = buildStudent(englishLevel);

        }
        return student;
    }

    private StudentAdvanced buildStudentAdvanced() {
        Student student = buildStudent(advancedType);
        StudentAdvanced studentAdvanced = studentToAdvancedStudent(student);
        System.out.print("Speaking: ");
        studentAdvanced.setSpeaking(Main.Scanner.nextLine());
        return studentAdvanced;
    }

    private StudentAdvanced studentToAdvancedStudent(Student student) {
        StudentAdvanced studentAdvanced = new StudentAdvanced();
        studentAdvanced.setReading(student.getReading());
        studentAdvanced.setListening(student.getListening());
        studentAdvanced.setVocabulary(student.getVocabulary());
        studentAdvanced.setGrammar(student.getGrammar());
        studentAdvanced.setWriting(student.getWriting());
        return studentAdvanced;
    }

    private Student buildStudent(String englishLevel) {
        Student student = new Student();
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

        return student;
    }
}
