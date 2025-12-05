package fmauz.advent_of_code_2025.riddle_003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class BankResolverPart2Test {

    @Test
    public void resolveBank_withInput818181911112111_returns888911112111() {
        BankResolverPart2 resolver = new BankResolverPart2();
        Assertions.assertEquals(888911112111L, resolver.resolveBank("818181911112111", 12));
    }

    @Test
    public void resolveBank_withInput987654321111111_returns987654321111() {
        BankResolverPart2 resolver = new BankResolverPart2();
        Assertions.assertEquals(987654321111L, resolver.resolveBank("987654321111111", 12));
    }

    @Test
    public void resolveBank_withInput234234234234278_returns434234234278() {
        BankResolverPart2 resolver = new BankResolverPart2();
        Assertions.assertEquals(434234234278L, resolver.resolveBank("234234234234278", 12));
    }

    @Test
    public void resolveBank_withInput811111111111119_returns811111111119() {
        BankResolverPart2 resolver = new BankResolverPart2();
        Assertions.assertEquals(811111111119L, resolver.resolveBank("811111111111119", 12));
    }
}
