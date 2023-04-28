import javax.swing.JOptionPane;
public class PokemonSelection {
    public Pokemon createPokemon() {
        String name = JOptionPane.showInputDialog("Enter Pokemon Name");
        String hitPoints = JOptionPane.showInputDialog("Enter Pokemon Hit Points");
        String move = JOptionPane.showInputDialog("Enter Pokemon Move");
        String movePower = JOptionPane.showInputDialog("Enter Pokemon Move Power");
        String attackSpeed = JOptionPane.showInputDialog("Enter Pokemon Attack Speed");
        return new Pokemon(name, hitPoints, move, movePower, attackSpeed);
    }

    public void assignPokemon() {
        System.out.println("Select a Pokemon and enter its stats");
        Pokemon pokemon1 = createPokemon();
        pokemon1.displayStats(Pokemon.getName(), Pokemon.getHitPoints(), Pokemon.getMove(), Pokemon.getMovePower(), Pokemon.getAttackSpeed());
    }
}
