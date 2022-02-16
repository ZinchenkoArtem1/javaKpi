package ua.com.zinchenko.ui.cli;

import ua.com.zinchenko.service.model.Test;

import java.util.Arrays;
import java.util.List;

public class ConsoleWriterImpl implements ConsoleWriter {

    @Override
    public void writeMenu() {
        System.out.println();
        System.out.println("---MENU---");
        System.out.println("1. Get all tests");
        System.out.println("2. Get all subjects");
        System.out.println("3. Get all forms");
        System.out.println("4. Get tests by subject");
        System.out.println("5. Get tests by form");
        System.out.println("6. Close program");
        System.out.print("For choose input number of task (from 1 to 6 second inclusive): ");
    }

    @Override
    public void writeTests(Test[] tests) {
        System.out.println("Tests list: ");
        Arrays.stream(tests)
                .forEach(System.out::println);
    }

    @Override
    public void writeSubjects(List<String> subjects) {
        System.out.println("Subjects list: " + subjects);
    }

    @Override
    public void writeForms(List<String> forms) {
        System.out.println("Forms list: " + forms);
    }

    @Override
    public void writeEndProgram() {
        System.out.println("---End of program---");
    }

    @Override
    public void writeExceptionMessage(String message) {
        System.out.println(message);
    }
}
