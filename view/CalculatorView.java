package view;

import java.util.Scanner;

import controller.CalculatorController;
import model.CalculatorModel;
import service.CalculatorService;

public class CalculatorView {

    CalculatorModel cModel = new CalculatorModel();
    CalculatorService cService = new CalculatorService();
    CalculatorController cController = new CalculatorController(cModel, cService);

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Произвести вычисления");
            System.out.println("0 - Закрыть программу");

            switch (scanner.nextInt()) {
                case 1 -> calcOperations();
                case 0 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private void calcOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        cModel.setFirstNum(a);
        System.out.println("Введите операцию: ");
        char op = (char) scanner.next().charAt(0);
        cModel.setOp(op);
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        cModel.setSecondNum(b);
        cController.operationCalc();
    }
}
