package defualt;

import java.util.ArrayList;

public class EldersHouse {
    private final ArrayList<Elders> elders = new ArrayList<>();

    public ArrayList<Elders> getElders() {
        elders.add(new Elders("Старейшина 1", 0, "", 0));
        elders.add(new Elders("Старейшина 2", 0, "", 0));
        elders.add(new Elders("Старейшина 3", 0, "", 0));
        return elders;
    }
}
