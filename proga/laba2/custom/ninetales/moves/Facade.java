package custom.ninetales.moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        Status status = att.getCondition();
        if (
            status == Status.BURN ||
            status == Status.POISON ||
            status == Status.PARALYZE
        ) {
            return 140;
        }
        return 70;
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
