package com.company;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.Time;

public class TestArithmetics {
    private Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @Before
    public void runT(){
        a = new Arithmetics();
    }

    @Test
    public void testAdd() {
        Arithmetics a = new Arithmetics();
        double ress = a.add(3, 7);
        /*Assert.assertFalse(ress == 1);
        Assert.assertTrue(ress == 10);
        Assert.assertNull(a);
        * */
        Assert.assertEquals(ress, 10, 0);
    }
    @Test
    public void testMul() {
        Arithmetics a = new Arithmetics();
        double ress = a.mult(3, 7);
        Assert.assertEquals(ress, 21, 0);
    }
    @Ignore
    @Test
    public void testDeduct() {
        Arithmetics a = new Arithmetics();
        double ress = a.deduct(3, 7);
        Assert.assertEquals(ress, -4, 0);
    }
    @Test
    public void testDiv() {
        Arithmetics a = new Arithmetics();
        double ress = a.div(10, 5);
        Assert.assertEquals(ress, 2, 0);
    }
    @Test(expected=ArithmeticException.class)
    public void testDivException(){
        a.div(2,0);
        exp.expect(ArithmeticException.class);
    }
    @Test
    public void N(){
        while(true) { }
    }
}



