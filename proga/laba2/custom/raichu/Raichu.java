package custom.raichu;

import ru.ifmo.se.pokemon.*;

public final class Raichu extends Pokemon {

    public Raichu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(60, 90, 55, 90, 80, 110);

        setMove(
            new custom.raichu.moves.ChargeBeam(),
            new custom.raichu.moves.WildCharge(),
            new custom.raichu.moves.Agility(),
            new custom.raichu.moves.Confide()
        );
    }
}
