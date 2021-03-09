package sample;

import java.util.ArrayList;
import java.util.Collections;

public class FlightManifest {

    private ArrayList<Traveler> travelerList;

    public FlightManifest() {
        travelerList = new ArrayList<>();
    }

    public void addTraveler(Traveler t) {
        travelerList.add(t);
    }

    public ArrayList<Traveler> getTravelerList() {
       return travelerList;
    }


}
