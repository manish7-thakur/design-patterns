package com.patterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuestionBuilderTest {
    @Test
    public void buildsQuestionWithDescription() {
        Question q = QuestionBuilder.aValidQuestion().withDescription("popo").build();
        Assertions.assertEquals("popo", q.getDescription());
    }
}