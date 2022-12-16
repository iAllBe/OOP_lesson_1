public abstract class Animal implements Vertical {
    protected String name;
    protected String owner;

    Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
}
