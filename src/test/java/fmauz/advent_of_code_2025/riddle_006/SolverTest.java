package fmauz.advent_of_code_2025.riddle_006;

import fmauz.advent_of_code_2025.riddle_006.tools.Solver;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class SolverTest {

    @Test
    public void calculateResult_withExampleData_returns4277556() {
        List<String> input = new ArrayList<>();
        input.add("123 328  51 64 ");
        input.add(" 45 64  387 23 ");
        input.add("  6 98  215 314");
        input.add("*   +   *   +  ");
        Solver solver = new Solver();
        Assertions.assertEquals(4277556, solver.calculateResult(input));
    }
}
