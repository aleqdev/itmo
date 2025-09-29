package custom.pikachu;

import ru.ifmo.se.pokemon.*;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(35, 55, 40, 50, 50, 90);
        
        setMove(new custom.pikachu.moves.ChargeBeam(),
                new custom.pikachu.moves.WildCharge(),
                new custom.pikachu.moves.Agility());
    }
}
