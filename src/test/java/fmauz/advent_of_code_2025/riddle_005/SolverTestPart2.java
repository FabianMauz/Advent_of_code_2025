package fmauz.advent_of_code_2025.riddle_005;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class SolverTestPart2 {

    @Test
    public void getFreshIngredients_withExampleData_returnThree() {
        Solver2 solver = new Solver2();
        List<String> ranges = List.of("3-5", "10-14", "16-20", "12-18");
        Assertions.assertEquals(14, solver.getFreshIngredients(ranges));
    }

    @Test
    public void getFreshIngredients_withTwoDistictRanges_returnFour() {
        Solver2 solver = new Solver2();
        List<String> ranges = List.of("3-5", "8-8");
        Assertions.assertEquals(4, solver.getFreshIngredients(ranges));
    }

    @Test
    public void getFreshIngredients_withOverlappingToRightSide_returnFour() {
        Solver2 solver = new Solver2();
        List<String> ranges = List.of("3-5", "4-6");
        Assertions.assertEquals(4, solver.getFreshIngredients(ranges));
        ranges = List.of("4-6", "3-5");
        Assertions.assertEquals(4, solver.getFreshIngredients(ranges));

    }

    @Test
    public void getFreshIngredients_withOverlappingToLeftSide_returnFour() {
        Solver2 solver = new Solver2();
        List<String> ranges = List.of("1-10", "8-10");
        Assertions.assertEquals(10, solver.getFreshIngredients(ranges));
        ranges = List.of("8-10", "1-10");
        Assertions.assertEquals(10, solver.getFreshIngredients(ranges));
    }
    
    @Test
    public void getFreshIngredients_withInnerRange_returnFour() {
        Solver2 solver = new Solver2();
        List<String> ranges = List.of("1-10", "5-6");
        Assertions.assertEquals(10, solver.getFreshIngredients(ranges));
        ranges = List.of("5-6", "1-10");
        Assertions.assertEquals(10, solver.getFreshIngredients(ranges));
    }    
}
