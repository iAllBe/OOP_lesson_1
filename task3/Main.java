public class Main {

    public static void main(String[] args) {
        Human ivan = new Human("Иван");

        Cat barsik = new Cat("Барсик", "Иван");
        Cat myrzik = new Cat("Мурзик", "Петр");

        Dog bobik = new Dog("Бобик", "Нет хозяина");

        ivan.calling(barsik);
        ivan.calling(myrzik);
        ivan.calling(bobik);
    }
}