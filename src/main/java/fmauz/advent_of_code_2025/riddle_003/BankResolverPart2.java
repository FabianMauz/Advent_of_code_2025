package fmauz.advent_of_code_2025.riddle_003;

/**
 *
 * @author fmauz
 */
public class BankResolverPart2 {

    public long resolveBank(String batteries, int batteryAmount) {
        String joltageString = "";
        for (int i = batteryAmount - 1; i >= 0; i--) {
            int bestJoltage = (int) batteries.charAt(0);
            int positionOfBestJoltage = 0;
            for (int j = 1; j < batteries.length() - i; j++) {
                int batteryValue = (int) batteries.charAt(j);
                if (bestJoltage < batteryValue) {
                    bestJoltage = batteryValue;
                    positionOfBestJoltage = j;
                }
            }
            StringBuilder sb = new StringBuilder(batteries);
            for (int k = 0; k <= positionOfBestJoltage; k++) {
                sb.setCharAt(k, '/');
            }

            batteries = sb.toString();

            joltageString += (char) bestJoltage;
        }
        return Long.parseLong(joltageString);
    }
}
