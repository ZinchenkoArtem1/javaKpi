package ua.com.zinchenko.ui.cli.controller;

import ua.com.zinchenko.service.TestService;
import ua.com.zinchenko.service.model.Test;
import ua.com.zinchenko.ui.Localization;
import ua.com.zinchenko.ui.MainController;
import ua.com.zinchenko.ui.cli.ConsoleReader;
import ua.com.zinchenko.ui.cli.ConsoleWriter;

import java.util.Arrays;


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
            consoleWriter.printMessage(Localization.MENU);

            int taskNumber = consoleReader.getNumberOfTaskFromMenu();

            switch (taskNumber) {
                case 1 -> consoleWriter.printTests(testService.getAllTests());
                case 2 -> consoleWriter.printMessage(Arrays.toString(testService.getAllSubjects()));
                case 3 -> consoleWriter.printMessage(Arrays.toString(testService.getAllForms()));
                case 4 -> {
                    consoleWriter.printMessage(Localization.GET_SUBJECT_FROM_PLAYER);
                    String subject = consoleReader.getString();
                    Test[] tests = testService.getTestsBySubject(subject);
                    if (tests.length == 0) {
                        consoleWriter.printMessage(Localization.NO_TEST_FOUND_WITH_SUBJECT + subject);
                    } else {
                        consoleWriter.printTests(tests);
                    }
                }
                case 5 -> {
                    consoleWriter.printMessage(Localization.GET_FORM_FROM_PLAYER);
                    String form = consoleReader.getString();
                    Test[] tests = testService.getTestsByForm(form);
                    if (tests.length == 0) {
                        consoleWriter.printMessage(Localization.NO_TEST_FOUND_WITH_FORM + form);
                    } else {
                        consoleWriter.printTests(tests);
                    }
                }
                case 6 -> {
                    consoleWriter.printMessage(Localization.END_OF_PROGRAM_WORK);
                    isWork = false;
                }
                default -> consoleWriter.printMessage(Localization.BAD_TASK_NUMBER_INPUT);
            }
        }

    }
}
