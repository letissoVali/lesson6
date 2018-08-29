package ru.valiullin;


import com.sun.xml.internal.bind.api.ErrorListener;

public class library {
    //protected int[] readingRooms = new int[]{101,201,301,401};
    private String fullname;


    public void addYourFullName(String fullName) {
        this.fullname = fullName;
        if(this.fullname == "") {
            System.out.println("Запишитесь!!!");
        } else {
            System.out.println("Вы записались как " + fullName);
        }
    }
}
