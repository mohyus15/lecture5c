package no.kristiania;

import java.util.ArrayList;
import java.util.List;

public class BookRepostory {
    private static List<Book> books = new ArrayList<>();
    public void add(Book book){
        add(book);
    }
    public static List<Book> listOfBooks(){
        return books;

    }
}
