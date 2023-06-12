/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exterminators;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class ExterminatorsTest {
    
    public ExterminatorsTest() {
    }
    /**
     * Test of main method, of class Exterminators.
     */
    @Test
    public void testMatrixTranspose() {
        int a = 3;
        int b = 2;
        
        int[][] mat = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
        int[][] expectedTransposedMatrix = {
            {1, 3, 5},
            {2, 4, 6}
        };
        
        int[][] trans = new int[b][a];
        
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                trans[i][k] = mat[k][i];
            }
        }
        
        assertArrayEquals(expectedTransposedMatrix, trans);
    }
    
}
