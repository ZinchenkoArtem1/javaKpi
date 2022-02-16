package ua.com.zinchenko.ui.cli;

public class ConsoleWriterImpl implements ConsoleWriter {

    @Override
    public void writeMenu() {
        System.out.println();
        System.out.println("---MENU---");
        System.out.println("1. Get tests by subject");
        System.out.println("2. Get tests by form");
        System.out.println("3. Close program");
        System.out.print("For choose input number of task (from 1 to 2 second inclusive): ");
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
