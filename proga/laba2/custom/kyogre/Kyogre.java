package custom.kyogre;

import ru.ifmo.se.pokemon.*;

public class Kyogre extends Pokemon {
    public Kyogre(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(100, 100, 90, 150, 140, 90);
        
        setMove(new custom.kyogre.moves.ScaryFace(),
                new custom.kyogre.moves.RockSlide(),
                new custom.kyogre.moves.Waterfall(),
                new custom.kyogre.moves.HydroPump());
    }
}
