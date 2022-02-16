package ua.com.zinchenko.persistence;

import ua.com.zinchenko.service.model.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestRepositoryInMemoryImpl implements TestRepository {

    private final Test[] tests;

    public TestRepositoryInMemoryImpl(TestDataGenerator testDataGenerator) {
        this.tests = testDataGenerator.getData();
    }


    @Override
    public Test[] getAllTests() {
        return tests;
    }

    @Override
    public Test[] getTestsBySubject(String subject) {
        return Arrays.stream(tests)
                .filter(t -> t.getSubject().equalsIgnoreCase(subject))
                .toArray(Test[]::new);
    }

    @Override
    public Test[] getTestsByForm(String form) {
        return Arrays.stream(tests)
                .filter(t -> t.getForm().equalsIgnoreCase(form))
                .toArray(Test[]::new);
    }

    @Override
    public List<String> getAllSubjects() {
        return Arrays.stream(tests)
                .map(Test::getSubject)
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllForms() {
        return Arrays.stream(tests)
                .map(Test::getForm)
                .distinct()
                .collect(Collectors.toList());
    }
}
