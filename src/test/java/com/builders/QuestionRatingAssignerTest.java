package com.builders;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.builders.QuestionBuilder.aValidQuestion;

public class QuestionRatingAssignerTest {
    @Test
    @DisplayName("Question with short description")
    public void testQuestion() {
        Question question = aValidQuestion().withDescription("short description").build();
        QuestionRatingAssigner.assignRating(question);
        int expected = 3;
        Assertions.assertEquals(expected, question.getRatings());
    }
}
