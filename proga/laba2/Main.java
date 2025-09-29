import custom.kyogre.Kyogre;
import custom.ninetales.Ninetales;
import custom.pichu.Pichu;
import custom.pikachu.Pikachu;
import custom.raichu.Raichu;
import custom.vulpix.Vulpix;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();

        // Team 1
        Pokemon kyogre = new Kyogre("Kyogre", 50);
        Pokemon vulpix = new Vulpix("Vulpix", 25);
        Pokemon ninetales = new Ninetales("Ninetales", 40);

        // Team 2
        Pokemon pichu = new Pichu("Pichu", 15);
        Pokemon pikachu = new Pikachu("Pikachu", 30);
        Pokemon raichu = new Raichu("Raichu", 45);

        battle.addAlly(kyogre);
        battle.addAlly(vulpix);
        battle.addAlly(ninetales);

        battle.addFoe(pichu);
        battle.addFoe(pikachu);
        battle.addFoe(raichu);

        battle.go();
    }
}
