package funquiz.main;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleChoiceQuestion extends Question {
    private ArrayList<String> answerOptions;
    private int correctAnswer;

    public SingleChoiceQuestion(String question, double pointValue, ArrayList<String> answerOptions, int correctAnswer) {
        super(question, pointValue);
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswers() {
        int index =1;
        for (String answerOption: answerOptions){
            System.out.println(index + "." + answerOption);
            index++;
        }
    }

    public double getScore(int userAnswer){
        if(userAnswer == correctAnswer){
            return getPointValue();
        }
        return 0;
    }

    @Override
    public double getAnswers() {
        System.out.println("Please pick one correct answer: ");
        Scanner scannerObj = new Scanner(System.in);
        int userSelectedOption = scannerObj.nextInt();
        double scoredMarks = getScore(userSelectedOption);
        System.out.println(scoredMarks);
        return scoredMarks;
    }
}
