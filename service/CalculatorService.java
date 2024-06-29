package service;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalculatorService {

    private static final Logger logger = Logger.getLogger(CalculatorService.class.getName());

    static {
        try {
            Handler fileHandler = new FileHandler("log.txt", true);
            fileHandler.setLevel(Level.INFO);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            Logger rootLogger = Logger.getLogger("");
            Handler[] handlers = rootLogger.getHandlers();
            for (Handler handler : handlers) {
                rootLogger.removeHandler(handler);
            }

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to initialize file logger", e);
        }
    }

    public double calcOperations(double a, double b, char op) {

        logger.info(String.format("Начало операции: %s, с параметрами %s и %s", op, a, b));

        switch (op) {
            case '+':
                double plusResult = a + b;
                logger.info(String.format("Операция сложения чисел %s и %s отдает результат %s", a, b, plusResult));
                return plusResult;
            case '-':
                double minusResult = a - b;
                logger.info(String.format("Операция вычитания чисел %s и %s отдает результат %s", a, b, minusResult));
                return minusResult;
            case '*':
                double multiResult = a * b;
                logger.info(String.format("Операция умножения чисел %s и %s отдает результат %s", a, b, multiResult));
                return multiResult;
            case '/':
                if (b != 0) {
                    double divideResult = a / b;
                    logger.info(String.format("Операция деления чисел %s и %s отдает результат %s", a, b, divideResult));
                    return divideResult;
                } else {
                    logger.severe("Деление на ноль");
                    throw new ArithmeticException("Divide by zero");
                }
            default:
                logger.severe(String.format("Операция %s не доступна", op));
                throw new ArithmeticException("Invalid operator");       
        }
    }
}
