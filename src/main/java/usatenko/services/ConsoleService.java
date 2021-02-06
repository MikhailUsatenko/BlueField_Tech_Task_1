package usatenko.services;

import usatenko.constants.CalculationConstants;
import usatenko.pojo.CalculationRequest;
import usatenko.pojo.enums.CalculationRequestMethod;

import java.util.Scanner;


public class ConsoleService {
    public static CalculationRequest initRequest() {
        log(CalculationConstants.GREETING_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        String request = scanner.nextLine();
        String[] requestArgs = request.split(" ");
        return new CalculationRequest(CalculationRequestMethod.valueOf(requestArgs[0]), requestArgs[1], requestArgs[2]);
    }

    public static void printResult(String result) {
        log(String.join("", CalculationConstants.RESULT_MESSAGE, result));
    }

    private static void log(String message) {
        System.out.println(message);
    }
}
