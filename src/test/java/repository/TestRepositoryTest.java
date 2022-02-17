package repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.com.zinchenko.persistence.DataGenerator;
import ua.com.zinchenko.persistence.TestRepository;
import ua.com.zinchenko.persistence.TestRepositoryInMemoryImpl;
import ua.com.zinchenko.service.model.Test;


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
        Assertions.assertArrayEquals(new String[]{"Math", "Ukrainian literature"}, testRepository.getAllSubjects());
    }

    @org.junit.jupiter.api.Test
    void getAllForms() {
        Assertions.assertArrayEquals(new String[]{"ZNO", "DPA"}, testRepository.getAllForms());
    }

    private static class TestTestDataGenerator implements DataGenerator {

        @Override
        public Test[] getTestsData() {

            return new Test[]{
                    new Test(
                            "ZNO",
                            "Math",
                            "1 + 1 = ?",
                            new String[]{"1", "2", "3", "4"},
                            new Integer[]{1}
                    ),
                    new Test(
                            "ZNO",
                            "Math",
                            "3 / 0 = ?",
                            new String[]{"1", "2", "3", "can't divide by zero"},
                            new Integer[]{4}
                    ),
                    new Test(
                            "DPA",
                            "Ukrainian literature",
                            "Косач - це справжнє прізвище автора твору",
                            new String[]{"«Чари ночі»", "«Блакитна Панна»", "«Contra spem spero!»", "«Момент»"},
                            new Integer[]{3}
                    )
            };
        }
    }
}
