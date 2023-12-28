package com.carlocodes.reviewer.chapter.two.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        groupingBookByGenre();
    }

    public static void groupingBookByGenre() {
        Genre programming = new Genre();
        programming.setName("Programming");

        Book java = new Book();
        java.setGenre(programming);
        java.setName("Java");

        Book cpp = new Book();
        cpp.setGenre(programming);
        cpp.setName("C++");

        Genre console = new Genre();
        console.setName("Console");

        Book nsw = new Book();
        nsw.setGenre(console);
        nsw.setName("Nintendo Switch");

        Book ps5 = new Book();
        ps5.setGenre(console);
        nsw.setName("Playstation 5");

        List<Book> books = new ArrayList<>();
        books.add(java);
        books.add(cpp);
        books.add(nsw);
        books.add(ps5);

        Map<Genre, List<Book>> booksByGenre = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));

        System.out.println(booksByGenre);
    }
}
