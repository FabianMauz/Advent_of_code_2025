package fmauz.advent_of_code_2025.riddle_004;

/**
 *
 * @author fmauz
 */
public class SolverPart2 {

    public long getAccassiblePaperRolls(String mapOfRolls, int lineLength) {
        long rollsFetched = 0;
        boolean inAction = true;
        while (inAction) {
            inAction = false;
            for (int i = 0; i < mapOfRolls.length(); i++) {
                if (mapOfRolls.charAt(i) != '@') {
                    continue;
                }
                int neighbourRolls = 0;
                if (i == 12) {
                    int j = 0;
                }
                if (i % lineLength > 0) {
                    neighbourRolls += isBlocked(mapOfRolls, i, -1);
                    neighbourRolls += isBlocked(mapOfRolls, i, -1 + lineLength);
                    neighbourRolls += isBlocked(mapOfRolls, i, -1 - lineLength);
                }

                if ((i % lineLength) != (lineLength - 1)) {
                    neighbourRolls += isBlocked(mapOfRolls, i, +1);
                    neighbourRolls += isBlocked(mapOfRolls, i, +1 + lineLength);
                    neighbourRolls += isBlocked(mapOfRolls, i, +1 - lineLength);
                }

                neighbourRolls += isBlocked(mapOfRolls, i, -lineLength);
                neighbourRolls += isBlocked(mapOfRolls, i, +lineLength);

                if (neighbourRolls < 4) {
                    StringBuilder sb = new StringBuilder(mapOfRolls);
                    sb.setCharAt(i, '.');
                    mapOfRolls = sb.toString();
                    rollsFetched++;
                    inAction = true;
                }
            }
        }
        return rollsFetched;
    }

    private int isBlocked(String map, int posiotion, int delta) {
        try {
            return map.charAt(posiotion + delta) == '@' ? 1 : 0;

        } catch (Exception e) {
            return 0;
        }
    }

}
