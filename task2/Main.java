public class Main {

    public static void main(String[] args) {
        Human ivan = new Human("Иван", true);
        Human petr = new Human("Петр", false);

        Cupboard cupboardOne = new Cupboard(true);
        Cupboard cupboardTwo = new Cupboard(false);

        ivan.open(cupboardOne);
        ivan.open(cupboardTwo);
        petr.open(cupboardOne);
        petr.open(cupboardTwo);
    }
}