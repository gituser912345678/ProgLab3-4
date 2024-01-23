package abstractes;

import java.util.Objects;

public abstract class Entity {
    private final String name;
    private int hp;
    private final String condition;
    private int mind;
    private int exhaustion;
    private int southX;
    private int westX;
    private int northX;
    private int eastX;

    public Entity(String name, int hp, String condition, int mind) {
        this.name = name;
        this.mind = mind;
        this.hp = hp;
        this.condition = condition;
    }

    public int getNorthX() {
        return northX;
    }

    public void setNorthX(int northX) {
        this.northX = northX;
    }

    public int getExhaustion() {
        return exhaustion;
    }

    public void setExhaustion(int exhaustion) {
        this.exhaustion = exhaustion;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getMind() {
        return mind;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, condition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return hp == entity.hp && mind == entity.mind && Objects.equals(name, entity.name) && Objects.equals(condition, entity.condition);
    }
}
