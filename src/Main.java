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
        artBooks artBooks = new artBooks();
        scientificBook scf = new scientificBook();

        scf.addYourFullName("ValiullinII");
        //artBooks.addYourFullName("");

        artBooks.giveABook(3);
        scf.giveABook(5);

    }
}
