package ua.com.zinchenko.ui.cli;

import java.util.Scanner;

public class ConsoleReaderImpl implements ConsoleReader {

    @Override
    public int getNumberOfTaskFromMenu() {
        return Integer.parseInt((new Scanner(System.in)).nextLine());
    }

    @Override
    public String getSubjectName() {
        System.out.print("Input subject name for search: ");
        return new Scanner(System.in).nextLine();
    }

    @Override
    public String getFormName() {
        System.out.print("Input form name for search: ");
        return new Scanner(System.in).nextLine();    }
}
