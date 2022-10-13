package no.kristiania;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class getListOfbookServerlet extends HttpServlet {
    public getListOfbookServerlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        resp.setContentType("text/html");
        resp.getWriter().write("here are the books"+  req.getPathInfo());
        resp.getWriter().write("<ul>");
        for(Book books: BookRepostory.listOfBooks()){
            resp.getWriter().write("<li>" + "</>");
        }
        resp.getWriter().write("<ul/>");
    }

}
