package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;

public class Mancubus extends Enemy {
    public Mancubus(int healthPoints, IAffectHealthPoints weapon, IProtect protective) {
        super(healthPoints, weapon, protective);
    }
}
