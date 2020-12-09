import java.util.Random;

/** */
public class Goblin extends Enemy {

    /**
     * Goblin construcor construct the health and name of Goblin and generates item
     */
    public Goblin() {
        super("Goblin ", 5, ItemGenerator.getInstance().generateItem());
    }

    /**
     * * attack action method 
     * @param e Enity that will be attacked
	 * @return the name of the Enemy plus the amount of damage in a string 
     */
    @Override
    public String attack(Entity e) {
        Random rand = new Random();
        int damage = rand.nextInt(4);
        e.takeDamage(damage);
        if (damage == 0) return getName() + " hits you, but it is missed";
        return getName() + " hits you and does " + damage + " damages.\n";
    }
}
