package ru.valiullin;

import java.util.Arrays;

public class books extends library {
    private String[] booksArray = new String[] {"book #1","book #2","book #3","book #4"};
    private String giveBook(int bookNum){ return this.booksArray[bookNum]; }
    protected int bookOut;

    public void listOfBooks() {
        System.out.print("Ввыберите книгу из списка: ");
        String list = Arrays.toString(booksArray);
        list = list.replaceAll("\\[","").replaceAll("\\]","");
        System.out.println(list);
    }

    public void giveABook(int bookNum) {
        //System.out.println(books.length);
        if(bookNum >= this.booksArray.length) {
            System.out.println("Этой книги нет сейчас в библиотеке");
        } else {
            bookOut = Arrays.asList(booksArray).indexOf(bookNum);
            System.out.println("Возьмите книгу: " + giveBook(bookNum));
        }
    }
}
