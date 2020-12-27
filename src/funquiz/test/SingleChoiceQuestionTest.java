package funquiz.test;

import funquiz.main.MultiChoiceQuestion;
import funquiz.main.SingleChoiceQuestion;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SingleChoiceQuestionTest {
    SingleChoiceQuestion question;
    @Before
    public void setUp() {
        question = new SingleChoiceQuestion("A base class can also called as",
                1.5,
                new ArrayList<String>(Arrays.asList("Dummy class","Child class","Super class","Derived class")),
                3);
    }

    @Test
    public void testGetScoreUserSelectCorrectAnswer() {
        //Act
        double score = question.getScore(3);
        //Assert
        assertEquals(1.5,score,.001);
    }
    @Test
    public void testGetScoreUserSelectWrongAnswer() {
        //Act
        double score = question.getScore(2);
        //Assert
        assertEquals(0,score,.001);
    }
}