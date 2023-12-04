package software;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CsvFilePokemonLoader csvFilePokemonLoader = new CsvFilePokemonLoader(new File("Pokemon.csv"));
        List<Pokemon> pokemons = csvFilePokemonLoader.load();
        System.out.println(pokemons);
        Map<String, Integer> pokemonWeight = new WeightPokemonStatistic().calculate(pokemons);
        System.out.println(pokemonWeight);
    }
}
