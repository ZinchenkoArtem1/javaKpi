package ua.com.zinchenko.persistence;

import ua.com.zinchenko.service.model.Test;

import java.util.List;
import java.util.Map;

public class TestRepositoryImpl implements TestRepository {

    private final Test[] tests = new Test[10];

    public TestRepositoryImpl() {
        init();
    }

    private void init() {
        tests[0] = new Test(
                "ZNO",
                "Math",
                "1 + 1 = ?",
                Map.of(1, "1", 2, "2", 3, "3", 4, "4"),
                List.of(1)
        );
        tests[1] = new Test(
                "ZNO",
                "Math",
                "3 / 0 = ?",
                Map.of(1, "1", 2, "2", 3, "3", 4, "can't divide by zero"),
                List.of(4)
        );
        tests[2] = new Test(
                "ZNO",
                "Math",
                "2 + 3 = ?", Map.of(1, "1", 2, "5", 3, "3", 4, "4"),
                List.of(2)
        );
        tests[3] = new Test(
                "ZNO",
                "Ukrainian literature",
                "Косач - це справжнє прізвище автора твору",
                Map.of(1, "«Чари ночі»", 2, "«Блакитна Панна»", 3, "«Contra spem spero!»", 4, "«Момент»"),
                List.of(3)
        );
        tests[4] = new Test(
                "ZNO", "Ukrainian literature",
                "Трагічні події серпня 1919 року зображені у творі",
                Map.of(1, "«За мить щастя»", 2, "«Подвійне коло»", 3, "«Земля»", 4, "«Україна в огні»"),
                List.of(2)
        );
        tests[5] = new Test(
                "DPA", "Math", "10 + 10 = ?", Map.of(1, "1", 2, "20", 3, "3", 4, "4"),
                List.of(2)
        );
        tests[6] = new Test(
                "DPA", "Math", "2 * 3 = ?", Map.of(1, "1", 2, "5", 3, "6", 4, "4"),
                List.of(3)
        );
        tests[7] = new Test(
                "DPA", "Math", "3 / 2 = ?", Map.of(1, "1", 2, "5", 3, "3", 4, "1.5"),
                List.of(4)
        );
        tests[8] = new Test(
                "DPA",
                "Ukrainian literature",
                "Життя українців Зеленого Клину змалював у своєму творі",
                Map.of(1, "Григір Тютюнник", 2, "Юрій Яновський", 3, "Володимир Винниченко", 4, "Іван Багряний"),
                List.of(4)
        );
        tests[9] = new Test(
                "DPA",
                "Ukrainian literature",
                "У повісті «Маруся» кохання з першого погляду Василя й Марусі є - ?",
                Map.of(1, "експозицією", 2, "зав'язкою", 3, "розвитком дії", 4, "кульмінацією"),
                List.of(2)
        );
    }
}
