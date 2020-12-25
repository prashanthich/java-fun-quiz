package funquiz.test;

import funquiz.main.MultiChoiceQuestion;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MultiChoiceQuestionTest {
    MultiChoiceQuestion question1;
    @org.junit.Before
    public void setUp() {
         question1 = new MultiChoiceQuestion("A base class can also called as",
                1,
                new ArrayList<String>(Arrays.asList("Parent class","Child class","Super class","Derived class")),
                new ArrayList<Integer>(Arrays.asList(1,3)));
    }

    @Test
    public void testCheckAnswersUserSelectedCorrectOptions() {
        //Arrange
        ArrayList<Integer> userAnswers = new ArrayList<>(Arrays.asList(1,3));
        //Act
        double userPoints = question1.getScore(userAnswers);
        //Assert
        assertEquals(1,userPoints,.001);
    }

    @Test
    public void testCheckAnswersUserSelectedPartialCorrectOptions() {
        //Arrange
        ArrayList<Integer> userAnswers = new ArrayList<>(Arrays.asList(2,3));
        //Act
        double score = question1.getScore(userAnswers);
        //Assert
        assertEquals(0.5,score,.001);
    }

    @Test
    public void testCheckAnswersUserSelectedWrongOptions() {
        //Arrange
        ArrayList<Integer> userAnswers = new ArrayList<>(Arrays.asList(2,4));
        //Act
        double score = question1.getScore(userAnswers);
        //Assert
        assertEquals(0,score,.001);
    }
}