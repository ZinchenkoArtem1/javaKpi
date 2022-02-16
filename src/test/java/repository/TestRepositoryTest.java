package repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.com.zinchenko.persistence.TestDataGenerator;
import ua.com.zinchenko.persistence.TestRepository;
import ua.com.zinchenko.persistence.TestRepositoryInMemoryImpl;
import ua.com.zinchenko.service.model.Test;

import java.util.List;
import java.util.Map;


//we use init data from TestRepositoryImpl class for testing
@ExtendWith(MockitoExtension.class)
public class TestRepositoryTest {

    private static TestRepository testRepository;

    @BeforeAll
    static void initialize() {
        testRepository = new TestRepositoryInMemoryImpl(new TestTestDataGenerator());
    }

    @org.junit.jupiter.api.Test
    void getAllTests() {
        Assertions.assertEquals(3, testRepository.getAllTests().length);
    }

    @org.junit.jupiter.api.Test
    void getTestBySubject() {
        Assertions.assertEquals(2, testRepository.getTestsBySubject("math").length);
    }

    @org.junit.jupiter.api.Test
    void getTestByForm() {
        Assertions.assertEquals(1, testRepository.getTestsByForm("dpa").length);
    }

    @org.junit.jupiter.api.Test
    void getAllSubjects() {
        Assertions.assertEquals(List.of("Math", "Ukrainian literature"), testRepository.getAllSubjects());
    }

    @org.junit.jupiter.api.Test
    void getAllForms() {
        Assertions.assertEquals(List.of("ZNO", "DPA"), testRepository.getAllForms());
    }

    private static class TestTestDataGenerator implements TestDataGenerator {

        @Override
        public Test[] getData() {

            return new Test[]{
                    new Test(
                            "ZNO",
                            "Math",
                            "1 + 1 = ?",
                            Map.of(1, "1", 2, "2", 3, "3", 4, "4"),
                            List.of(1)
                    ),
                    new Test(
                            "ZNO",
                            "Math",
                            "3 / 0 = ?",
                            Map.of(1, "1", 2, "2", 3, "3", 4, "can't divide by zero"),
                            List.of(4)
                    ),
                    new Test(
                            "DPA",
                            "Ukrainian literature",
                            "Косач - це справжнє прізвище автора твору",
                            Map.of(1, "«Чари ночі»", 2, "«Блакитна Панна»", 3, "«Contra spem spero!»", 4, "«Момент»"),
                            List.of(3))
            };
        }
    }
}
