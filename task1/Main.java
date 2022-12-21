import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 20);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 25);
        Person jenya = new Person("Женя", 35);
        Person ivan = new Person("Ваня", 40);
        Person ksu = new Person("Ксюша", 25);
        Person serg = new Person("Сергей", 30);

        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(irina);
        listPerson.add(vasya);
        listPerson.add(masha);
        listPerson.add(jenya);
        listPerson.add(ivan);
        listPerson.add(ksu);
        listPerson.add(serg);

        System.out.println("До сортировки по возрасту: " + listPerson);
        Collections.sort(listPerson, new PersonAgeComparator());
        System.out.println("После сортировки по возрасту: " + listPerson);

        GeoTree geoTree = new GeoTree();

        geoTree.addParentChildre(irina, vasya);
        geoTree.addParentChildre(irina, masha);
        geoTree.addParentChildre(vasya, jenya);
        geoTree.addParentChildre(vasya, ivan);
        geoTree.addParentChildre(jenya, ivan);
        geoTree.addParentChildre(jenya, ivan);
        geoTree.addSpouse(ksu, serg);

        try (FileWriter writer = new FileWriter("file.txt", false)) {
            writer.write(new Reserch(geoTree).searchForRelation(irina, Relationship.parent) + '\n');
            writer.write(new Reserch(geoTree).searchForRelation(ivan, Relationship.children) + '\n');
            writer.write(new Reserch(geoTree).searchForRelation(ksu, Relationship.spouse) + '\n');
            writer.write(new Reserch(geoTree).searchForAge(30) + '\n');

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Люди старше 30 лет: " + Person.findOverThirty(listPerson));
    }

}
