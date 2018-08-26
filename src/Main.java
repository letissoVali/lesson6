import ru.valiullin.*;

public class Main {
    //todo Используя полученные знания об объектно-ориентированном программировании смоделировать какую-нибудь предметную область.
    //Например: банк, университет, библиотека, склад, магазин, пруд и т.д.
    //Ограничения:
    //Минимум 3 класса
    //Наличие нескольких полей и методов
    //Использование модификаторов доступа
    //Использование принципов ООП


    public static void main(String[] args) {
        library lib = new library();
        books books = new books();
        person pers = new person();

        pers.addYourFullName("valiullinII");

        books.listOfBooks();
        books.giveABook(3);
    }
}
