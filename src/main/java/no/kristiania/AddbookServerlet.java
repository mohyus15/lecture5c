package no.kristiania;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class AddbookServerlet extends HttpServlet {
    private static final Logger logger =  LoggerFactory.getLogger(AddbookServerlet.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);


        Book book = new Book();
        book.setTitle(req.getParameter("booktitle"));
        book.setAuthor(req.getParameter("authortitle"));
        logger.info("add to book title{} author {}", book);
    }
}

