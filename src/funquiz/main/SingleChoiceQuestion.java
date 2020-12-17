package funquiz.main;

import funquiz.main.Question;

public class SingleChoiceQuestion extends Question {
    private String answers;

    public String getAnswers(){
        return this.answers;
    }
    public void setAnswers(String aAnswers){
        this.answers = aAnswers;
    }
}
