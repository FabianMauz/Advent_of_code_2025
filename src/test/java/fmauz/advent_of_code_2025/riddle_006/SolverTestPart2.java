package fmauz.advent_of_code_2025.riddle_006;

import fmauz.advent_of_code_2025.riddle_006.tools.SolverPart2;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class SolverTestPart2 {

   
     @Test
    public void calculateResultPart2_withExampleData_returns3263827() {
        List<String> input = new ArrayList<>();
        input.add("123 328  51 64  ");
        input.add(" 45 64  387 23  ");
        input.add("  6 98  215 314 ");
        input.add("*   +   *   +   ");
        SolverPart2 solver = new SolverPart2();
        Assertions.assertEquals(3263827, solver.calculateResult(input));
    }
}
