package ru.valiullin;


public class library {
    //private int[] readingRooms = new int[]{101,201,301,401};
    private String fullname;


    public void addYourFullName(String fullName) {
        this.fullname = fullName;
        System.out.println("Вы записались как " + fullName);
    }
}
