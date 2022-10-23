import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithWithoutLambdaTest {

    @BeforeEach
    void setUp() {
        System.out.println("---------------------START TEST-------------------------");
    }

    @AfterEach
    void tearDown() {
        System.out.println("++++++++++++++++TEST COMPLEATED+++++++++++++++++++++++");
    }

    @Test
    void oneWithoutLambda() {
        WithWithoutLambda.oneWithoutLambda();
    }

    @Test
    void oneWithLambda() {
        WithWithoutLambda.oneWithoutLambda();
    }

    @Test
    void twoNoParamLambda() {
        WithWithoutLambda.twoNoParamLambda();
    }

    @Test
    void threeOneParamLambda() {
        WithWithoutLambda.threeOneParamLambda();
    }

    @Test
    void fourTwoParamLambda() {
        WithWithoutLambda.fourTwoParamLambda();
    }
    @Test
    void fiveForEachLoop() {
        WithWithoutLambda.fiveForEachLoop();
    }
    @Test
    void sixMultipleStatements() {
        WithWithoutLambda.sixMultipleStatements();
    }

    @Test
    void sevenThreadInLambda() {
        WithWithoutLambda.sevenThreadInLambda();
    }

    @Test
    void eightComparatorWithLambda() {
        WithWithoutLambda.eightComparatorWithLambda();
    }
    @Test
    void nineFilterCollectionData() {
        WithWithoutLambda.nineFilterCollectionData();
    }
}