package ua.com.zinchenko.ui;

import ua.com.zinchenko.service.model.Test;

import java.util.List;

public interface UserWriter {

    void writeMenu();

    void writeTests(Test[] tests);

    void writeSubjects(List<String> subjects);

    void writeForms(List<String> forms);

    void writeExceptionMessage(String message);
}
