package usatenko;

import usatenko.pojo.CalculationRequest;
import usatenko.services.CalculationService;
import usatenko.services.ConsoleService;

public class Main {
    public static void main(String[] args) {
        CalculationRequest request = ConsoleService.initRequest();
        String result = CalculationService.multiply(request);
        ConsoleService.printResult(result);
    }
}
