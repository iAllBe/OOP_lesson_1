public class Main {

    public static void main(String[] args) {
        Human ivan = new Human("Иван");

        Cat barsik = new Cat("Барсик", "Иван");
        Cat myrzik = new Cat("Мурзик", "Петр");

        ivan.calling(barsik);
        ivan.calling(myrzik);
    }
}