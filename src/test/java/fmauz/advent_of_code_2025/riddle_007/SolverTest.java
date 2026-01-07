package fmauz.advent_of_code_2025.riddle_007;

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
    public void solveTachyonSplit_withExampleData_returns21And40() {
        List<String> map = new ArrayList<>();
        map.add(".......S.......");
        map.add("...............");
        map.add(".......^.......");
        map.add("...............");
        map.add("......^.^......");
        map.add("...............");
        map.add(".....^.^.^.....");
        map.add("...............");
        map.add("....^.^...^....");
        map.add("...............");
        map.add("...^.^...^.^...");
        map.add("...............");
        map.add("..^...^.....^..");
        map.add("...............");
        map.add(".^.^.^.^.^...^.");
        map.add("...............");
        Solver solver = new Solver();
        Assertions.assertEquals(21, solver.solveTachyonSplit(map));

        Assertions.assertEquals(40, solver.getTimeLines());
    }

    @Test
    public void solveTachyonSplit_withSmallExample_returns8() {
        List<String> map = new ArrayList<>();
        map.add(".......S.......");
        map.add("...............");
        map.add(".......^.......");
        map.add("...............");
        map.add("......^.^......");
        map.add("...............");
        map.add(".....^.^.^.....");
        map.add("...............");
        Solver solver = new Solver();
        solver.solveTachyonSplit(map);

        Assertions.assertEquals(8, solver.getTimeLines());
    }

    @Test
    public void solveTachyonSplit_withSmallExample_returns10() {
        List<String> map = new ArrayList<>();
        map.add(".......S.......");
        map.add("...............");
        map.add(".......^.......");
        map.add("...............");
        map.add("......^.^......");
        map.add("...............");
        map.add(".....^.^.^.....");
        map.add("...............");
        map.add("^...^...^......");
        map.add("...............");
        Solver solver = new Solver();
        solver.solveTachyonSplit(map);

        Assertions.assertEquals(10, solver.getTimeLines());
    }

}
