package pa7;
import org.junit.jupiter.api.Test;
import PA7.Q1;

import static org.junit.jupiter.api.Assertions.*;

public class Q1Test {

    @Test
    public void testRotateEmptyImage(){
        Q1 q1 = new Q1();

        int[][] input = {};
        int [][] expectedOutput = {};
        q1.rotateImage(input);
        assertArrayEquals(expectedOutput, input);
    }
    @Test
    public void testRotateSingleImage(){
        Q1 q1 = new Q1();

        int[][] input = {{1}};
        int [][] expectedOutput = {{1}};
        q1.rotateImage(input);
        assertArrayEquals(expectedOutput, input);
    }
    @Test
    public void testRotate2x2Image() {
        Q1 q1 = new Q1();
        
        int[][] input = { 
            {1, 2}, 
            {3, 4} 
        };
        int[][] expectedOutput = { 
            {3, 1}, 
            {4, 2} 
        };
        q1.rotateImage(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testRotateNegativeImage(){
        Q1 q1 = new Q1();
        
        int[][] input = { 
            {-1, -2}, 
            {-3, -4} 
        };
        int[][] expectedOutput = { 
            {-3, -1}, 
            {-4, -2} 
        };
        q1.rotateImage(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testRotateMixedImage(){
        Q1 q1 = new Q1();
        
        int[][] input = { 
            {-1, 2}, 
            {3, -4} 
        };
        int[][] expectedOutput = { 
            {3, -1}, 
            {-4, 2} 
        };
        q1.rotateImage(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testRotateLargerImage(){
        Q1 q1 = new Q1();
        
        int[][] input = { 
            {1, 2, 3, 4, 5, 6}, 
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };
        int[][] expectedOutput = { 
            
            {31, 25, 19, 13,  7,  1},
            {32, 26, 20, 14,  8,  2},
            {33, 27, 21, 15,  9,  3},
            {34, 28, 22, 16, 10,  4},
            {35, 29, 23, 17, 11,  5},
            {36, 30, 24, 18, 12,  6}
            
            
        };
        q1.rotateImage(input);
        assertArrayEquals(expectedOutput, input);
    }
    
}
