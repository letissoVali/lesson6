package ru.valiullin;

import java.util.Arrays;

public class all_books extends library{
    private String[] booksArray;
    protected String getNumABook(int bookNum){ return this.booksArray[bookNum]; }

    public void listOfBooks(String[] arrayOfBooks) {
        System.out.print("Ввыберите книгу из списка: ");
        String list = Arrays.toString(arrayOfBooks);
        list = list.replaceAll("\\[","").replaceAll("\\]","");
        System.out.println(list);
    }

    public void giveABook(int bookNum) {
        if(bookNum >= this.booksArray.length) {
            System.out.println(this.booksArray.length);
            System.out.println("Этой книги нет сейчас в библиотеке");
        } else {
            String getABook = getNumABook(bookNum);
            System.out.println("Возьмите книгу: " + getABook);
        }
    }
}
