package ua.com.zinchenko.persistence;

import ua.com.zinchenko.service.model.Test;

import java.util.List;

public interface TestRepository {

    Test[] getAllTests();
    Test[] getTestsBySubject(String subject);
    Test[] getTestsByForm(String form);
    List<String> getAllSubjects();
    List<String> getAllForms();

}
