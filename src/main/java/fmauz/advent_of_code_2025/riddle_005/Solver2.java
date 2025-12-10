package fmauz.advent_of_code_2025.riddle_005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author fmauz
 */
public class Solver2 {

    public long getFreshIngredients(List<String> rangeStrings) {
        Set<String> ids = new HashSet<>();
        List<long[]> ranges = parseRanges(rangeStrings);
        Comparator<long[]> comparator = (v1, v2) -> Long.compare(v1[0], v2[0]);

        Collections.sort(ranges, comparator.reversed());
        boolean listChanged = true;
        int turns = 0;
        while (listChanged) {
            turns++;
            listChanged = false;
            Collections.sort(ranges, comparator.reversed());
            for (int i = ranges.size() - 2; i >= 0; i--) {
                long[] firstRange = ranges.get(i);
                long[] secondRange = ranges.get(i + 1);
                long a1 = firstRange[0];
                long e1 = firstRange[1];
                long a2 = secondRange[0];
                long e2 = secondRange[1];
                if (e1 < a2 || e2 < a1) {

                } else if (a1 <= a2 && e1 >= e2) {
                    ranges.remove(firstRange);
                    ranges.remove(secondRange);
                    long x = Math.min(a2, a1);
                    long y = Math.max(e1, e2);
                    ranges.add(new long[]{x, y});
                    listChanged = true;
                } else if (a2 <= a1 && e2 <= e1) {
                    ranges.remove(firstRange);
                    ranges.remove(secondRange);
                    long x = Math.min(a2, a1);
                    long y = Math.max(e1, e2);
                    ranges.add(new long[]{x, y});
                    listChanged = true;
                } else if (a1 <= a2 && e1 <= e2) {
                    ranges.remove(firstRange);
                    ranges.remove(secondRange);
                    long x = Math.min(a2, a1);
                    long y = Math.max(e1, e2);
                    ranges.add(new long[]{x, y});
                    listChanged = true;
                } else if (a1 <= a2 && e1 >= e2) {
                    ranges.remove(secondRange);
                } else if (a1 >= a1 && e1 <= e2) {
                    ranges.remove(firstRange);
                }

            }
        }
        return getAmountOfIds(ranges);
    }

    private long getAmountOfIds(List<long[]> idRanges) {
        long amount = 0;
        for (long[] range : idRanges) {
            amount += range[1] - range[0] + 1;
        }
        return amount;
    }

    private List<long[]> parseRanges(List<String> rangeStrings) {
        List<long[]> ranges = new ArrayList<>();
        for (String range : rangeStrings) {
            ranges.add(new long[]{
                Long.parseLong(range.split("-")[0]),
                Long.parseLong(range.split("-")[1])
            });
        }
        return ranges;
    }
}
