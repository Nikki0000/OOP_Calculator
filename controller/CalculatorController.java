package controller;

import model.CalculatorModel;
import model.ComplexNumberModel;
import service.CalculatorService;

public class CalculatorController {
    
    private CalculatorModel cModel;
    private CalculatorService cService;

    public CalculatorController(CalculatorModel cModel, CalculatorService cService) {
        this.cModel = cModel;
        this.cService = cService;
    }
    
    public void operationCalc() {
        ComplexNumberModel result = cService.calcOperations(cModel.getFirstNum(), cModel.getSecondNum(), cModel.getOp());
        cModel.setResult(result);
        System.out.println("Результат: " + result);
    }

}
