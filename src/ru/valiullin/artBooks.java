package ru.valiullin;

public class artBooks extends all_books{
    private String[] booksArray = new String[] {"book#110","book #111","book #112","book #113"};

    @Override
    protected String giveNumABook(int bookNum) {
        return this.booksArray[bookNum];
    }
}
