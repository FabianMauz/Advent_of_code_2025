package fmauz.advent_of_code_2025.riddle_004;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author fmauz
 */
public class Riddle_004 {

    private final static String DATA_LOCATION = "src/main/resources/riddle_004/data.txt";

    public static void main(String[] args) throws Exception {
        SolverPart2 solver = new SolverPart2();
        int lineLength = 0;
        String map = "";
        try (var br = new BufferedReader(new FileReader(DATA_LOCATION))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineLength = line.length();
                map += line;
            }
        }

        System.out.println("Total movable rolls " + solver.getAccassiblePaperRolls(map, lineLength));
    }
}
