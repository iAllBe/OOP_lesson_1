public class Dog extends Animal {

    Dog(String name, String owner) {
        super(name, owner);
    }

    @Override
    public String verticalMove() {
        return "* Собаки не умеют лазить по шкафам/деревьям :(";
    }
}
