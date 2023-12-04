package software;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightPokemonStatistic implements PokemonStatistic {
    @Override
    public Map<String, Integer> calculate(List<Pokemon> pokemons) {
        Map<String, Integer> result = new HashMap<>();
        for (Pokemon pokemon : pokemons) {
            String key = toInterval(pokemon);
            result.put(key, result.getOrDefault(key, 0) + 1);
        }
        return result;
    }

    private String toInterval(Pokemon pokemon) {
        if (pokemon.weight() < 20) return "Peso ligero (<20kg)";
        if (pokemon.weight() < 80) return "Peso medio (20-80kg)";
        if (pokemon.weight() < 150) return "Peso pesado (80-150kg)";
        if (pokemon.weight() < 300) return "Muy pesado (150-300kg)";
        return "Ultra pesado (>300kg)";
    }
}
