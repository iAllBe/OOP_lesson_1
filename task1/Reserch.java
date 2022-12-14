import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    Set<String> resultAge = new HashSet<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        this.tree = geoTree.getTree();
    }

    /**
     * Поиск людей по отношению с человеком
     * 
     * @param p  Человек
     * @param re Отношение
     * @return
     */
    public void searchForRelation(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }

        System.out.println(p.fullName + " является " + re + " для людей: " + result);
    }

    /**
     * Поиск человека по возрасту от определенного количества лет
     * @param age С какого возраста искать
     */
    public void searchForAge(Integer age) {
        for (Node n : tree) {
            if (n.p1.age >= age) {
                resultAge.add(n.p1.fullName);
            }
        }

        System.out.println("Люди от " + age + " лет: " + resultAge);
    }

}
