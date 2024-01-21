package main.java.com.HTK.model;

public class StudentAdvanced extends Student {
    private Speaking speaking; //Only for advanced students
    public StudentAdvanced(){

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
        public int getValue(){
            return Value;
        }

    }
}
