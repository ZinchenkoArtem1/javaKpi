package ua.com.zinchenko.persistence;

import ua.com.zinchenko.service.model.Test;

public class InMemoryDataGenerator implements DataGenerator {

    private static final Test[] DATA_OF_TESTS = new Test[]{
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
                    "ZNO",
                    "Math",
                    "2 + 3 = ?",
                    new String[]{"1", "5", "3", "4"},
                    new Integer[]{2}
            ),
            new Test(
                    "ZNO",
                    "Ukrainian literature",
                    "Косач - це справжнє прізвище автора твору",
                    new String[]{"«Чари ночі»", "«Блакитна Панна»", "«Contra spem spero!»", "«Момент»"},
                    new Integer[]{3}
            ),
            new Test(
                    "ZNO",
                    "Ukrainian literature",
                    "Трагічні події серпня 1919 року зображені у творі",
                    new String[]{"«За мить щастя»", "«Подвійне коло»", "«Земля»", "«Україна в огні»"},
                    new Integer[]{2}
            ),
            new Test(
                    "DPA",
                    "Math",
                    "10 + 10 = ?",
                    new String[]{"1", "20", "3", "4"},
                    new Integer[]{2}
            ),
            new Test(
                    "DPA",
                    "Math",
                    "2 * 3 = ?",
                    new String[]{"1", "5", "6", "4"},
                    new Integer[]{3}
            ),
            new Test(
                    "DPA",
                    "Math",
                    "3 / 2 = ?",
                    new String[]{"1", "5", "3", "1.5"},
                    new Integer[]{4}
            ),
            new Test(
                    "DPA",
                    "Ukrainian literature",
                    "Життя українців Зеленого Клину змалював у своєму творі",
                    new String[]{"Григір Тютюнник", "Юрій Яновський", "Володимир Винниченко", "Іван Багряний"},
                    new Integer[]{4}
            ),
            new Test(
                    "DPA",
                    "Ukrainian literature",
                    "У повісті «Маруся» кохання з першого погляду Василя й Марусі є - ?",
                    new String[]{"експозицією", "зав'язкою", "розвитком дії", "кульмінацією"},
                    new Integer[]{2}
            )
    };

    @Override
    public Test[] getTestsData() {
        return DATA_OF_TESTS;
    }

}
