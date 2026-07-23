import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATest {

    private int number;

    @Before
    public void setUp() {
        System.out.println("Setup before test");
        number = 10;
    }

    @Test
    public void testAddition() {

        // Arrange
        int value = number;

        // Act
        int result = value + 5;

        // Assert
        assertEquals(15, result);
    }

    @After
    public void tearDown() {
        System.out.println("Cleanup after test");
    }
}
