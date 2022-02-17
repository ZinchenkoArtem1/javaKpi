package ua.com.zinchenko.ui;

import ua.com.zinchenko.service.model.Test;

import java.util.List;

public interface UserWriter {

    void writeMenu();

    void writeTests(Test[] tests);

    void writeSubjects(String[] subjects);

    void writeForms(String[] forms);

    void writeExceptionMessage(String message);
}
