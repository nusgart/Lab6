/**
 * Our specialty WaterPokemon that inherits from our Pokemon class.
 */
public class WaterPokemon extends Pokemon {

    /**
     * The value we will be setting our specialty probability to.
     */
    final double specProb = 0.2;

    /**
     * Our WaterPokemon constructor.
     * Constructs a new WaterPokemon with the Pokemon Type of water.
     * WaterPokemon's specialty attack is HYDRO CANNON
     *
     */
    public WaterPokemon() {
        pokeType = PokemonType.WATER;
        specialtyAttack = "HYDRO CANNON";
        specialtyProbability = specProb;
    }
}
