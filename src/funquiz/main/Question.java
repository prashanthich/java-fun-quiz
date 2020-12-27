package funquiz.main;

public abstract class Question {
    private String question;
    private double pointValue;

    public Question(String question, double pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public double getPointValue() {
        return pointValue;
    }

    public void setPointValue(double pointValue) {
        this.pointValue = pointValue;
    }

    public void displayQuestion(){
        System.out.println(this.question);
    }
    public abstract void displayAnswers();
    public abstract double getAnswers();
}
