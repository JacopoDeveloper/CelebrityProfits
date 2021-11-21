package Model.Varie;

import Model.Celebrita;

import java.util.Comparator;

public class Ordinamento implements Comparator<Celebrita> {
    @Override
    public int compare(Celebrita o1, Celebrita o2) {
        int relVal = 0;

        if (o1.getPosizione() > o2.getPosizione())
            relVal = 1;

        if (o1.getPosizione() < o2.getPosizione())
            relVal = -1;

        return relVal;
    }
}
