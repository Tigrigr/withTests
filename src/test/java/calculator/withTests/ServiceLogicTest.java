package calculator.withTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLogicTest {

    private final ServiceLogic serviceLogic = new ServiceLogic();


    @Test
    void summ() {
        int result1 = serviceLogic.summ(5, 5);
        int result2 = serviceLogic.summ(6, 6);
        assertEquals(5 + 5, result1);
        assertEquals(6 + 6, result2);
    }

    @Test
    void subtract() {
        int result1 = serviceLogic.subtract(5, 5);
        int result2 = serviceLogic.subtract(6, 6);
        assertEquals(5 - 5, result1);
        assertEquals(6 - 6, result2);
    }

    @Test
    void multiply() {
        int result1 = serviceLogic.multiply(5, 5);
        int result2 = serviceLogic.multiply(6, 6);
        assertEquals(5 * 5, result1);
        assertEquals(6 * 6, result2);
    }

    @Test
    void devide() {
        int result1 = serviceLogic.devide(5, 5);
        int result2 = serviceLogic.devide(6, 6);
        assertEquals(5 / 5, result1);
        assertEquals(6 / 6, result2);
        assertThrows(DevideException.class, () -> serviceLogic.devide(5, 0));
    }
}