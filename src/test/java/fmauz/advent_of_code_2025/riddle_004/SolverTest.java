package fmauz.advent_of_code_2025.riddle_004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class SolverTest {

    @Test
    public void xx_xx_xx() {
        Solver solver = new Solver();
        String map = "..@@.@@@@.@@@.@.@.@@@@@@@.@.@@@.@@@@..@.@@.@@@@.@@.@@@@@@@.@.@.@.@.@@@@.@@@.@@@@.@@@@@@@@.@.@.@@@.@.";

        Assertions.assertEquals(13, solver.getAccassiblePaperRolls(map, 10));
    }
}
