package pa7;
import org.junit.jupiter.api.Test;
import PA7.Q2;

import static org.junit.jupiter.api.Assertions.*;

public class Q2Test{
    @Test
    public void testNoIslands(){
        Q2 q2 = new Q2();
        char[][] input = {};
        int expectedOutput = 0;
        int Output = q2.numberOfIslands(input);
        assertEquals(expectedOutput, Output);
    }

    @Test
    public void testSingleIsland(){
        Q2 q2 = new Q2();
        char[][] input = {{'1'}};
        int expectedOutput = 1;
        int Output = q2.numberOfIslands(input);
        assertEquals(expectedOutput, Output);
    }

    @Test
    public void test0island(){
        Q2 q2 = new Q2();
        char[][] input = {
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int expectedOutput = 0;
        int Output = q2.numberOfIslands(input);
        assertEquals(expectedOutput, Output);
    }
    
    @Test
    public void test1Island(){
        Q2 q2 = new Q2();
        char[][] input = {
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'}
        };
        int expectedOutput = 1;
        int Output = q2.numberOfIslands(input);
        assertEquals(expectedOutput, Output);
    }
    @Test
    public void testIslands(){
        Q2 q2 = new Q2();
        char[][] input = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '1'},
            {'0', '0', '0', '1', '1'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '1', '1'},
        };
        int expectedOutput = 3;
        int Output = q2.numberOfIslands(input);
        assertEquals(expectedOutput, Output);
    }
    @Test
    public void testNarrowIsland(){
        Q2 q2 = new Q2();
        char[][] input = {
            {'1'},
            {'0'},
            {'1'},
            {'1'},
            {'0'},
            {'1'}
        };
        int expectedOutput = 3;
        int Output = q2.numberOfIslands(input);
        assertEquals(expectedOutput, Output);
    }
    @Test
    public void testEdgeIslands(){
        Q2 q2 = new Q2();
        char[][] input = {
            {'1', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '1'},
            {'1', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '1'},
            {'0', '0', '0', '0', '0'},
        };
        int expectedOutput = 4;
        int Output = q2.numberOfIslands(input);
        assertEquals(expectedOutput, Output);
    }
    @Test
    public void testDiagonalIslands(){
        Q2 q2 = new Q2();
        char[][] input = {
            {'1', '0', '0', '0', '0'},
            {'0', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '0'},
            {'0', '0', '0', '0', '1'},
        };
        int expectedOutput = 5;
        int Output = q2.numberOfIslands(input);
        assertEquals(expectedOutput, Output);
    }

}