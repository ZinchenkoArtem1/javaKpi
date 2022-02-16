package ua.com.zinchenko.ui.cli.controller;

import ua.com.zinchenko.service.TestService;
import ua.com.zinchenko.service.model.Test;
import ua.com.zinchenko.ui.MainController;
import ua.com.zinchenko.ui.cli.ConsoleReader;
import ua.com.zinchenko.ui.cli.ConsoleWriter;


public class CliMainController implements MainController {

    private final ConsoleReader consoleReader;
    private final ConsoleWriter consoleWriter;
    private final TestService testService;

    public CliMainController(ConsoleReader consoleReader, ConsoleWriter consoleWriter, TestService testService) {
        this.consoleReader = consoleReader;
        this.consoleWriter = consoleWriter;
        this.testService = testService;
    }

    public void start() {

        boolean isWork = true;

        while (isWork) {
            consoleWriter.writeMenu();

            try {
                switch (consoleReader.getNumberOfTaskFromMenu()) {
                    case 1 -> {
                        consoleWriter.writeTests(testService.getAllTests());
                    }
                    case 2 -> {
                        consoleWriter.writeSubjects(testService.getAllSubjects());
                    }
                    case 3 -> {
                        consoleWriter.writeForms(testService.getAllForms());
                    }
                    case 4 -> {
                        String subject = consoleReader.getSubjectName();
                        Test[] tests = testService.getTestsBySubject(subject);
                        if(tests.length == 0) {
                            consoleWriter.writeExceptionMessage("No tests were found with the subject: " + subject);
                        } else {
                            consoleWriter.writeTests(tests);
                        }
                    }
                    case 5 -> {
                        String form = consoleReader.getFormName();
                        Test[] tests = testService.getTestsByForm(form);
                        if(tests.length == 0) {
                            consoleWriter.writeExceptionMessage("No tests were found with the form: " + form);
                        } else {
                            consoleWriter.writeTests(tests);
                        }                    }
                    case 6 -> {
                        consoleWriter.writeEndProgram();
                        isWork = false;
                    }
                    default -> consoleWriter.writeExceptionMessage("You must input 1 or 6 number");
                }
            } catch (NumberFormatException e) {
                consoleWriter.writeExceptionMessage("You must input 1 or 6 number");
            }
        }

    }
}
