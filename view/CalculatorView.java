package view;

import java.util.Scanner;

import controller.CalculatorController;
import model.CalculatorModel;
import model.ComplexNumberModel;
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
        System.out.println("Введите действительную часть первого числа: ");
        double real1 = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumberModel a = new ComplexNumberModel(real1, imaginary1);
        cModel.setFirstNum(a);
        System.out.println("Первое комплексное число: " + a);
        System.out.println("");

        System.out.println("Введите операцию: ");
        char op = (char) scanner.next().charAt(0);
        cModel.setOp(op);

        System.out.println("Введите действительную часть второго числа: ");
        double real2 = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumberModel b = new ComplexNumberModel(real2, imaginary2);
        cModel.setSecondNum(b);
        System.out.println("Первое комплексное число: " + b);
        System.out.println("");

        cController.operationCalc();
    }
}
