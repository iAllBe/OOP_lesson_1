public class Dog extends Animal {

    Dog(String name, String owner, Integer age) {
        super(name, owner, age);
    }

    @Override
    public void goToHuman(Human human) {
        System.out.println(human.getName() + " зовет собаку по имени " + name);
        System.out.println("Собакам без разницы кто вы, они любят людей! Собака подходит к вам!");
    }
}
