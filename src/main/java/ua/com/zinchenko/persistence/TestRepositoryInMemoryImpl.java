package ua.com.zinchenko.persistence;

import ua.com.zinchenko.service.model.Test;

import java.util.Arrays;

public class TestRepositoryInMemoryImpl implements TestRepository {

    private final Test[] tests;

    public TestRepositoryInMemoryImpl(DataGenerator dataGenerator) {
        this.tests = dataGenerator.getTestsData();
    }

    @Override
    public Test[] getAllTests() {
        return Arrays.copyOf(tests, tests.length);
    }

    @Override
    public Test[] getTestsBySubject(String subject) {
        Test[] testsBySubject = new Test[0];

        for (Test test : tests) {
            if (test.getSubject().equalsIgnoreCase(subject)) {
                testsBySubject = Arrays.copyOf(testsBySubject, testsBySubject.length + 1);
                testsBySubject[testsBySubject.length - 1] = test;
            }
        }

        return testsBySubject;
    }

    @Override
    public Test[] getTestsByForm(String form) {
        Test[] testsByForm = new Test[0];

        for (Test test : tests) {
            if (test.getForm().equalsIgnoreCase(form)) {
                testsByForm = Arrays.copyOf(testsByForm, testsByForm.length + 1);
                testsByForm[testsByForm.length - 1] = test;
            }
        }

        return testsByForm;
    }

    @Override
    public String[] getAllSubjects() {
        String[] subjects = new String[0];

        for (Test test : tests) {
            boolean distinct = false;
            for (String subject : subjects) {
                if (subject.equalsIgnoreCase(test.getSubject())) {
                    distinct = true;
                    break;
                }
            }
            if (!distinct) {
                subjects = Arrays.copyOf(subjects, subjects.length + 1);
                subjects[subjects.length - 1] = test.getSubject();
            }
        }

        return subjects;
    }

    @Override
    public String[] getAllForms() {
        String[] forms = new String[0];

        for (Test test : tests) {
            boolean distinct = false;
            for (String form : forms) {
                if (form.equalsIgnoreCase(test.getForm())) {
                    distinct = true;
                    break;
                }
            }
            if (!distinct) {
                forms = Arrays.copyOf(forms, forms.length + 1);
                forms[forms.length - 1] = test.getForm();
            }
        }

        return forms;
    }
}
