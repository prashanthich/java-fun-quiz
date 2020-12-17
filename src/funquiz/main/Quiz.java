package funquiz.main;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<MultiChoiceQuestion> multiChoiceQuestions;
    private ArrayList<SingleChoiceQuestion> singleChoiceQuestions;
    private ArrayList<BooleanQuestion> booleanQuestions;
    private int totalQuestionsAttempted;
    private int totalCorrectAnswers;

    public Quiz(){
        multiChoiceQuestions = new ArrayList<>();
        singleChoiceQuestions = new ArrayList<>();
        booleanQuestions = new ArrayList<>();
    }

    public int getTotalQuestionsAttempted() {
        return totalQuestionsAttempted;
    }

    public int getTotalCorrectAnswers() {
        return totalCorrectAnswers;
    }

    public ArrayList<MultiChoiceQuestion> getMultiChoiceQuestions() {
        return multiChoiceQuestions;
    }

    public void setMultiChoiceQuestions(ArrayList<MultiChoiceQuestion> multiChoiceQuestions) {
        this.multiChoiceQuestions = multiChoiceQuestions;
    }

    public ArrayList<SingleChoiceQuestion> getSingleChoiceQuestions() {
        return singleChoiceQuestions;
    }

    public void setSingleChoiceQuestions(ArrayList<SingleChoiceQuestion> singleChoiceQuestions) {
        this.singleChoiceQuestions = singleChoiceQuestions;
    }

    public ArrayList<BooleanQuestion> getBooleanQuestions() {
        return booleanQuestions;
    }

    public void setBooleanQuestions(ArrayList<BooleanQuestion> booleanQuestions) {
        this.booleanQuestions = booleanQuestions;
    }
    public void addMultiChoiceQuestion(MultiChoiceQuestion question){
        multiChoiceQuestions.add(question);
    }
    public void addSingleChoiceQuestion(SingleChoiceQuestion question){
        singleChoiceQuestions.add(question);
    }
    public void addBooleanQuestion(BooleanQuestion question){
        booleanQuestions.add(question);
    }
    public double grade(){
        if(totalQuestionsAttempted > 1){
            return (100 * totalCorrectAnswers)/totalQuestionsAttempted;
        }
        return 0;
    }

}
