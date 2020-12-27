package funquiz.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args){
        MultiChoiceQuestion question1 = new MultiChoiceQuestion("A base class can also called as",
                1,
                new ArrayList<String>(Arrays.asList("Parent class", "Child class", "Super class", "Derived class")),
                new ArrayList<Integer>(Arrays.asList(1, 3)));
       // question1.displayQuestion();
        //question1.displayAnswers();
        //question1.getAnswers();

        SingleChoiceQuestion question = new SingleChoiceQuestion("A base class can also called as",
                1.5,
                new ArrayList<String>(Arrays.asList("Dummy class","Child class","Super class","Derived class")),
                3);

        //question.displayQuestion();
        //question.displayAnswers();
        //question.getAnswers();

        BooleanQuestion booleanQuestion = new BooleanQuestion("A base class is also called super class",
                2,
                true);

        booleanQuestion.displayQuestion();
        booleanQuestion.displayAnswers();
        booleanQuestion.getAnswers();
    }

}
