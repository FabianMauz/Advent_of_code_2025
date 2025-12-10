package fmauz.advent_of_code_2025.riddle_005;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class SolverTest {

    @Test
    public void getFreshIngredients_withExampleData_returnThree() {
        Solver solver = new Solver();

        List<String> ids = List.of("1", "5", "8", "11", "17", "32");
        List<String> ranges = List.of("3-5", "10-14", "16-20", "12-18");
        Assertions.assertEquals(3, solver.getFreshIngredients(ids, ranges));
    }
}
