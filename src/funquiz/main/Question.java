package funquiz.main;

import java.util.ArrayList;

public class Question {
    private int id;
    private static int nextStudentId = 1;
    private String questionName;
    private String questionType;
    private ArrayList<String> options;

    public ArrayList<String> getOptions(){
        return this.options;
    }
    public void setOptions(ArrayList<String> aOptions){
        this.options = aOptions;
    }
    public int getId(){
        return this.id;
    }
    public String getQuestionType(){
        return this.questionType;
    }
    public void setQuestionType(String aQuestionType){
        this.questionType = aQuestionType;
    }
    public String getQuestionName(){
        return this.questionName;
    }
    public void setQuestionName(String aQuestionName){
        this.questionName = aQuestionName;
    }


}
