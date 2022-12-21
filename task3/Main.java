public class Main {

    public static void main(String[] args) {
        Human ivan = new Human("Иван");

        Cat barsik = new Cat("Барсик", "Иван", 2);
        Cat myrzik = new Cat("Мурзик", "Петр", 3);

        Dog bobik = new Dog("Бобик", "Нет хозяина", 4);

        barsik.goToHuman(ivan);
        myrzik.goToHuman(ivan);
        bobik.goToHuman(ivan);

        if (barsik.compareTo(myrzik) < 0) {
            System.out.println(barsik.getName() + " моложе");
        } else {
            System.out.println(myrzik.getName() + " моложе");
        }
    }
}