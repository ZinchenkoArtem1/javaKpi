package ua.com.zinchenko.ui.cli;

import java.util.Scanner;

public class ConsoleReaderImpl implements ConsoleReader {

    @Override
    public int getNumberOfTaskFromMenu() {
        return new Scanner(System.in).nextInt();
    }

    @Override
    public String getString() {
        return new Scanner(System.in).nextLine();
    }
}
