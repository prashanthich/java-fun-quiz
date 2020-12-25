package funquiz.main;

import java.util.ArrayList;

public class MultiChoiceQuestion extends Question {
    private ArrayList<String> answerOptions;
    private ArrayList<Integer> correctAnswers;

    public MultiChoiceQuestion(String question, int pointValue, ArrayList<String> answerOptions, ArrayList<Integer> correctAnswers) {
        super(question, pointValue);
        this.answerOptions = answerOptions;
        this.correctAnswers = correctAnswers;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public ArrayList<Integer> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<Integer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void displayAnswers() {
        for (String answerOption : answerOptions) {
            System.out.println(answerOption);
        }
    }

    public double getScore(ArrayList<Integer> userAnswers) {
        int correctAnswers = 0;
        for (int userAnswer : userAnswers) {
            if (this.getCorrectAnswers().contains(userAnswer)) {
                correctAnswers++;
            }
        }
        double score = (double) (correctAnswers * this.getPointValue()) / this.correctAnswers.size();
        return score;
    }

}



