package funquiz.main;

public class Answer {
    private int id;
    public static int nextId = 1;
    private int value;

    public Answer(){
        id = nextId;
        nextId++;
    }

    public Answer( int value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
