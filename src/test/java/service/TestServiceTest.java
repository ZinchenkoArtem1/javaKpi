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

import java.util.List;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    private TestService testService;
    @Mock
    private TestRepository testRepository;

    @BeforeEach
    void setUp() {
        testService = new TestServiceImpl(testRepository);
    }

    @org.junit.jupiter.api.Test
    void getAllTests() {
        Test[] tests = {
                new Test(),
                new Test()
        };

        Mockito.when(testRepository.getAllTests()).thenReturn(tests);
        Assertions.assertEquals(tests, testService.getAllTests());
    }

    @org.junit.jupiter.api.Test
    void getTestBySubject() {
        Test[] tests = {
                new Test().setSubject("test"),
        };

        Mockito.when(testRepository.getTestsBySubject("test")).thenReturn(tests);
        Assertions.assertEquals(tests, testService.getTestsBySubject("test"));
    }

    @org.junit.jupiter.api.Test
    void getTestByForm() {
        Test[] tests = {
                new Test().setForm("test"),
        };

        Mockito.when(testRepository.getTestsByForm("test")).thenReturn(tests);
        Assertions.assertEquals(tests, testService.getTestsByForm("test"));
    }

    @org.junit.jupiter.api.Test
    void getAllSubjects() {
        String[] subjects = new String[] {"test1", "test2"};

        Mockito.when(testRepository.getAllSubjects()).thenReturn(subjects);
        Assertions.assertEquals(subjects, testService.getAllSubjects());
    }

    @org.junit.jupiter.api.Test
    void getAllForms() {
        String[] forms = new String[] {"test1", "test2"};

        Mockito.when(testRepository.getAllForms()).thenReturn(forms);
        Assertions.assertEquals(forms, testService.getAllForms());
    }
}
