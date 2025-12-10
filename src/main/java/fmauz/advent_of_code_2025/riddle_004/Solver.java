package fmauz.advent_of_code_2025.riddle_004;

/**
 *
 * @author fmauz
 */
public class Solver {

    public long getAccassiblePaperRolls(String mapOfRolls, int lineLength) {
        long paperRollsAccessible = 0;
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
                paperRollsAccessible++;
                System.out.println("Position " + (int) i / 10 + ":" + i % 10);
            }
        }
        return paperRollsAccessible;
    }

    private int isBlocked(String map, int posiotion, int delta) {
        try {
            return map.charAt(posiotion + delta) == '@' ? 1 : 0;

        } catch (Exception e) {
            return 0;
        }
    }

}
