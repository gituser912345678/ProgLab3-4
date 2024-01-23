package defualt;

import static java.lang.Math.abs;

import Interfaces.Runnable;
import abstractes.Entity;
import Interfaces.*;
import enums.Things;
import exception.FindPeopleException;
import exception.ThinkPeopleException;

public class People extends Entity implements Runnable, Climbable, Thinkable, Findable, Omitable, ButtoningUpable, GoDownable {
    private int southX;
    private int westX;
    private int northX;
    private int eastX;

    public People(String name, int hp, String condition, int mind, int southX, int westX, int northX, int eastX) {
        super(name, hp, condition, mind);
        this.eastX = eastX;
        this.westX = westX;
        this.southX = southX;
        this.northX = northX;
    }

    @Override
    public void run(Location location) {
        this.setMind(getMind() - 10);
        this.setNorthX(getNorthX() + location.getLen());
        this.setExhaustion(this.getExhaustion() + 30);
        System.out.println(this + " бежит по " + location);
    }

    @Override
    public void climb(Location location) {
        this.setMind(getMind() - 20);
        this.setExhaustion(this.getExhaustion() + 50);
        this.setNorthX(getNorthX() + location.getLen());
        System.out.println(this + " взбирается по " + location);
    }

    @Override
    public void think() throws ThinkPeopleException {
        if (this.getExhaustion() >= 60) {
            System.out.println(this + " думает о том как он устал.");
        } else {
            throw new ThinkPeopleException("Денфорт не думает");
        }

    }

    @Override
    public void find(Location location) throws FindPeopleException {
        if (abs(this.getNorthX() - location.getNorthX()) < 30 && location.getEastX() > 0) {
            System.out.println(this + " обнаружил " + location + " на востоке.");
        } else if (abs(this.getNorthX() - location.getNorthX()) < 30 && location.getWestX() > 0) {
            System.out.println(this + " обнаружил " + location + " на западе.");
        } else if(location.getWestX() == 0 && location.getEastX() == 0){
            System.out.println(this + " обнаружил " + location);
        }
    }

    @Override
    public void omit(Things thing) {
        if (getExhaustion() > 100) {
            System.out.println(this + " устало опустил " + thing.getName());
        } else {
            System.out.println(this + " опустил " + thing.getName());
        }
    }

    @Override
    public void buttoningUp(Things things) {
        System.out.println(this + " застёгивает " + things.getName());
    }

    @Override
    public void goDown() {
        int x = 0;
        class Descent{
            final String name = "спуск";
            private int MindDamage = 30;

            public int getMindDamage() {
                return MindDamage;
            }

            @Override
            public String toString() {
                return name;
            }
        }
        Descent descent = new Descent();
        this.setMind(this.getMind() - descent.getMindDamage());
        System.out.println(this + " начал " + descent);
    }
}
