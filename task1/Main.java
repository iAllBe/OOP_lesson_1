import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 20);
        Person vasya = new Person("Вася", 25);
        Person masha = new Person("Маша", 30);
        Person jenya = new Person("Женя", 35);
        Person ivan = new Person("Ваня", 40);
        Person ksu = new Person("Ксюша", 25);
        Person serg = new Person("Сергей", 30);

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
    }

}
