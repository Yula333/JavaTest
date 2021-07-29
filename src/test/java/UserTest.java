import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserTest {

    User user = null;

    @BeforeAll
    @DisplayName("Проверка создания объекта без передачи параметров")
    public void setUp() {
        user = new User();
    }

    @AfterAll
    public void tearDown() {
        user = null;
    }

    @Test
    @DisplayName("Проверка создания объекта с двумя параметрами")
    public void testCreateObject() {
        User user = new User("Bob", "bob@example.com");
        assertEquals("Bob", user.getLogin());
        assertEquals("bob@example.com", user.getEmail());
    }

        @Test
        @DisplayName("Установка логина")
        public void testSetLogin() {
            user.setLogin("Somebody"); // Корректная установка
            // Проверяем установилось ли
            assertEquals("Somebody", user.getLogin());

            // Неверная установка
            // Проверяем вернула ли функция результат false
            assertFalse(user.setLogin("Some"));
        }

        @Test
        @DisplayName("Установка email")
        public void testSetEmail() {
            user.setEmail("bob@example.com"); // Корректная установка
            // Проверяем установилось ли
            assertEquals("bob@example.com", user.getEmail());

            // Неверная установка
            // Проверяем вернула ли функция результат false
            assertFalse(user.setEmail("bob@examplecom"));
            assertFalse(user.setEmail("bobexample.com"));
        }
}

