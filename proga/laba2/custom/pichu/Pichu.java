package custom.pichu;

import ru.ifmo.se.pokemon.*;

public final class Pichu extends Pokemon {

    public Pichu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(20, 40, 15, 35, 35, 60);

        setMove(
            new custom.pichu.moves.ChargeBeam(),
            new custom.pichu.moves.WildCharge()
        );
    }
}
