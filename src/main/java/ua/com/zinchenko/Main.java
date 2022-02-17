package ua.com.zinchenko;

import ua.com.zinchenko.persistence.InMemoryDataGenerator;
import ua.com.zinchenko.persistence.DataGenerator;
import ua.com.zinchenko.persistence.TestRepository;
import ua.com.zinchenko.persistence.TestRepositoryInMemoryImpl;
import ua.com.zinchenko.service.TestService;
import ua.com.zinchenko.service.TestServiceImpl;
import ua.com.zinchenko.ui.MainController;
import ua.com.zinchenko.ui.cli.ConsoleReader;
import ua.com.zinchenko.ui.cli.ConsoleReaderImpl;
import ua.com.zinchenko.ui.cli.ConsoleWriter;
import ua.com.zinchenko.ui.cli.ConsoleWriterImpl;
import ua.com.zinchenko.ui.cli.controller.CliMainController;

public class Main {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReaderImpl();
        ConsoleWriter consoleWriter = new ConsoleWriterImpl();
        DataGenerator inMemoryDataGenerator = new InMemoryDataGenerator();
        TestRepository testRepository = new TestRepositoryInMemoryImpl(inMemoryDataGenerator);
        TestService testService = new TestServiceImpl(testRepository);
        MainController mainController = new CliMainController(consoleReader, consoleWriter, testService);
        mainController.start();
    }
}
