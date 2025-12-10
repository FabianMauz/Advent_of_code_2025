package fmauz.advent_of_code_2025.riddle_005;

import java.util.List;

/**
 *
 * @author fmauz
 */
public class Solver {

    public long getFreshIngredients(List<String> ids, List<String> ranges) {
        long freshies = 0;
        for (String id : ids) {
            boolean isFresh = false;
            for (String range : ranges) {
                if (Long.parseLong(id) >= Long.parseLong(range.split("-")[0]) && Long.parseLong(id) <= Long.parseLong(range.split("-")[1])) {
                    isFresh = true;
                    break;
                }
            }
            if (isFresh) {
                freshies++;
            }
        }
        return freshies;
    }
}
