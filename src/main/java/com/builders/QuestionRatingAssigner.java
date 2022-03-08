package com.builders;

class QuestionRatingAssigner {
    public static void assignRating(Question question) {
        if (question.getDescription().contains("short")) question.setRatings(3);
    }
}
