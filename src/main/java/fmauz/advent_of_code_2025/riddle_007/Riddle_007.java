package fmauz.advent_of_code_2025.riddle_007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmauz
 */
public class Riddle_007 {

    private final static String DATA_LOCATION = "src/main/resources/riddle_007/data.txt";

    public static void main(String[] args) throws Exception {
        Solver solver = new Solver();
        List<String> map = new ArrayList<>();
        try (var br = new BufferedReader(new FileReader(DATA_LOCATION))) {
            String line;
            while ((line = br.readLine()) != null) {
                map.add(line);
            }
        }

        System.out.println("Total splits " + solver.solveTachyonSplit(map));
        System.out.println("Total timelines " + solver.getTimeLines());
    }
}
