package fmauz.advent_of_code_2025.riddle_003;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author fmauz
 */
public class Riddle_003_Part2 {

    private final static String DATA_LOCATION = "src/main/resources/riddle_003/data.txt";

    public static void main(String[] args) throws Exception {
        BankResolverPart2 solver = new BankResolverPart2();
        long joltage = 0;
        try (var br = new BufferedReader(new FileReader(DATA_LOCATION))) {
            String line;
            while ((line = br.readLine()) != null) {
                joltage += solver.resolveBank(line,12);
            }
        }

        System.out.println("Total joltage " + joltage);
    }
}
