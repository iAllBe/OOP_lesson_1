import java.util.ArrayList;
import java.util.Iterator;

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

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return fullName + " " + age;
    }

    public static ArrayList<String> findOverThirty(ArrayList<Person> person) {
        ArrayList<String> newList = new ArrayList<>();
        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getAge() > 30) {
                newList.add(next.getFullName());
            }
        }

        return newList;
    }

}
