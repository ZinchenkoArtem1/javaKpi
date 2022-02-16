package ua.com.zinchenko.ui.cli.controller;

import ua.com.zinchenko.ui.MainController;
import ua.com.zinchenko.ui.cli.ConsoleReader;
import ua.com.zinchenko.ui.cli.ConsoleWriter;

import java.util.List;

public class CliMainController implements MainController {

    private final ConsoleReader consoleReader;
    private final ConsoleWriter consoleWriter;

    public CliMainController(ConsoleReader consoleReader, ConsoleWriter consoleWriter) {
        this.consoleReader = consoleReader;
        this.consoleWriter = consoleWriter;
    }

    public void start() {

        boolean isWork = true;

        while (isWork) {
            consoleWriter.writeMenu();

            try {
                switch (consoleReader.getNumberOfTaskFromMenu()) {
                    case 1 -> {
                        String subject = consoleReader.getSubjectName();
                    }
                    case 2 -> {
                        String form = consoleReader.getFormName();
                    }
                    case 3 -> {
                        consoleWriter.writeEndProgram();
                        isWork = false;
                    }
                    default -> consoleWriter.writeExceptionMessage("You must input 1 or 2 number");
                }
            } catch (NumberFormatException e) {
                consoleWriter.writeExceptionMessage("You must input 1 or 2 number");
            }
        }

    }
}
