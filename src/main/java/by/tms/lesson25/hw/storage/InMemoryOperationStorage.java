package by.tms.lesson25.hw.storage;

import by.tms.lesson25.hw.model.Operation;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOperationStorage {
    private final static List<Operation> listOperation = new ArrayList<>();
    public void save(Operation operation) {
        listOperation.add(operation);
    }
    public List<Operation> findAll() {
        return new ArrayList<>(listOperation);
    }
}
