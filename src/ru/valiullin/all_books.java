package ru.valiullin;

import java.util.Arrays;

public class all_books extends library {
    private String[] booksArray = new String[] {"book#0","book #1","book #2","book #3"};
    protected String giveNumABook(int bookNum){ return this.booksArray[bookNum]; }

    public void listOfBooks() {
        System.out.print("Ввыберите книгу из списка: ");
        String list = Arrays.toString(booksArray);
        list = list.replaceAll("\\[","").replaceAll("\\]","");
        System.out.println(list);
    }

    public void giveABook(int bookNum) {
        //System.out.println(all_books.length);
        if(bookNum >= this.booksArray.length) {
            System.out.println("Этой книги нет сейчас в библиотеке");
        } else {
            System.out.println("Возьмите книгу: " + giveNumABook(bookNum));
        }
    }
}
