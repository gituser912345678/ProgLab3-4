package enums;

public enum SmallLocation {
    RAMP("Пандус", 30, 10, 30, 50, 0, 0, 0),
    CYLINDER("Цилиндр", 30, 20, 100, 50, 0, 0, 0),
    DESCENT("каменное крошево", 30, 20, 100, 0, 300, 0, 0),
    BUILDING("Маленькие ветхие здания", 0, 0, 100, 100, 300, 0, 0);

    private final String name;
    private final int DifficultyLevel;
    private final int MindDamage;
    private final int len;
    private final int southX;
    private final int westX;
    private final int northX;
    private final int eastX;

    SmallLocation(String name, int DifficultyLevel, int MindDamage, int len, int eastX, int northX, int westX, int southX) {
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