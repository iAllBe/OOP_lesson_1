public abstract class Animal implements Comparable<Animal> {
    protected String name;
    protected String owner;
    protected Integer age;

    Animal(String name, String owner, Integer age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public abstract void goToHuman(Human human);

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal a) {
        return this.getAge().compareTo(a.getAge());
    }

    @Override
    public String toString() {
        return name;
    }
}
