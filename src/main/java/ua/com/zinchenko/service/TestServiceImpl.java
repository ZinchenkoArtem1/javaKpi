package ua.com.zinchenko.service;

import ua.com.zinchenko.persistence.TestRepository;
import ua.com.zinchenko.service.model.Test;


public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Test[] getAllTests() {
        return testRepository.getAllTests();
    }

    @Override
    public Test[] getTestsBySubject(String subject) {
        return testRepository.getTestsBySubject(subject);
    }

    @Override
    public Test[] getTestsByForm(String form) {
        return testRepository.getTestsByForm(form);
    }

    @Override
    public String[] getAllSubjects() {
        return testRepository.getAllSubjects();
    }

    @Override
    public String[] getAllForms() {
        return testRepository.getAllForms();
    }
}
