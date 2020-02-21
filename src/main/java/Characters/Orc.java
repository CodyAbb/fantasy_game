package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;

public class Orc extends Enemy {


    public Orc(int healthPoints, IAffectHealthPoints weapon, IProtect protective) {
        super(healthPoints, weapon, protective);
    }
}
