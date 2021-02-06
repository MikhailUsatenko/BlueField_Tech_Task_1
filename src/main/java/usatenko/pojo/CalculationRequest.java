package usatenko.pojo;

import usatenko.pojo.enums.CalculationRequestMethod;

public class CalculationRequest {

    private CalculationRequestMethod calculationRequestMethod;
    private String firstNumber;
    private String secondNumber;

    public CalculationRequest(CalculationRequestMethod calculationRequestMethod, String firstNumber, String secondNumber) {
        this.calculationRequestMethod = calculationRequestMethod;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public CalculationRequest() {
    }

    public CalculationRequestMethod getCalculationRequestMethod() {
        return calculationRequestMethod;
    }

    public void setCalculationRequestMethod(CalculationRequestMethod calculationRequestMethod) {
        this.calculationRequestMethod = calculationRequestMethod;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }
}
