package ua.com.zinchenko.persistence;

import ua.com.zinchenko.service.model.Test;

public interface TestRepository {

    Test[] getAllTests();
    Test[] getTestsBySubject(String subject);
    Test[] getTestsByForm(String form);
    String[] getAllSubjects();
    String[] getAllForms();

}
