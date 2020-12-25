package funquiz.main;

public abstract class Question {
    private String question;
    private int pointValue;

    public Question(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}
