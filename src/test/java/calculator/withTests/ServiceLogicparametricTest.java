package calculator.withTests;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServiceLogicparametricTest {
    private final ServiceLogic serviceLogic = new ServiceLogic();

    @MethodSource("params")
    @ParameterizedTest
    void summ(int num1, int num2) {
        int result = serviceLogic.summ(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @MethodSource("params")
    @ParameterizedTest
    void subtract(int num1, int num2) {
        int result = serviceLogic.subtract(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @MethodSource("params")
    @ParameterizedTest
    void multiply(int num1, int num2) {
        int result = serviceLogic.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @MethodSource("params")
    @ParameterizedTest
    void devide(int num1, int num2) {
        int result = serviceLogic.devide(num1, num2);
        assertEquals(num1 / num2, result);
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(3, 4),
                Arguments.of(5, 6),
                Arguments.of(7, 8)
        );
    }

}
