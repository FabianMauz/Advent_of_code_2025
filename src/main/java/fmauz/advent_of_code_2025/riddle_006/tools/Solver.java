package fmauz.advent_of_code_2025.riddle_006.tools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmauz
 */
public class Solver {

    public long calculateResult(List<String> rows) {
        long result = 0;
        List<long[]> rowValues = new ArrayList<>();
        String[] operators = null;
        for (String s : rows) {
            if (s.contains("*") || s.contains("+")) {
                operators = parseOperatorLine(s);
            } else {
                rowValues.add(parseValueLine(s));
            }
        }
        return calculate(rowValues, operators);
    }

    private long[] parseValueLine(String line) {
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();

        String[] values = line.split(" ");
        long[] parsedValues = new long[values.length];
        for (int i = 0; i < parsedValues.length; i++) {
            parsedValues[i] = Long.parseLong(values[i]);
        }
        return parsedValues;
    }

    private String[] parseOperatorLine(String line) {
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        return line.split(" ");
    }

    private long calculate(List<long[]> values, String[] operators) {
        long totalResult = 0;
        for (int row = 0; row < operators.length; row++) {
            totalResult += calculateRow(values, operators[row], row);
        }
        return totalResult;
    }

    private long calculateRow(List<long[]> values, String operator, int row) {
        long totalResult = 0;
        if (operator.equals("+")) {
            for (long[] value : values) {
                totalResult += value[row];
            }
        } else {
            totalResult = 1;
            for (long[] value : values) {
                totalResult *= value[row];
            }
        }
        return totalResult;
    }
}
