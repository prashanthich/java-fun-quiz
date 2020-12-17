package funquiz.main;

import java.util.ArrayList;

public class MultiChoiceQuestion extends Question {
    private ArrayList<String> answers;

    public void setAnswers(ArrayList<String> aAnswers){
        this.answers = aAnswers;
    }
}
