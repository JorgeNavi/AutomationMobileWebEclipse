package automation.webMobile.pages;

public class Locators {

    public static final String DEMO_QA_URL = "https://demoqa.com";

    public static final String USER_FULL_NAME = "//input[@id='userName']";
    public static final String USER_FIRST_NAME = "//input[@id='firstName']";
    public static final String USER_LAST_NAME = "//input[@id='lastName']";
    public static final String USER_EMAIL = "//input[@id='userEmail']";
    public static final String USER_MOBILE_NUMBER = "//input[@id='userNumber']";
    public static final String USER_DATE_BIRTH = "//input[@id='dateOfBirthInput']";
    public static final String USER_AGE = "//input[@id='age']";
    public static final String USER_SALARY = "//input[@id='salary']";
    public static final String USER_HOBBIES_READ = "//input[@id='hobbies-checkbox-2']";
    public static final String USER_DEPARTMENT = "//input[@id='department']";
    public static final String USER_CURRENT_ADDRESS = "//textarea[@id='currentAddress']";
    public static final String USER_PERMANENT_ADDRESS = "//textarea[@id='permanentAddress']";

    public static final String GENDER_RADIO_BUTTON = "//input[@id='gender-radio-1']";
    public static final String IMPRESSIVE_LABEL = "//label[@for='impressiveRadio']";

    public static final String GREAT_LABEL_FORMS = "//div[contains(@class, 'card-body')]/h5[text()='Forms']";
    public static final String PRACTICE_FORM_LABEL = "//span[text()='Practice Form']";
    public static final String SUBMIT_BUTTON = "//button[@id='submit']";

    public static final String GREAT_LABEL_ALERTS = "//div[@class='header-text' and contains(., 'Alerts, Frame & Windows')]";
    public static final String ALERTS_LABEL = "//span[text()='Alerts']";
    public static final String FIRST_ALERT_BUTTON = "//button[@id='alertButton']";
    public static final String TIMER_ALERT_BUTTON = "//button[@id='timerAlertButton']";
    public static final String CONFIRM_ALERT_BUTTON = "//button[@id='confirmButton']";
    public static final String PROMPT_ALERT_BUTTON = "//button[@id='promtButton']";

    public static final String GREAT_LABEL_ELEMENTS = "(//div[@class='card mt-4 top-card'])[1]";
    public static final String TEXT_BOX_BUTTON = "//li[@class='btn btn-light ' and contains(., 'Text Box')]";
    public static final String CHECK_BOX_LABEL = "//li[@class='btn btn-light ' and contains(., 'Check Box')]";
    public static final String CHECK_BOX_CIRCLE = "//span[@class='rct-checkbox']";
    public static final String RADIO_BUTTON = "//li[@class='btn btn-light ' and contains(., 'Radio Button')]";

    public static final String GREAT_LABEL_WEB_TABLES = "//li[@class='btn btn-light ' and contains(., 'Web Tables')]";
    public static final String NEW_RECORD_BUTTON = "//button[@id='addNewRecordButton']";
    public static final String EDIT_RECORD_BUTTON = "(//span[@title='Edit'])[4]";
    public static final String DELETE_RECORD_BUTTON = "(//span[@title='Delete'])[4]";

    private Locators() {

    }
}