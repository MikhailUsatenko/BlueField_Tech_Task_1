package usatenko.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import usatenko.pojo.CalculationRequest;
import usatenko.pojo.enums.CalculationRequestMethod;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {

    private static String arg1 = "12345678901234567890";
    private static String arg2 = "11111111111111111111";
    private static String expectedResult = "137174210013717420998628257899862825790";

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void multiplyAlg1() {
        // arrange
        CalculationRequestMethod requestMethod = CalculationRequestMethod.alg1;
        CalculationRequest request = new CalculationRequest(requestMethod, arg1, arg2);
        // act
        String result = CalculationService.multiply(request);
        // assert
        assertEquals(expectedResult, result);
    }

    @Test
    void multiplyAlg2() {
        // arrange
        CalculationRequestMethod requestMethod = CalculationRequestMethod.alg2;
        CalculationRequest request = new CalculationRequest(requestMethod, arg1, arg2);
        // act
        String result = CalculationService.multiply(request);
        // assert
        assertEquals(expectedResult, result);
    }

    @Test
    void multiplyAlg3() {
        // arrange
        CalculationRequestMethod requestMethod = CalculationRequestMethod.alg3;
        CalculationRequest request = new CalculationRequest(requestMethod, arg1, arg2);
        // act
        Executable action = () -> CalculationService.multiply(request);
        // assert
        assertThrows(UnsupportedOperationException.class, action);
    }
}