import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTesting {
    public AppleTesting() {
    }

    @Test
    void test1() {
        Assertions.assertEquals(-1, Main.number_of_apples(0, 20));
    }

    @Test
    void test2() {
        Assertions.assertEquals(1, Main.number_of_apples(0, 1));
    }

    @Test
    void test3() {
        Assertions.assertEquals(4, Main.number_of_apples(0, 3));
    }

    @Test
    void test4() {
        Assertions.assertEquals(8, Main.number_of_apples(0, 5));
    }

    @Test
    void test4_2() {
        Assertions.assertEquals(16, Main.number_of_apples(0, 10));
    }

    @Test
    void test5() {
        Assertions.assertEquals(11, Main.number_of_apples(0, 7));
    }

    @Test
    void test5_2() {
        Assertions.assertEquals(9, Main.number_of_apples(0, 6));
    }


    @Test
    void test6() {
        Assertions.assertEquals(1, Main.number_of_apples(1, 1));
    }

    @Test
    void test7() {
        Assertions.assertEquals(6, Main.number_of_apples(1, 5));
    }

}
