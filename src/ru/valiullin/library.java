package ru.valiullin;


public class library {
    private int[] readingRooms = new int[]{101,201,301,401};

    public void readingArea() {
        books books = new books();
        for(int i = 0; i < readingRooms.length; i++) {
            if(i == books.bookOut) {
                System.out.println("Ваша книга находится в зале: " + readingRooms[i]);
                break;
            } else {
                System.out.println("В залах нет данной книги!");
            }
        }
    }

}
