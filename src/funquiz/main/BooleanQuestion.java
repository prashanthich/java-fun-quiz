package funquiz.main;

import java.util.ArrayList;

public class BooleanQuestion extends Question {
    private ArrayList<Boolean> options;
    private boolean answers;

    public boolean getAnswers(){
        return this.answers;
    }
    public void setAnswers(boolean aAnswers){
        this.answers = aAnswers;
    }
    public BooleanQuestion(){
        options = new ArrayList<>();
        options.add(true);
        options.add(false);
    }
}
