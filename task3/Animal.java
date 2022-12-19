public abstract class Animal {
    protected String name;
    protected String owner;

    Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public abstract void goToHuman(Human human);

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
}
