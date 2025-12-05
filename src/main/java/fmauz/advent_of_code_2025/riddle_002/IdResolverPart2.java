package fmauz.advent_of_code_2025.riddle_002;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fmauz
 */
public class IdResolverPart2 {

    Set<String> invalidIds = new HashSet();

    Set<String> resolveInvalidIds(String rangeString) {
        invalidIds.clear();

        long start = Long.parseLong(rangeString.split("-")[0]);
        long end = Long.parseLong(rangeString.split("-")[1]);

        for (long id = start; id <= end; id++) {

            checkId(String.valueOf(id));
        }

        return invalidIds;
    }

    private void checkId(String id) {

        for (int patternlength = 1; patternlength < (id.length() / 2) + 1; patternlength++) {
            String pattern = id.substring(0, patternlength);
            if (pattern.repeat(id.length() / patternlength).equals(id)) {
                invalidIds.add(id);
            }

        }
    }

}
