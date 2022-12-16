public class Cat extends Animal {

    public Cat(String name, String owner) {
        super(name, owner);
    }

    @Override
    public String verticalMove() {
        return "залезает на шкаф/дерево";
    }

}
