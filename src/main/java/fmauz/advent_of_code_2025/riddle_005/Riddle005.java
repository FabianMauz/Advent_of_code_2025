package fmauz.advent_of_code_2025.riddle_005;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmauz
 */
public class Riddle005 {

    private final static String DATA_LOCATION = "src/main/resources/riddle_005/data.txt";

    public static void main(String[] args) throws Exception {
        Solver solver = new Solver();
        boolean rangeMode = true;
        List<String> ranges = new ArrayList<>();
        List<String> ids = new ArrayList<>();
        try (var br = new BufferedReader(new FileReader(DATA_LOCATION))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.equals("")) {
                    rangeMode = false;
                    continue;
                }
                if (rangeMode) {
                    ranges.add(line);
                } else {
                    ids.add(line);
                }

            }
        }

        System.out.println("Total movable rolls " + solver.getFreshIngredients(ids, ranges));
    }
}
