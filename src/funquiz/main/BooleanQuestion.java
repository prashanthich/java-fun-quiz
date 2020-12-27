package funquiz.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BooleanQuestion extends Question {
        private boolean correctAnswer;

    public BooleanQuestion(String question, double pointValue, boolean correctAnswer) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswers() {
        System.out.println(true);
        System.out.println(false);
    }

    public double calculateScore(boolean userSelectedAnswer){
        if(userSelectedAnswer == correctAnswer){
            return getPointValue();
        }
        return 0;
    }
    @Override
    public double getAnswers() {
        System.out.println("Please enter either true or false: ");
        Scanner scannerObj = new Scanner(System.in);
        boolean userSelectedAnswer = scannerObj.nextBoolean();
        double score = calculateScore(userSelectedAnswer);
        System.out.println(score);
        return score;
    }
}
