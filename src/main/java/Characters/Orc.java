package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;

public class Orc extends Enemy {


    public Orc(String type, int healthPoints, IAffectHealthPoints weapon, IProtect protective) {
        super(type, healthPoints, weapon, protective);
    }
}
