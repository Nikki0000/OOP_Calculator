package model;

public class CalculatorModel {
    
    private ComplexNumberModel firstNum;
    private ComplexNumberModel secondNum;
    private char op;
    private ComplexNumberModel result;

    public ComplexNumberModel getFirstNum() {
        return firstNum;
    }

    public ComplexNumberModel getSecondNum() {
        return secondNum;
    }

    public char getOp() {
        return op;
    }

    public ComplexNumberModel getResult() {
        return result;
    }

    public void setFirstNum(ComplexNumberModel firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(ComplexNumberModel secondNum) {
        this.secondNum = secondNum;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public void setResult(ComplexNumberModel result) {
        this.result = result;
    }


}
