package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.com.zinchenko.persistence.TestRepository;
import ua.com.zinchenko.service.TestService;
import ua.com.zinchenko.service.TestServiceImpl;
import ua.com.zinchenko.service.model.Test;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    private final static Test[] TESTS = {
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
    private TestService testService;
    @Mock
    private TestRepository testRepository;

    @BeforeEach
    void setUp() {
        testService = new TestServiceImpl(testRepository);
    }

    @org.junit.jupiter.api.Test
    void getAllTests() {
        Mockito.when(testRepository.getAllTests()).thenReturn(TESTS);
        Assertions.assertEquals(TESTS, testService.getAllTests());
    }

    @org.junit.jupiter.api.Test
    void getTestBySubject() {
        Mockito.when(testRepository.getTestsBySubject("test")).thenReturn(TESTS);
        Assertions.assertEquals(TESTS, testService.getTestsBySubject("test"));
    }

    @org.junit.jupiter.api.Test
    void getTestByForm() {
        Mockito.when(testRepository.getTestsByForm("test")).thenReturn(TESTS);
        Assertions.assertEquals(TESTS, testService.getTestsByForm("test"));
    }

    @org.junit.jupiter.api.Test
    void getAllSubjects() {
        String[] subjects = new String[]{"test1", "test2"};

        Mockito.when(testRepository.getAllSubjects()).thenReturn(subjects);
        Assertions.assertEquals(subjects, testService.getAllSubjects());
    }

    @org.junit.jupiter.api.Test
    void getAllForms() {
        String[] forms = new String[]{"test1", "test2"};

        Mockito.when(testRepository.getAllForms()).thenReturn(forms);
        Assertions.assertEquals(forms, testService.getAllForms());
    }
}
