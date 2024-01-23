package enums;

public enum BigLocation {
    CAVE("Пещера", 10, 30, 100, 0, 0, 0, 0),
    CITY("Мёртвый город", 20, 50, 100, 0, 100, 0, 0),
    PEAKS("Вершины гор", 0, 0, 100, 50, 300, 0, 0),
    BUILDING("Большие здания", 0, 0, 100, 0, 300, 100, 0),
    RUINS("Строй покосившихся руин", 0, 0, 0, 0, 0, 0, 0),
    MAZE("Каменный лабиринт", 0, 0, 0, 0, 0, 0, 0),
    BASE("Подножье гор", 0, 0, 0, 0, 0, 0, 0);
    private final String name;
    private final int DifficultyLevel;
    private final int MindDamage;
    private final int len;
    private final int southX;
    private final int westX;
    private final int northX;
    private final int eastX;

    BigLocation(String name, int DifficultyLevel, int MindDamage, int len, int eastX, int northX, int westX, int southX) {
        this.name = name;
        this.MindDamage = MindDamage;
        this.len = len;
        this.DifficultyLevel = DifficultyLevel;
        this.eastX = eastX;
        this.northX = northX;
        this.southX = southX;
        this.westX = westX;
    }

    public String getName() {
        return name;
    }

    public int getDifficultyLevel() {
        return DifficultyLevel;
    }

    public int getMindDamage() {
        return MindDamage;
    }

    public int getLen() {
        return len;
    }

    public int getEastX() {
        return eastX;
    }

    public int getSouthX() {
        return southX;
    }

    public int getWestX() {
        return westX;
    }

    public int getNorthX() {
        return northX;
    }
}
