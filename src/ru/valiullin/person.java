package ru.valiullin;

public class person extends library {
    //all_books.all_books
    private String fullname;

    public void addYourFullName(String fullName) {
        this.fullname = fullName;
        System.out.println("Вы записались как " + fullName);
    }

}
