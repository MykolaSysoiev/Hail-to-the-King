package main.java.com.HTK.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Student {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); //formatted in ISO format
    private String studentName;
    private String englishLevel;
    private String reading;
    private String listening;
    private String vocabulary;
    private String grammar;
    private String writing;
    private String payersName;
    private final LocalDateTime registrationDate = LocalDateTime.now();
    @Override
    public String toString () {
        return "Student {"
                +"Student's name = "+ studentName
                +", average english level = "+ englishLevel
                +", reading level = " +reading
                +", listening level = "+listening
                +", vocabulary = "+vocabulary
                +", grammar level = "+grammar
                +", writing level = "+writing
                +", payers name ="+payersName
                +", registration date ="+registrationDate.format(formatter)
                +"}";
    }

    public String getStudentName() {return studentName;}
    public void setStudentName(String studentName) {this.studentName = studentName;}
    public String getEnglishLevel() {
        return englishLevel;
    }
    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public String getListening() {
        return listening;
    }

    public void setListening(String listening) {
        this.listening = listening;
    }

    public String getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String getGrammar() {
        return grammar;
    }

    public void setGrammar(String grammar) {
        this.grammar = grammar;
    }

    public String getWriting() {
        return writing;
    }

    public void setWriting(String writing) {
        this.writing = writing;
    }

    public String getPayersName() {
        return payersName;
    }

    public void setPayersName(String payersName) {
        this.payersName = payersName;
    }
}