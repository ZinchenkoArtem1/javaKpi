package ua.com.zinchenko.ui;

public class Localization {

    public static final String MENU = """

            ---MENU---
            1. Get all tests
            2. Get all subjects
            3. Get all forms
            4. Get tests by subject
            5. Get tests by form
            6. Close program
            For choose input number of task (from 1 to 6 second inclusive):""";

    public static final String GET_SUBJECT_FROM_PLAYER = "Input subject name for search: ";

    public static final String GET_FORM_FROM_PLAYER = "Input form name for search: ";

    public static final String END_OF_PROGRAM_WORK = "---End of program---";

    public static final String NO_TEST_FOUND_WITH_FORM = "No tests were found with the form: ";

    public static final String NO_TEST_FOUND_WITH_SUBJECT = "No tests were found with the subject: ";

    public static final String BAD_TASK_NUMBER_INPUT = "You must input 1 or 6 number";
}
