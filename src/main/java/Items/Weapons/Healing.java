package Items.Weapons;

import Items.IAffectHealthPoints;

public class Healing implements IAffectHealthPoints {
    private String name;
    private int affectPoints;

    public Healing(String name, int affectPoints){
        this.name = name;
        this.affectPoints = affectPoints;
    }

    public int getAffectPoints() {
        return this.affectPoints;
    }

}
