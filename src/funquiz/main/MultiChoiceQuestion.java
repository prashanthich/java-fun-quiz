package funquiz.main;

import java.util.ArrayList;
import java.util.Scanner;

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

    @Override
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

    public double getAnswers() {
        ArrayList<Integer> userAnswers = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers. To begin answering the question, enter 'y'.");
        Scanner userContinue = new Scanner(System.in);
        String userOption = userContinue.nextLine();
        System.out.println(userOption);
        while (userOption.indexOf("y") >= 0 && userAnswers.size() < this.getCorrectAnswers().size()) {
            Scanner userAnswer = new Scanner(System.in);
            System.out.println("Enter your choice option number");
            int userChoice = userAnswer.nextInt();
            userAnswers.add(userChoice);
            System.out.println("For this question, there are multiple correct answers." +
                    " To continue answering the question, enter 'y'. To stop, enter 'n'");
            userOption = userContinue.nextLine();
        }
        double score = getScore(userAnswers);
        return score;
    }
}



