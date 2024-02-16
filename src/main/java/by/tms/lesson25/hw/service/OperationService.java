package by.tms.lesson25.hw.service;

import by.tms.lesson25.hw.model.Operation;
import by.tms.lesson25.hw.storage.InMemoryOperationStorage;

public class OperationService {
    private static final InMemoryOperationStorage inMemoryOperationStorage = new InMemoryOperationStorage();
    public Operation calculate(Operation operation) {
        switch (operation.getType()){
            case "sum":
                operation.setResult(operation.getNum1() + operation.getNum2());
                inMemoryOperationStorage.save(operation);
                return operation;
            case "sub":
                operation.setResult(operation.getNum1() - operation.getNum2());
                inMemoryOperationStorage.save(operation);
                return operation;
            case "mul":
                operation.setResult(operation.getNum1() * operation.getNum2());
                inMemoryOperationStorage.save(operation);
                return operation;
            case "sep":
                operation.setResult(operation.getNum1() / operation.getNum2());
                inMemoryOperationStorage.save(operation);
                return operation;
        }
        throw new  RuntimeException();
    }
}
