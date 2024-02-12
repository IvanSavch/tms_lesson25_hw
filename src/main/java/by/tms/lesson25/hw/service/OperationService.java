package by.tms.lesson25.hw.service;

import by.tms.lesson25.hw.model.Operation;

public class OperationService {
    public Operation calculate(Operation operation) {
        switch (operation.getType()){
            case "sum":
                operation.setResult(operation.getNum1() + operation.getNum2());
                return operation;
            case "sub":
                operation.setResult(operation.getNum1() - operation.getNum2());
                return operation;
            case "mul":
                operation.setResult(operation.getNum1() * operation.getNum2());
                return operation;
            case "sep":
                operation.setResult(operation.getNum1() / operation.getNum2());
                return operation;
        }
        throw new  RuntimeException();
    }
}
