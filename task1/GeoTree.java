import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    /**
     * Добавление двусторонней связи родителя с предком
     * @param parent Родитель
     * @param children Предок
     */
    public void addParentChildre(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    /**
     * Добавление связи супругов
     * @param oneSpouse Первый супруг
     * @param twoSpouse Второй супруг
     */
    public void addSpouse(Person oneSpouse, Person twoSpouse) {
        tree.add(new Node(oneSpouse, Relationship.spouse, twoSpouse));
        tree.add(new Node(twoSpouse, Relationship.spouse, oneSpouse));
    }

}
