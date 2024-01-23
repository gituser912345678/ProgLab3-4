import defualt.*;
import enums.BigLocation;
import enums.SmallLocation;
import enums.Things;
import exception.FindPeopleException;
import exception.ThinkPeopleException;

import static enums.BigLocation.*;
import static enums.SmallLocation.*;


interface ToWaitable {
    void toWait(People people);
}
public class Scene {
    static int i;
    public void history() throws ThinkPeopleException, FindPeopleException {
        People denfort = new People("Денфорт", 100, "Окэээй", 100, 0, 0, 0, 0);
        IllusoryWorld illusoryWorld = new IllusoryWorld();
        PolarWorld polarWorld = new PolarWorld();
        OurWorld ourWorld = new OurWorld();
        Air.SnowDust snowDust = new Air.SnowDust();
        Frost frost = new Frost();
        Location cave = new Location();
        Location base = new Location();
        Location maze = new Location();
        Location city = new Location();
        Location ramp = new Location();
        Location cylinder = new Location();
        Location descent = new Location();
        Location houses = new Location();
        Location building = new Location();
        Location peaks = new Location();
        Location ruins = new Location();
        EldersHouse eldersHouse = new EldersHouse();
        Sun sun = new Sun();
        Sun.Ray ray = sun.new Ray();


        for (int i = 0; i <= 2; i++) {
            switch (i) {
                case 0 -> System.out.println(eldersHouse.getElders().get(i).toString() + " cтроит купол");
                case 1 -> System.out.println(eldersHouse.getElders().get(i).toString() + " cтроит город");
                case 2 -> System.out.println(eldersHouse.getElders().get(i).toString() + " cтроит цилиндр");
            }
        }

        city.bigLocation(CITY);
        base.bigLocation(BASE);
        maze.bigLocation(MAZE);
        ruins.bigLocation(RUINS);
        cave.bigLocation(CAVE);
        ramp.smallLocation(RAMP);
        cylinder.smallLocation(CYLINDER);
        descent.smallLocation(DESCENT);
        houses.smallLocation(SmallLocation.BUILDING);
        building.bigLocation(BigLocation.BUILDING);
        peaks.bigLocation(PEAKS);
        illusoryWorld.setStats(city);

        int i = 24;
        while (i > 0) {
            denfort.run(city);
            if (i > 12) {
                denfort.setMind(60);
            }
            i -= 6;

            denfort.run(cave);
            if (i > 12) {
                denfort.setMind(60);
            }
            i -= 6;

            denfort.climb(ramp);
            denfort.think();
            if (i > 12) {
                denfort.setMind(60);
            }
            i -= 6;

            denfort.climb(cylinder);
            try {
                denfort.think();
            }
            catch (ThinkPeopleException e) {
                System.out.println("К сожалению " + e);
            }
            if (i > 12) {
                denfort.setMind(60);
            }
            i -= 6;
        }
        ourWorld.setStats(city);

        try{
            denfort.find(descent);
        }
        catch (FindPeopleException e){
            System.out.println(e);
        }

        try{
            denfort.find(peaks);
        }
        catch (FindPeopleException e){
            System.out.println(e);
        }

        try{
            denfort.find(houses);
        }
        catch (FindPeopleException e){
            System.out.println(e);
        }

        try{
            denfort.find(building);
        }
        catch (FindPeopleException e){
            System.out.println(e);
        }

        ray.toBreakThrough(ruins);
        polarWorld.setStats(city);
        snowDust.iridescent();
        snowDust.tremble();
        frost.wasTryingTo(denfort);
        denfort.buttoningUp(Things.BUTTONS);
        denfort.omit(Things.BAG);
        denfort.goDown();
        denfort.run(maze);
        denfort.run(base);

        ToWaitable plane = new ToWaitable() {
            private String name = "Самолёт";

            @Override
            public String toString() {
                Scene.i = 2;
                return name;
            }

            @Override
            public void toWait(People people) {
                System.out.println(this + " дожидается " + people);
            }
        };
        plane.toWait(denfort);
    }
}
