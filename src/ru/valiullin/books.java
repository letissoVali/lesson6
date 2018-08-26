package ru.valiullin;

import java.util.Arrays;

public class books extends library {
    private String[] books = new String[] {"book #1","book #2","book #3","book #4"};
    String giveBook(int bookNum){ return this.books[bookNum]; }

    public void listOfBooks() {
        System.out.print("Ввыберите книгу из списка: ");
        String list = Arrays.toString(books);
        list = list.replaceAll("\\[","").replaceAll("\\]","");
        System.out.println(list);
    }

    public void giveABook(int bookNum) {
        //System.out.println(books.length);
        if(bookNum >= this.books.length) {
            System.out.println("Этой книги нет сейчас в библиотеке");
        } else {
            String book = giveBook(bookNum);
            System.out.println("Возьмите книгу " + book);
        }
    }
}
