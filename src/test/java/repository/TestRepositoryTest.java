package repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.com.zinchenko.persistence.TestRepository;
import ua.com.zinchenko.persistence.TestRepositoryImpl;


//we use init data from TestRepositoryImpl class for testing
@ExtendWith(MockitoExtension.class)
public class TestRepositoryTest {

    private TestRepository testRepository;

    @BeforeEach
    void setUp() {
        testRepository = new TestRepositoryImpl();
    }

    @org.junit.jupiter.api.Test
    void getAllTests() {
        Assertions.assertEquals(10, testRepository.getAllTests().length);
    }

    @org.junit.jupiter.api.Test
    void getTestBySubject() {
        Assertions.assertEquals(6, testRepository.getTestsBySubject("math").length);
    }

    @org.junit.jupiter.api.Test
    void getTestByForm() {
        Assertions.assertEquals(5, testRepository.getTestsByForm("dpa").length);
    }

    @org.junit.jupiter.api.Test
    void getAllSubjects() {
        Assertions.assertEquals(2, testRepository.getAllSubjects().size());
    }

    @org.junit.jupiter.api.Test
    void getAllForms() {
        Assertions.assertEquals(2, testRepository.getAllForms().size());
    }
}
