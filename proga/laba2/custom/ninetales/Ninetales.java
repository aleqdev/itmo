package custom.ninetales;

import ru.ifmo.se.pokemon.*;

public class Ninetales extends Pokemon {
    public Ninetales(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(73, 76, 75, 81, 100, 100);
        
        setMove(new custom.ninetales.moves.Overheat(),
                new custom.ninetales.moves.Facade(),
                new custom.ninetales.moves.Rest(),
                new custom.ninetales.moves.CalmMind());
    }
}
