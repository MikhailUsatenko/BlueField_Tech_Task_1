package usatenko.services;

import usatenko.pojo.CalculationRequest;

import java.math.BigInteger;

public class CalculationService {
    public static String multiply(CalculationRequest calculationRequest) {
        switch (calculationRequest.getCalculationRequestMethod()) {
            case alg1: {
                return firstCalculateMethod(calculationRequest);
            }
            case alg2: {
                return secondCalculateMethod(calculationRequest);
            }
            default: {
                throw new UnsupportedOperationException("Unsupported request method");
            }
        }
    }

    private static String firstCalculateMethod(CalculationRequest calculationRequest) {
        BigInteger firstNumber = new BigInteger(calculationRequest.getFirstNumber());
        BigInteger secondNumber = new BigInteger(calculationRequest.getSecondNumber());
        return firstNumber.multiply(secondNumber).toString();
    }

    private static String secondCalculateMethod(CalculationRequest calculationRequest) {
        String firstNumber = calculationRequest.getFirstNumber();
        String secondNumber = calculationRequest.getSecondNumber();
        char zeroChar = '0';
        int lengthOfFirstNumber = firstNumber.length();
        int lengthOfSecondNumber = secondNumber.length();
        if (lengthOfFirstNumber == 0 || lengthOfSecondNumber == 0) {
            return "0";
        }
        int[] result = new int[lengthOfFirstNumber + lengthOfSecondNumber];
        int iteratorOfFirstNumber = 0;
        int iteratorOfSecondNumber = 0;
        for (int i = lengthOfFirstNumber - 1; i >= 0; i--) {
            int carry = 0;
            int currentDigitOfFirstNumber = firstNumber.charAt(i) - zeroChar;
            iteratorOfSecondNumber = 0;
            for (int j = lengthOfSecondNumber - 1; j >= 0; j--) {
                int currentDigitOfSecondNumber = secondNumber.charAt(j) - zeroChar;
                int sum = currentDigitOfFirstNumber * currentDigitOfSecondNumber +
                        result[iteratorOfFirstNumber + iteratorOfSecondNumber] + carry;
                carry = sum / 10;
                result[iteratorOfFirstNumber + iteratorOfSecondNumber] = sum % 10;
                iteratorOfSecondNumber++;
            }
            if (carry > 0)
                result[iteratorOfFirstNumber + iteratorOfSecondNumber] += carry;
            iteratorOfFirstNumber++;
        }
        int i = result.length - 1;
        while (i >= 0 && result[i] == 0) {
            i--;
        }
        if (i == -1) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0) {
            stringBuilder.append(result[i--]);
        }
        return stringBuilder.toString();
    }
}
