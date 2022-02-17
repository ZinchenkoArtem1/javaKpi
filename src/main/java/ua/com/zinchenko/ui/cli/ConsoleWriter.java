package ua.com.zinchenko.ui.cli;

import ua.com.zinchenko.service.model.Test;

public interface ConsoleWriter {

    void printTests(Test[] tests);

    void printMessage(String message);
}
