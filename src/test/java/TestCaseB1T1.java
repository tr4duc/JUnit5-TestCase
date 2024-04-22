
import com.mycompany.mavenproject1.UtilsBai1Tuan1;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ltd13
 */
public class TestCaseB1T1 {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("BEFORE ALL");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("AFTER ALL");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("BEFORE EACH");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("AFTER EACH");
    }
    @Test
    public void TestNtChan(){
        int n = 2;
        boolean expected = true;
        boolean actual = UtilsBai1Tuan1.ktNt(n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void TestNtLe(){
        int n = 5;
        
        boolean actual = UtilsBai1Tuan1.ktNt(n);
        
        Assertions.assertTrue(actual);
    }
}
