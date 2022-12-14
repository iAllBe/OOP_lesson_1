public class Human {
    private String name;
    private Boolean hasKey;

    public Human(String name, Boolean hasKey) {
        this.name = name;
        this.hasKey = hasKey;
    }

    /**
     * Попытка открыть шкаф
     * @param cupboard Шкаф
     */
    public void open(Cupboard cupboard) {
        System.out.println(name + " пробует открыть шкаф:");
        if (hasKey) {
            if (cupboard.getOpened() == true) {
                System.out.println("Ключ не нужен, шкаф и так открыт");
            } else {
                System.out.println("Шкаф открыт ключем");
            }
        } else {
            if (cupboard.getOpened() == true) {
                System.out.println("У вас нет ключа, но шкаф и так открыт");
            } else {
                System.out.println("Шкаф закрыт, у вас нет ключа");
            }
        }
    }
}
