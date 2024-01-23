package defualt;


public class Frost {
    public void wasTryingTo(People people) {
        people.setMind(people.getMind() - 50);
        people.setHp(people.getHp() - 10);
        System.out.println("Мороз пробирал до остей " + people);
    }
}
