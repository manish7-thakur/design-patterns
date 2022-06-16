package com.patterns.creational.builder;

public class Question {
    private int ratings;
    private String description;

    public Question(String description) {
        this.description = description;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int r) {
        this.ratings = r;
    }

    public String getDescription() {
        return description;
    }
}
