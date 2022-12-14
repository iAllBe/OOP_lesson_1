public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    /**
     * Позвать кота
     * @param cat Имя кота
     */
    public void calling(Cat cat) {
        if (cat.getOwner().equals(name)) {
            System.out.println(cat.getName() + " знает " + name + "(а/ю) и подходит к нему(ей)");
        } else {
            System.out.println(cat.getName() + " не знает " + name + "(а/ю) и уходит о него(неё)");
        }
    }
}
