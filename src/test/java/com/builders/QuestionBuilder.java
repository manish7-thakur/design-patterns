package com.builders;

public class QuestionBuilder {
    private String description;

    public static QuestionBuilder aValidQuestion() {
        return new QuestionBuilder();
    }

    public QuestionBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public Question build() {
        return new Question(description);
    }
}
