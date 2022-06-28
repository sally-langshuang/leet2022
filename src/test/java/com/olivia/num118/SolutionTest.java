package com.olivia.num118;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    private static class Case {
        public int id;
        public int rowNum;
        public List<List<Integer>> expect;

        public Case(int id, int rowNum, List<List<Integer>> expect) {
            this.id = id;
            this.rowNum = rowNum;
            this.expect = expect;
        }
    }

    private final List<Case> cases = List.of(
            new Case(
                    0,
                    5,
                    List.of(
                            List.of(1),
                            List.of(1, 1),
                            List.of(1,2,1),
                            List.of(1,3,3,1),
                            List.of(1,4,6,4,1)
                    )),
            new Case(
                    1,
                    1,
                    List.of(List.of(1))
            )
    );

    @Test
    public void testCases() {
        for (Case aCase : cases) {
            List<List<Integer>> actual = new Solution().generate(aCase.rowNum);
            if (aCase.expect.equals(actual)) {
                System.out.printf("case %d: well done!", aCase.id);
            } else {
                System.out.printf("case %d: actual %s != expected %s!\n", aCase.id, actual, aCase.expect);
            }
        }
    }
}
