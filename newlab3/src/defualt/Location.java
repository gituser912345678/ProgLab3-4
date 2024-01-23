package defualt;

import java.util.Objects;

import enums.BigLocation;
import enums.SmallLocation;

public class Location {
    private String name;
    private int difficultyLevel;
    private int mindDamage;
    private int len;
    private int southX;
    private int westX;
    private int northX;
    private int eastX;


    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void setMindDamage(int mindDamage) {
        this.mindDamage = mindDamage;
    }
    public int getLen(){return len;}

    public int getEastX() {return eastX;}

    public void setEastX(int eastX) {this.eastX = eastX;}

    public int getSouthX() {return southX;}

    public void setSouthX(int southX) {this.southX = southX;}

    public int getWestX() {return westX;}

    public void setWestX(int westX) {this.westX = westX;}

    public int getNorthX() {return northX;}

    public void setNorthX(int northX) {this.northX = northX;}

    public void setName(String name) {
        this.name = name;
    }

    public void smallLocation(SmallLocation smallLocation) {
        this.name = smallLocation.getName();
        this.mindDamage = smallLocation.getMindDamage();
        this.len = smallLocation.getLen();
        this.difficultyLevel = smallLocation.getDifficultyLevel();
        this.eastX = smallLocation.getEastX();
        this.northX = smallLocation.getNorthX();
        this.westX = smallLocation.getWestX();
        this.southX = smallLocation.getSouthX();
    }

    public void bigLocation(BigLocation biglocation) {
        this.name = biglocation.getName();
        this.mindDamage = biglocation.getMindDamage();
        this.len = biglocation.getLen();
        this.difficultyLevel = biglocation.getDifficultyLevel();
        this.eastX = biglocation.getEastX();
        this.northX = biglocation.getNorthX();
        this.westX = biglocation.getWestX();
        this.southX = biglocation.getSouthX();
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Location location = (Location) o;
        return difficultyLevel == location.difficultyLevel && mindDamage == location.mindDamage && len == location.len && Objects.equals(name, location.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, difficultyLevel, mindDamage, len);
    }
}
