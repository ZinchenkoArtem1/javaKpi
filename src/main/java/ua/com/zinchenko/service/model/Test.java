package ua.com.zinchenko.service.model;

import java.util.Arrays;

public class Test {

    private String form;
    private String subject;
    private String question;
    private String[] answerOptions;
    private Integer[] correctAnswerNumbers;

    public Test(String form, String subject, String question, String[] answerOptions, Integer[] correctAnswerNumbers) {
        this.form = form;
        this.subject = subject;
        this.question = question;
        this.answerOptions = answerOptions;
        this.correctAnswerNumbers = correctAnswerNumbers;
    }

    public String getForm() {
        return form;
    }

    public Test setForm(String form) {
        this.form = form;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Test setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public Test setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String[] getAnswerOptions() {
        return answerOptions;
    }

    public Test setAnswerOptions(String[] answerOptions) {
        this.answerOptions = answerOptions;
        return this;
    }

    public Integer[] getCorrectAnswerNumbers() {
        return correctAnswerNumbers;
    }

    public Test setCorrectAnswerNumbers(Integer[] correctAnswerNumbers) {
        this.correctAnswerNumbers = correctAnswerNumbers;
        return this;
    }

    @Override
    public String toString() {
        return "Test{" +
                "form='" + form + '\'' +
                ", subject='" + subject + '\'' +
                ", question='" + question + '\'' +
                ", answerOptions=" + Arrays.toString(answerOptions) +
                ", correctAnswers=" + Arrays.toString(correctAnswerNumbers) +
                '}';
    }
}
