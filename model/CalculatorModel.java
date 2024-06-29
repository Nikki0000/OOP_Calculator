package model;

public class CalculatorModel {
    
    private double firstNum;
    private double secondNum;
    private char op;
    private double result;

    public double getFirstNum() {
        return firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public char getOp() {
        return op;
    }

    public double getResult() {
        return result;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public void setResult(double result) {
        this.result = result;
    }


}
