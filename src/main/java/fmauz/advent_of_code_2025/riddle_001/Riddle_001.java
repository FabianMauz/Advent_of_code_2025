package fmauz.advent_of_code_2025.riddle_001;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Fabian Mauz
 */
public class Riddle_001 {

    private final static String DATA_LOCATION = "src/main/resources/riddle_001/data.txt";

    public static void main(String[] args) throws Exception {
        SafeSolver solver = new SafeSolver();
        solver.activateMode0x434C49434();
        try (var br = new BufferedReader(new FileReader(DATA_LOCATION))) {
            String line;
            while ((line = br.readLine()) != null) {
                solver.turnDial(line);
            }
        }

        System.out.println("Exceeded Zeros " + solver.getExceededZeroes());
    }
}
