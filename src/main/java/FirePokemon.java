/**
 * Our specialty FirePokemon that inherits from our Pokemon class.
 */
public class FirePokemon extends Pokemon {
    /**
     * The value we will be setting our specialty probability to.
     */
    final double specProb = 0.2;

    /**
     * Our FirePokemon constructor.
     * Constructs a new FirePokemon with the Pokemon Type of fire.
     * FirePokemon's specialty attack is FLAME THROWER
     */
    public FirePokemon() {
        pokeType = PokemonType.FIRE;
        specialtyAttack = "FLAME THROWER";
        specialtyProbability = specProb;
    }
}
