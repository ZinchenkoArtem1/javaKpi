package ua.com.zinchenko.ui.cli;

import ua.com.zinchenko.service.model.Test;

public class ConsoleWriterImpl implements ConsoleWriter {

    @Override
    public void printTests(Test[] tests) {
        for (Test test : tests) {
            System.out.println(test);
        }
    }

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
