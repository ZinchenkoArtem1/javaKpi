package ua.com.zinchenko.service;

import ua.com.zinchenko.service.model.Test;

import java.util.List;

public interface TestService {

    Test[] getAllTests();
    Test[] getTestsBySubject(String subject);
    Test[] getTestsByForm(String form);
    String[] getAllSubjects();
    String[] getAllForms();
}
