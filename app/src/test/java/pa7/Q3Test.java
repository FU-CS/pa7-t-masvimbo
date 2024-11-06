package pa7;
import org.junit.jupiter.api.Test;
import PA7.Q3;

import static org.junit.jupiter.api.Assertions.*;

public class Q3Test{

    @Test 
    public void testMaxAreaNoIsland(){
        Q3 q3 = new Q3();
        char[][] input = {};
        int expectedOutput = 0;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);

    }
    @Test 
    public void testMaxArea1Island(){
        Q3 q3 = new Q3();
        char[][] input = {{'1'}};
        int expectedOutput = 1;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);

    }
    @Test 
    public void testMaxArea0Island(){
        Q3 q3 = new Q3();
        char[][] input = {{'0'}};
        int expectedOutput = 0;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);

    }
    @Test 
    public void testMaxArea0Islands(){
        Q3 q3 = new Q3();
        char[][] input = {
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int expectedOutput = 0;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);
    }
    @Test 
    public void testMaxArea1Islands(){
        Q3 q3 = new Q3();
        char[][] input = {
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'}
        };
        int expectedOutput = 25;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);
    }
    @Test
    public void testMultipleIslandsDifferentSizes() {
        Q3 q3 = new Q3();
        char[][] input = {
            {'1', '1', '0', '0', '0'},
            {'0', '1', '0', '0', '1'},
            {'1', '1', '0', '1', '1'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '1', '1', '1'}
        };
        int expectedOutput = 5; 
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);
    }
    @Test
    public void testLongIsland() {
        Q3 q3 = new Q3();
        char[][] input = {
            {'1', '0', '1', '1', '0'}
        };
        int expectedOutput = 2;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);
}

    @Test
    public void testNarrowIsland(){
        Q3 q3 = new Q3();
        char[][] input = {
            {'1'},
            {'0'},
            {'1'},
            {'1'},
            {'0'},
            {'1'}
        };
        int expectedOutput = 2;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);
    }
    @Test
    public void testEdgeIslands(){
        Q3 q3 = new Q3();
        char[][] input = {
            {'1', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '1'},
            {'1', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '1'},
            {'0', '0', '0', '0', '0'},
        };
        int expectedOutput = 1;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);
    }
    @Test
    public void testDiagonalIslands(){
        Q3 q3 = new Q3();
        char[][] input = {
            {'1', '0', '0', '0', '0'},
            {'0', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '0'},
            {'0', '0', '0', '0', '1'},
        };
        int expectedOutput = 1;
        int Output = q3.maxAreaOfIsland(input);
        assertEquals(expectedOutput, Output);
    }
}