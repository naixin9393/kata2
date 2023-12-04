package software;

import java.util.List;
import java.util.Map;

public interface PokemonStatistic {
    Map<String, Integer> calculate(List<Pokemon> pokemons);
}
