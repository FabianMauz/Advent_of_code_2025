package riddle_002;

import fmauz.advent_of_code_2025.riddle_002.IdResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Fabian Mauz
 */
public class IdResolverTest {

    @Test
    public void resolveInvalidIds_withRangesFromExample_returnsCorrectStrings() {
        IdResolver solver = new IdResolver();
        Assertions.assertEquals(2, solver.resolveInvalidIds("11-22").size());
        Assertions.assertTrue(solver.resolveInvalidIds("11-22").contains("11"));
        Assertions.assertTrue(solver.resolveInvalidIds("11-22").contains("22"));

        Assertions.assertEquals(1, solver.resolveInvalidIds("95-115").size());
        Assertions.assertTrue(solver.resolveInvalidIds("95-115").contains("99"));

        Assertions.assertEquals(1, solver.resolveInvalidIds("998-1012").size());
        Assertions.assertTrue(solver.resolveInvalidIds("998-1012").contains("1010"));

        Assertions.assertEquals(1, solver.resolveInvalidIds("1188511880-1188511890").size());
        Assertions.assertTrue(solver.resolveInvalidIds("1188511880-1188511890").contains("1188511885"));

        Assertions.assertEquals(1, solver.resolveInvalidIds("222220-222224").size());
        Assertions.assertTrue(solver.resolveInvalidIds("222220-222224").contains("222222"));

        Assertions.assertEquals(0, solver.resolveInvalidIds("1698522-1698528").size());

        Assertions.assertEquals(1, solver.resolveInvalidIds("446443-446449").size());
        Assertions.assertTrue(solver.resolveInvalidIds("446443-446449").contains("446446"));

        Assertions.assertEquals(1, solver.resolveInvalidIds("38593856-38593862").size());
        Assertions.assertTrue(solver.resolveInvalidIds("38593856-38593862").contains("38593859"));
    }
}
