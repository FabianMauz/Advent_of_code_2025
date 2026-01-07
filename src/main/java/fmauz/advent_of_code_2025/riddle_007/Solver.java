package fmauz.advent_of_code_2025.riddle_007;

import java.util.List;

/**
 *
 * @author fmauz
 */
public class Solver {

    public static NodeList nodeList = new NodeList();
    private long timeLines = 1;

    public long solveTachyonSplit(List<String> map) {
        long splits = 0;

        for (int lineNumber = 0; lineNumber < map.size() - 1; lineNumber++) {
            int dividersInLine = 0;
            String line = map.get(lineNumber);
            StringBuilder nextLine = new StringBuilder(map.get(lineNumber + 1));
            for (int position = 0; position < line.length(); position++) {
                if (line.charAt(position) == '|' || line.charAt(position) == 'S') {

                    if (nextLine.charAt(position) == '^') {
                        splits++;
                        dividersInLine++;
                        nextLine.setCharAt(position - 1, '|');

                        nextLine.setCharAt(position + 1, '|');

                    } else {
                        nextLine.setCharAt(position, '|');

                    }
                }
            }
            if (dividersInLine > 0) {
                timeLines += Math.pow(2d, dividersInLine - 1);
            }
            map.set(lineNumber + 1, nextLine.toString());

        }

        return splits;
    }

    public long getTimeLines() {
        return this.timeLines;
    }

}
