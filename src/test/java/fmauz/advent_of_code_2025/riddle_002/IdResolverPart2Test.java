package fmauz.advent_of_code_2025.riddle_002;

import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class IdResolverPart2Test {

    IdResolverPart2 solver = new IdResolverPart2();

    @Test
    public void resolveInvalidIds_withExampleOne_returnsCorrectStrings() {

        Assertions.assertEquals(2, solver.resolveInvalidIds("11-22").size());
        Assertions.assertTrue(solver.resolveInvalidIds("11-22").contains("11"));
        Assertions.assertTrue(solver.resolveInvalidIds("11-22").contains("22"));

    }

    @Test
    public void resolveInvalidIds_withExampleTwo_returnsCorrectStrings() {       
        Assertions.assertEquals(2, solver.resolveInvalidIds("95-115").size());
        Assertions.assertTrue(solver.resolveInvalidIds("95-115").contains("99"));
        Assertions.assertTrue(solver.resolveInvalidIds("95-115").contains("111"));
    }

    @Test
    public void resolveInvalidIds_withExampleThree_returnsCorrectStrings() {      
        Set<String> invalidIds = solver.resolveInvalidIds("998-1012");
        Assertions.assertEquals(2, invalidIds.size());
        Assertions.assertTrue(invalidIds.contains("1010"));
        Assertions.assertTrue(invalidIds.contains("999"));
    }

    @Test
    public void resolveInvalidIds_withExampleFour_returnsCorrectStrings() {
        Assertions.assertEquals(1, solver.resolveInvalidIds("1188511880-1188511890").size());
        Assertions.assertTrue(solver.resolveInvalidIds("1188511880-1188511890").contains("1188511885"));
    }

    @Test
    public void resolveInvalidIds_withExampleFive_returnsCorrectStrings() {
        Assertions.assertEquals(1, solver.resolveInvalidIds("222220-222224").size());
        Assertions.assertTrue(solver.resolveInvalidIds("222220-222224").contains("222222"));
    }

    @Test
    public void resolveInvalidIds_withExampleSix_returnsCorrectStrings() {
        Assertions.assertEquals(0, solver.resolveInvalidIds("1698522-1698528").size());
    }

    @Test
    public void resolveInvalidIds_withExampleSeven_returnsCorrectStrings() {
        Assertions.assertEquals(1, solver.resolveInvalidIds("446443-446449").size());
        Assertions.assertTrue(solver.resolveInvalidIds("446443-446449").contains("446446"));
    }

    @Test
    public void resolveInvalidIds_withExampleEight_returnsCorrectStrings() {
        Assertions.assertEquals(1, solver.resolveInvalidIds("38593856-38593862").size());
        Assertions.assertTrue(solver.resolveInvalidIds("38593856-38593862").contains("38593859"));
    }

    @Test
    public void resolveInvalidIds_withExampleNine_returnsCorrectStrings() {
        Assertions.assertEquals(1, solver.resolveInvalidIds("565653-565659").size());
        Assertions.assertTrue(solver.resolveInvalidIds("565653-565659").contains("565656"));
    }

    @Test
    public void resolveInvalidIds_withExampleTen_returnsCorrectStrings() {
        Assertions.assertEquals(1, solver.resolveInvalidIds("824824821-824824827").size());
        Assertions.assertTrue(solver.resolveInvalidIds("824824821-824824827").contains("824824824"));
    }

    @Test
    public void resolveInvalidIds_withExampleEleven_returnsCorrectStrings() {
        Assertions.assertEquals(1, solver.resolveInvalidIds("2121212118-2121212124").size());
        Assertions.assertTrue(solver.resolveInvalidIds("2121212118-2121212124").contains("2121212121"));
    }
}
