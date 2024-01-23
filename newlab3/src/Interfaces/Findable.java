package Interfaces;

import defualt.Location;
import exception.FindPeopleException;

public interface Findable {
    void find(Location location) throws FindPeopleException;
}
