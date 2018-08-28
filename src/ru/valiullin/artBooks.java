package ru.valiullin;

public class artBooks extends all_books{
    private String[] booksArray = new String[] {"book#100","book #101","book #102","book #103"};

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
}
