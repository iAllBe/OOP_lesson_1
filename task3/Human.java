public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Позвать животное
     * 
     * @param animal животное
     */
    public void calling(Animal animal) {
        System.out.println(this.name + " зовет " + (animal instanceof Cat ? "кошку!" : "собаку!"));
        if (animal instanceof Cat) {
            if (animal.getOwner().equals(name)) {
                System.out.println(animal.getName() + " знает " + name + "(а/ю) и подходит к нему(ей)");
            } else {
                System.out.println(animal.getName() + " не знает " + name + "(а/ю) и " + animal.verticalMove());
            }
        } else if (animal instanceof Dog) {
            System.out.println("Собакам без разницы кто вы, они любят людей! Собака подходит к вам!");
            System.out.println(animal.verticalMove());
        }
    }
}
