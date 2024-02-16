package by.tms.lesson25.hw.web;

import by.tms.lesson25.hw.model.Operation;
import by.tms.lesson25.hw.storage.InMemoryOperationStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/history")
public class HistoryServlet extends HttpServlet {
    private static final InMemoryOperationStorage inMemoryOperationStorage = new InMemoryOperationStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        for (Operation operation:inMemoryOperationStorage.findAll()){
            writer.println(operation);
        }
    }
}
