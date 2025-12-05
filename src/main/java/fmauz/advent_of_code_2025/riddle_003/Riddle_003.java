package fmauz.advent_of_code_2025.riddle_003;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author fmauz
 */
public class Riddle_003 {

    private final static String DATA_LOCATION = "src/main/resources/riddle_003/data.txt";

    public static void main(String[] args) throws Exception {
        BankResolver solver = new BankResolver();
        int joltage = 0;
        try (var br = new BufferedReader(new FileReader(DATA_LOCATION))) {
            String line;
            while ((line = br.readLine()) != null) {
                joltage += solver.resolveBank(line);
            }
        }

        System.out.println("Total joltage " + joltage);
    }
}
