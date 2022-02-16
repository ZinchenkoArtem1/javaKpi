package ua.com.zinchenko.service.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    private String form;
    private String subject;
    private String question;
    private final Map<Integer, String> answerOptions;
    private final List<Integer> correctAnswers;

    public Test(String form, String subject, String question, Map<Integer, String> answerOptions, List<Integer> correctAnswers) {
        this.form = form;
        this.subject = subject;
        this.question = question;
        this.answerOptions = answerOptions;
        this.correctAnswers = correctAnswers;
    }

    public Test(String form, String subject, String question) {
        this();
        this.form = form;
        this.subject = subject;
        this.question = question;
    }

    public Test() {
        answerOptions = new HashMap<>();
        correctAnswers = new ArrayList<>();
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

    public Map<Integer, String> getAnswerOptions() {
        return answerOptions;
    }

    public List<Integer> getCorrectAnswers() {
        return correctAnswers;
    }

    @Override
    public String toString() {
        return "Test{" +
                "form='" + form + '\'' +
                ", subject='" + subject + '\'' +
                ", question='" + question + '\'' +
                ", answerOptions=" + answerOptions +
                ", correctAnswers=" + correctAnswers +
                '}';
    }
}
