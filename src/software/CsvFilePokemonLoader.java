package software;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsvFilePokemonLoader implements PokemonLoader {
    private final File file;

    public CsvFilePokemonLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Pokemon> load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            return load(reader);
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    private List<Pokemon> load(BufferedReader reader) throws IOException {
        List<Pokemon> result = new ArrayList<>();
        reader.readLine();
        while (true) {
            String line = reader.readLine();
            if (line == null) return result;
            result.add(toPokemon(line));
        }
    }

    private Pokemon toPokemon(String line) {
        String[] attributes = line.split(",");

        return new Pokemon(
                attributes[1],
                attributes[3],
                attributes[4],
                Double.parseDouble(attributes[5]),
                Double.parseDouble(attributes[6])
        );
    }
}
