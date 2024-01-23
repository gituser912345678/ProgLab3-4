package defualt;

import Interfaces.Runnable;
import abstractes.Entity;
import Interfaces.*;

public class Animal extends Entity implements Runnable, Climbable, Thinkable {
    private int exhaustion;

    public Animal(String name, int hp, String condition, int mind) {
        super(name, hp, condition, mind);
    }

    @Override
    public void run(Location location) {
        System.out.println(this + " бежит по " + location);
    }

    @Override
    public void climb(Location location) {
    }

    @Override
    public void think() {
        System.out.println("Можно сказать коротко, что думать так, как человек, животные не умеют. Но думать по-своему – да, безусловно. Вопрос только в том, что вообще вкладывается в это понятие – «думать». У животных почти не развито абстрактное мышление. В связи с этим они не могут строить причинно-следственные связи так, как это делаем мы...\n" + "Разумеется, животные умеют и думать, и учиться, анализируя полученную информацию.");
    }
}
