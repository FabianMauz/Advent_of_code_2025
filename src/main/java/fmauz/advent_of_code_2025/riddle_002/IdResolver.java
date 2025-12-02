package fmauz.advent_of_code_2025.riddle_002;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian Mauz
 */
public class IdResolver {

    List<String> invalidIds = new ArrayList();

    public List<String> resolveInvalidIds(String rangeString) {
        invalidIds.clear();

        long start = Long.parseLong(rangeString.split("-")[0]);
        long end = Long.parseLong(rangeString.split("-")[1]);

        for (long id = start; id <= end; id++) {
            checkId(id);
        }

        return invalidIds;
    }

    private void checkId(long id) {

        String idString = String.valueOf(id);
        if (idString.length() % 2 == 1) {
            return;
        }
        if (idString.substring(0, idString.length() / 2).equals(idString.substring(idString.length() / 2, idString.length()))) {
            invalidIds.add(idString);
        }

    }
}
