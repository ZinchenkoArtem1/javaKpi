package ua.com.zinchenko;

import ua.com.zinchenko.persistence.InMemoryDataGenerator;
import ua.com.zinchenko.persistence.TestRepositoryInMemoryImpl;
import ua.com.zinchenko.service.TestServiceImpl;
import ua.com.zinchenko.ui.MainController;
import ua.com.zinchenko.ui.cli.ConsoleReaderImpl;
import ua.com.zinchenko.ui.cli.ConsoleWriterImpl;
import ua.com.zinchenko.ui.cli.controller.CliMainController;

public class Main {

    public static void main(String[] args) {
        MainController mainController = new CliMainController(
                new ConsoleReaderImpl(),
                new ConsoleWriterImpl(),
                new TestServiceImpl(new TestRepositoryInMemoryImpl(new InMemoryDataGenerator()))
        );
        mainController.start();
    }
}
