import com.mycompany.mavenproject1.Bai3Tuan1;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCaseB3T1 {
    
    @Test
    public void testSum() {
        // Test case 1: n = 5
        assertEquals(15, Bai3Tuan1.sumFrom1ToN(5));
        
        // Test case 2: n = 10
        assertEquals(55, Bai3Tuan1.sumFrom1ToN(10));
        
        // Test case 3: n = 0
        assertEquals(0, Bai3Tuan1.sumFrom1ToN(0));
    }
    
    @Test
    public void testEvenOdd() {
        // Test case 1: sum is even
        assertEquals("Tổng là số chẵn.", Bai3Tuan1.checkEvenOdd(10));
        
        // Test case 2: sum is odd
        assertEquals("Tổng là số lẻ.", Bai3Tuan1.checkEvenOdd(7));
    }
    
    @Test
    public void testInputValidation() {
        // Test case 1: Valid input (n = 15)
        assertTrue(Bai3Tuan1.validateInput("15"));
        
        // Test case 2: Invalid input (n = "abc")
        assertFalse(Bai3Tuan1.validateInput("abc"));
    }
}