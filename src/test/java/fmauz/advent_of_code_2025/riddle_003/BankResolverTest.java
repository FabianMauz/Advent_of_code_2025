package fmauz.advent_of_code_2025.riddle_003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class BankResolverTest {

    @Test
    public void resolveBank_withInput9781_returns98() {
        BankResolver resolver = new BankResolver();
        Assertions.assertEquals(98, resolver.resolveBank("9781"));

    }
}
