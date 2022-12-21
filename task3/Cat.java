public class Cat extends Animal implements Vertical {

    Cat(String name, String owner, Integer age) {
        super(name, owner, age);
    }

    @Override
    public String verticalMove() {
        return "залезает на шкаф/дерево";
    }

    @Override
    public void goToHuman(Human human) {
        System.out.println(human.getName() + " зовет кошку по имени " + name);
        if (human.getName().equals(owner)) {
            System.out.println(name + " знает " + human.getName() + "(а/ю) и подходит к нему(ей)");
        } else {
            System.out.println(name + " не знает " + human.getName() + "(а/ю) и " + verticalMove());
        }
    }

}
