package fmauz.advent_of_code_2025.riddle_003;

/**
 *
 * @author fmauz
 */
public class BankResolver {

    public int resolveBank(String batteries) {
        int bestJoltage = 0;
        for (int i = 0; i < batteries.length(); i++) {
            for (int j = 0; j < batteries.length(); j++) {
                if (i > j) {
                    int b1 = Integer.valueOf(batteries.substring(i, 1 + i));
                    int b2 = Integer.valueOf(batteries.substring(j, 1 + j));

                    if (b1 + b2 * 10 > bestJoltage) {
                        bestJoltage = b1 + b2 * 10;
                    }
                }
            }
        }
        return bestJoltage;
    }
}
