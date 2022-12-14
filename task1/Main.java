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

        new Reserch(geoTree).searchForRelation(irina, Relationship.parent);
        new Reserch(geoTree).searchForRelation(ivan, Relationship.children);
        new Reserch(geoTree).searchForRelation(ksu, Relationship.spouse);
        new Reserch(geoTree).searchForAge(30);
    }

}
