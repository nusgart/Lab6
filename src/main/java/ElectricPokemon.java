/**
 * Our specialty ElectricPokemon that inherits from our Pokemon class.
 */
public class ElectricPokemon extends Pokemon {
    /**
     * The value we will be setting our specialty probability to.
     */
    final double specProb = 0.2;
    /**
     * We now have a specialty attack for the electric pokemon! Thunderbolt attack!
     */
    public String specialtyAttack;
    /**
     * The probability that we execute the specialty attack.
     */
    public double specialtyProbability;

    /**
     * Our ElectricPokemon constructor.
     * Constructs a new ElectricPokemon with the Pokemon Type of electric.
     * ElectricPokemon's specialty attack is THUNDERBOLT
     */
    public ElectricPokemon() {
        pokeType = PokemonType.ELECTRIC;
        specialtyAttack = "THUNDERBOLT";
        specialtyProbability = specProb;
    }

}
