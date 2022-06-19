package testing;

import java.util.List;

public class Question {
    private final String question;
    private List<String> answerOptionsList;
    private String correctAnswer;

    public Question(String question) {
        this.question = question;
    }

    public List<String> getAnswerOptionsList() {
        return answerOptionsList;
    }

    public void setAnswerOptionsList(String[] answerOptions) {
        this.answerOptionsList = List.of(answerOptions);
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return question;
    }
}