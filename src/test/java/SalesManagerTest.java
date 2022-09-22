import org.junit.jupiter.api.*;

public class SalesManagerTest {

    @BeforeEach
    public void init() {
        System.out.println("Начало тестов");
    }

    @BeforeAll
    static void setUpApp() {
        System.out.println("Запускаюсь до выполнения всех тестов");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Запускаюсь после выполнения всех тестов");
    }

    @DisplayName("Тест1")
    @Test
    public void testMaxNull() {
        SalesManager salesManager = null;
        Assertions.assertThrows(NullPointerException.class, ()-> salesManager.max());
    }

    @DisplayName("Тест2")
    @Test
    public void testMax() {
        SalesManager salesManager = new SalesManager(new long[]{254, 804, 107, 896});
        Assertions.assertEquals(896, salesManager.max());
    }

    @DisplayName("Тест3")
    @Test
    public void testСutArithmeticMean() {
        SalesManager salesManager = new SalesManager(new long[]{254, 804, 107, 896});
        Assertions.assertEquals(529, salesManager.average());
    }
}