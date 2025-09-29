package custom.vulpix;

import ru.ifmo.se.pokemon.*;

public class Vulpix extends Pokemon {
    public Vulpix(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(38, 41, 40, 50, 65, 65);
        
        setMove(new custom.vulpix.moves.Overheat(),
                new custom.vulpix.moves.Facade(),
                new custom.vulpix.moves.Rest());
    }
}
