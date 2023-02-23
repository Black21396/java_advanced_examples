package junit_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
    * this class responsaple for making test
    * every test class, we have to put @Test
    * @BeforeAll: will execute firstly, the method must be static
    * @AfterAll: will execute after all other test methods
    * @BeforeEach: will execute before each test method
    * @AfterEach: will execute after each test method
    * assertEquals(expected, the real value)
    * assertNotEquals(expected, the real value)
    * assertArrayEquals(expected as array, real value as array)
 
 */
class MainTest {

    private static Main main;
    @BeforeAll
    public static void initObj(){
        System.out.println("Test is beginning");
        main = new Main();
    }

    @Test
    public void testSort(){
        int[] a = {1,2,2,4};
        assertArrayEquals(a, main.sortArray(new int[]{4,2,1,2}));
    }

    @Test
    public void testMultiplication(){
        assertEquals(12, main.multiplication(4,3));
    }

    @AfterAll
    public static void afterAllTesting(){
        System.out.println("The test methods is end!");
    }
}