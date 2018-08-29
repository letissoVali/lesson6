package ru.valiullin;

public class scientificBook extends all_books{
    protected String[] booksArray = new String[] {"book#110","book #111","book #112","book #113","book #114","book #115"};

    @Override
    public void addYourFullName(String fullName) {
        super.addYourFullName(fullName);
    }

    @Override
    protected String getNumABook(int bookNum) {
        all_books all_books = new all_books();
        all_books.listOfBooks(booksArray);
        return this.booksArray[bookNum];
    }

    @Override
    public void giveABook(int bookNum) {
        if(bookNum >= this.booksArray.length) {
            System.out.println("Этой книги нет сейчас в библиотеке");
        } else {
            String getABook = getNumABook(bookNum);
            System.out.println("Возьмите книгу: " + getABook);
        }
    }
}
