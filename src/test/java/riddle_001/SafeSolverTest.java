package riddle_001;

import fmauz.advent_of_code_2025.riddle_001.SafeSolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Fabian Mauz
 */
public class SafeSolverTest {

    @Test
    public void turnDial_withCommandL120_PositionAtMinuTwenty() {
        SafeSolver solver = new SafeSolver();
        solver.turnDial("L120");
        Assertions.assertEquals(30, solver.getCurrentPosition());
    }

    @Test
    public void turnDial_withCommandR230_PositionAt30() {
        SafeSolver solver = new SafeSolver();
        solver.turnDial("R230");
        Assertions.assertEquals(80, solver.getCurrentPosition());
    }

    @Test
    public void turnDial_withDataFromRiddle_ExceededZeroesAreThree() {
        SafeSolver solver = new SafeSolver();
        solver.turnDial("L68");
        solver.turnDial("L30");
        solver.turnDial("R48");
        solver.turnDial("L5");
        solver.turnDial("R60");
        solver.turnDial("L55");
        solver.turnDial("L1");
        solver.turnDial("L99");
        solver.turnDial("R14");
        solver.turnDial("L82");

        Assertions.assertEquals(3, solver.getExceededZeroes());
    }

    @Test
    public void turnDial_withDataFromRiddleInSecondMode_ExceededZeroesAreThree() {
        SafeSolver solver = new SafeSolver();
        solver.activateMode0x434C49434();
        solver.turnDial("L68");
        solver.turnDial("L30");
        solver.turnDial("R48");
        solver.turnDial("L5");
        solver.turnDial("R60");
        solver.turnDial("L55");
        solver.turnDial("L1");
        solver.turnDial("L99");
        solver.turnDial("R14");
        solver.turnDial("L82");

        Assertions.assertEquals(6, solver.getExceededZeroes());
    }

    @Test
    public void turnDial_IssueWithmultipleTurns_xxx() {
        SafeSolver solver = new SafeSolver();
        solver.activateMode0x434C49434();
        solver.turnDial("21");
        solver.turnDial("L471");

        Assertions.assertEquals(5, solver.getExceededZeroes());
    }
}
