package Items.Weapons;

import Items.IAffectHealthPoints;

public class Spell implements IAffectHealthPoints {
    public String name;
    public int affectPoints;

    public Spell(String name, int affectPoints){
        this.name = name;
        this.affectPoints = affectPoints;
    }

    public int getAffectPoints() {
        return this.affectPoints;
    }

}
