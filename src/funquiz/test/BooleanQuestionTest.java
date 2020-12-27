package funquiz.test;

import funquiz.main.BooleanQuestion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanQuestionTest {
    BooleanQuestion question;
    @Before
    public void setUp() {
         question = new BooleanQuestion("A base class is also called super class",
                2,
                true);
    }

    @Test
    public void testCalculateScoreUserSelectedCorrectAnswer() {
        //Act
        double score = question.calculateScore(true);
        //Assert
        assertEquals(2,score,.001);
    }
    @Test
    public void testCalculateScoreUserSelectedWrongAnswer() {
        //Act
        double score = question.calculateScore(false);
        //Assert
        assertEquals(0,score,.001);
    }
}