public class Person {
    public String fullName;
    public Integer age;

    public Person(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(String fullName) {
        this(fullName, 0);
    }

    public String getFullName() {
        return fullName;
    }

}
