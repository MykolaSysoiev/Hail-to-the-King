package main.java.com.HTK.model;

public class StudentAdvanced extends Student {
    private Speaking speaking; //Only for advanced students
    public StudentAdvanced(){    }

    @Override
    public String toString () {
        return "Student {"
                +"Student's name = "+ getStudentName()
                +", average english level = "+ getEnglishLevel()
                +", reading level = " +getReading()
                +", listening level = "+getListening()
                +", vocabulary = "+getVocabulary()
                +", grammar level = "+getGrammar()
                +", writing level = "+getWriting()
                +", speaking level ="+getSpeaking()
                +", payers name ="+getPayersName()
                +", registration date ="+getRegistrationDate().format(formatter)
                +"}";
    }
    public StudentAdvanced(Speaking speaking) {
        this.speaking=speaking;
    }

    public void setSpeaking(Speaking speaking) {
        this.speaking = speaking;
    }

    public Speaking getSpeaking() {
        return speaking;
    }
    public enum Speaking {
        C1_hindu(1),
        C1(2),
        C1_australian(3),
        C1_american(4),
        C1_british(5),
        C2_hindu(6),
        C2(7),
        C2_australian(8),
        C2_american(9),
        C2_british(10),
        UNKNOWN(0);

        private final int Value;
        Speaking(int Value) {
            this.Value=Value;
        }
        public static Speaking fromString(String value) {
            for (Speaking speaking1 : values()) {
                if (speaking1.toString().equals(value)) {
                    return speaking1;
                }
            }
            System.out.println("Unable to parse speaking level "+value+" using default speaking level: "+UNKNOWN);
            return UNKNOWN;
        }
        public int getValue(){
            return Value;
        }

    }
}
