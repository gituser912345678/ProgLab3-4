package enums;

public enum Things {
    BAG("рюкзак"),
    BUTTONS("пуговицы");
    private String name;

    Things(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
