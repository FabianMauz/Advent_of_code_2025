package fmauz.advent_of_code_2025.riddle_002;

import java.util.Set;

/**
 *
 * @author Fabian Mauz
 */
public class Riddle_002_Part2 {

    private static String input = "69810572-69955342,3434061167-3434167492,76756725-76781020,49-147,296131-386620,910523-946587,34308309-34358652,64542-127485,640436-659023,25-45,35313993-35393518,753722181-753795479,1544-9792,256-647,444628-483065,5863911-6054673,6969623908-6969778569,658-1220,12631-63767,670238-830345,1-18,214165106-214245544,3309229-3355697";

    public static void main(String[] args) {       
        IdResolverPart2 resolver = new IdResolverPart2();
        long sum = 0;
        for (String s : input.split(",")) {
            Set<String> invalidIds = resolver.resolveInvalidIds(s);
            for (String id : invalidIds) {
                sum += Long.parseLong(id);
            }
        }
        System.out.println("Sum of invalid ids " + sum);
    }
}
