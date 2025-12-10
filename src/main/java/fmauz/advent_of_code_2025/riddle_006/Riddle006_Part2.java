package fmauz.advent_of_code_2025.riddle_006;

import fmauz.advent_of_code_2025.riddle_006.tools.SolverPart2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmauz
 */
public class Riddle006_Part2 {

    private final static String DATA_LOCATION = "src/main/resources/riddle_006/data.txt";

    public static void main(String[] args) throws Exception {
        SolverPart2 solver = new SolverPart2();
        List<String> lines = new ArrayList<>();
        try (var br = new BufferedReader(new FileReader(DATA_LOCATION))) {
            String line;

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }

        System.out.println("Total sum " + solver.calculateResult(lines));
    }
}
