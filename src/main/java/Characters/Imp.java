package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;

public class Imp extends Enemy {
    public Imp(int healthPoints, IAffectHealthPoints weapon, IProtect protective) {
        super(healthPoints, weapon, protective);
    }
}
